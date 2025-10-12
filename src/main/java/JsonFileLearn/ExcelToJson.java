package JsonFileLearn;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class ExcelToJson {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Read Excel and convert to JSON structure
    public Map<String, List<Map<String, Object>>> getClaimsData(String fileName) throws Exception {
        Map<String, List<Map<String, Object>>> testData = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(new File(fileName));
             Workbook workbook = new XSSFWorkbook(fis)) {

            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                Sheet sheet = workbook.getSheetAt(i);
                List<Map<String, Object>> sheetData = new ArrayList<>();

                Iterator<Row> rowIterator = sheet.iterator();
                List<String> headers = new ArrayList<>();

                // Read header row
                if (rowIterator.hasNext()) {
                    Row headerRow = rowIterator.next();
                    for (Cell cell : headerRow) {
                        headers.add(cell.getStringCellValue());
                    }
                }

                // Read data rows
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Map<String, Object> rowData = new HashMap<>();

                    for (int j = 0; j < headers.size(); j++) {
                        Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

                        switch (cell.getCellType()) {
                            case STRING -> rowData.put(headers.get(j), cell.getStringCellValue());
                            case NUMERIC -> {
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    rowData.put(headers.get(j), cell.getDateCellValue().toString());
                                } else {
                                    rowData.put(headers.get(j), cell.getNumericCellValue());
                                }
                            }
                            case BOOLEAN -> rowData.put(headers.get(j), cell.getBooleanCellValue());
                            case FORMULA -> {
                                switch (cell.getCachedFormulaResultType()) {
                                    case STRING -> rowData.put(headers.get(j), cell.getStringCellValue());
                                    case NUMERIC -> {
                                        if (DateUtil.isCellDateFormatted(cell)) {
                                            rowData.put(headers.get(j), cell.getDateCellValue().toString());
                                        } else {
                                            rowData.put(headers.get(j), cell.getNumericCellValue());
                                        }
                                    }
                                    case BOOLEAN -> rowData.put(headers.get(j), cell.getBooleanCellValue());
                                    default -> rowData.put(headers.get(j), cell.toString());
                                }
                            }
                            case BLANK -> rowData.put(headers.get(j), "");
                            default -> rowData.put(headers.get(j), cell.toString());
                        }
                    }

                    sheetData.add(rowData);
                }

                testData.put(sheet.getSheetName(), sheetData);
            }
        }

        return testData;
    }

    // Get a single test case (first match)
    public Map<String, Object> getSingleTestCase(Map<String, List<Map<String, Object>>> jsonData, String sheetName, String testCaseName) {
        return jsonData.getOrDefault(sheetName, new ArrayList<>())
                .stream()
                .filter(item -> testCaseName.equals(item.get("TC_ID")))
                .findFirst()
                .orElse(new HashMap<>());
    }

    // Get multiple test cases (all matches)
    public List<Map<String, Object>> getMultipleTestCase(Map<String, List<Map<String, Object>>> jsonData, String sheetName, String testCaseName) {
        return jsonData.getOrDefault(sheetName, new ArrayList<>())
                .stream()
                .filter(item -> testCaseName.equals(item.get("TC_ID")))
                .toList();
    }

    // Collect all test case data
    public Map<String, Object> getClaimsTestCase(Map<String, List<Map<String, Object>>> jsonData, String testCaseName) {
        Map<String, Object> claimsData = new HashMap<>();
        claimsData.put("basicInfo", getSingleTestCase(jsonData, "basicInfo", testCaseName));
        claimsData.put("tempPolicy", getSingleTestCase(jsonData, "tempPolicy", testCaseName));
        claimsData.put("lossDetails", getSingleTestCase(jsonData, "lossDetails", testCaseName));
        claimsData.put("propertyDamage", getMultipleTestCase(jsonData, "propertyDamage", testCaseName));
        claimsData.put("vehicleIncident", getMultipleTestCase(jsonData, "vehicleIncident", testCaseName));
        claimsData.put("injuryIncident", getMultipleTestCase(jsonData, "injuryIncident", testCaseName));
        claimsData.put("contact", getMultipleTestCase(jsonData, "contact", testCaseName));
        claimsData.put("exposure", getMultipleTestCase(jsonData, "exposure", testCaseName));
        claimsData.put("services", getSingleTestCase(jsonData, "services", testCaseName));
        claimsData.put("postFNOLLossDetails", getSingleTestCase(jsonData, "postFNOLLossDetails", testCaseName));
        claimsData.put("claimDetails", getSingleTestCase(jsonData, "claimDetails", testCaseName));
        claimsData.put("postFNOLStatus", getSingleTestCase(jsonData, "postFNOLStatus", testCaseName));
        return claimsData;
    }

    public static void main(String[] args) {
        try {
            ExcelToJson helper = new ExcelToJson();

            // Step 1: Read Excel into JSON-like structure
            Map<String, List<Map<String, Object>>> fullData = helper.getClaimsData("ClaimCreate_TestData.xlsx");

            // Step 2: Write to claims.json
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("claims.json"), fullData);

            // Step 3: Load specific test case
            Map<String, Object> claims = helper.getClaimsTestCase(fullData, "DefaultClaimsData");

            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(claims));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Learn_Exel {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File file = new File("C:\\demo\\employee.xlsx");   //creating a new file instance  
			FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
			//creating Workbook instance that refers to .xlsx file  
			XSSFWorkbook wb = new XSSFWorkbook(fis);   
			XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
			Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
			while (itr.hasNext())                 
			{  
			Row row = itr.next();  
			Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
			while (cellIterator.hasNext())   
			{  
			Cell cell = cellIterator.next();  
			switch (cell.getCellType()) {  
		    case STRING:    // field that represents string cell type  
		        System.out.print(cell.getStringCellValue() + "\t\t\t");  
		        break;  
		    case NUMERIC:   // field that represents numeric cell type  
		        System.out.print(cell.getNumericCellValue() + "\t\t\t");  
		        break;  
		    default:  
		        // optional: handle BOOLEAN, FORMULA, BLANK, ERROR
		        break;
		}  
			}  
			System.out.println("");  
			}  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}

package Learn_Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_new {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//Create blank workbook
	      XSSFWorkbook workbook = new XSSFWorkbook(); 

	      //Create a blank sheet
	      XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");
	      
	      System.out.println();

	      //Create row object
	      XSSFRow row;
	      
	      
	      spreadsheet = workbook.createSheet();
			row = spreadsheet.createRow(0);
			row.createCell(0).setCellValue("TestStatus");
			row.createCell(1).setCellValue("Script");
			row.createCell(2).setCellValue("there");
			row.createCell(3).setCellValue("hello");
			

				
			//			Cell1=Row1.createCell(columnIndex)
			row.createCell(5).setCellValue(3);

			row.createCell(5).setCellValue(4);
					
	      
	      FileOutputStream out = new FileOutputStream(new File("Writesheet1.xlsx"));
	      workbook.write(out);
	      out.close();
	      System.out.println("Writesheet.xlsx written successfully");
		
		

	}

}

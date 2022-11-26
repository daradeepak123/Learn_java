import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import javax.mail.util.SharedFileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Learn_excel_ {
	
	@Test()
	public void Learn_excel_new()
	

	{
		try
		{
		File file=new File("C:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht= wb.getSheet("Sheet1");
		
		//now print all the data present in the sheet
		
		Iterator<Row> itr=sht.iterator();
		while (itr.hasNext())                 
		{  
		Row row = itr.next();  
		Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
		while (cellIterator.hasNext())   
		{  
		Cell cell = cellIterator.next();  
		switch (cell.getCellType())               
		{  
		case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
		System.out.print(cell.getStringCellValue() + "\t\t\t");  
		break;  
		case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type  
		System.out.print(cell.getNumericCellValue() + "\t\t\t");  
		break;  
		default:  
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

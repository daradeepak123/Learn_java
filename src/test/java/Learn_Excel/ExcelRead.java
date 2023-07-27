package Learn_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
	public static void main(String args[]) throws IOException
	{
		File file=new File("C:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		String data=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<5;j++)
			{
				
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+ "\t\t\t");
			
				
			}
			System.out.println();
		}
		
	}
	

}

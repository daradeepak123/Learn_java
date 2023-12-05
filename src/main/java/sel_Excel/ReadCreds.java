package sel_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCreds {
	
	
	
	public static String creds(int row,int col) throws IOException
	{
		File file=new File("C:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(1);
		
		String str=sheet.getRow(row).getCell(col).toString();
		return str;
	}
	
	
	
	

}

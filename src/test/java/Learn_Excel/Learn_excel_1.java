package Learn_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Learn_excel_1 {
	
	@Test()
	public void Learn_excel_new()
	{
		try
		{
		File file=new File("C:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht=wb.getSheet("Sheet1");
		Iterator<Row> itr=sht.iterator();
		
		while(itr.hasNext())
		{
			Row row=itr.next();
			Iterator<Cell> celliterator=row.cellIterator();
			while(celliterator.hasNext())
			{
				Cell cell=celliterator.next();
				switch (cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
				{
					System.out.print(cell.getStringCellValue() + "\t\t\t");
					break;
				}
				case Cell.CELL_TYPE_NUMERIC:
				{
					System.out.print(cell.getNumericCellValue() + "\t\t\t");
					break;
				}
				default:
				{
					
				}
				
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

package seliniumdemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excel_run_apps {
	
	
	
	@Test
	public void test()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		File file=new File(System.getProperty("user.dir")+"//Excel_docs//Untitledspreadsheet.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Login_Check");
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		String str=sheet.getRow(0).getCell(0).toString();
		System.out.println(str);
		
		for(int i=1;i<rowCount;i++)
		{
			
			driver.get(sheet.getRow(i).getCell(1).getStringCellValue());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath(sheet.getRow(i).getCell(2).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
			driver.findElement(By.xpath(sheet.getRow(i).getCell(3).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
			driver.findElement(By.xpath(sheet.getRow(i).getCell(4).getStringCellValue())).click();
			if(driver.findElement(By.xpath(sheet.getRow(i).getCell(7).getStringCellValue())).isDisplayed()) {
				System.out.println("Login success");
				sheet.getRow(i).createCell(8).setCellValue("LOgin SUccess");
			}
			
			
		}
		
		
		
		
		}
		catch(Exception e)
		{
			e.getStackTrace();
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}

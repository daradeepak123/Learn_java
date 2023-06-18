package seliniumdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_run_apps {
	
	
	
	@Test
	public void test()
	{
		try
		{
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		File file=new File(System.getProperty("user.dir")+"//Excel_docs//Untitledspreadsheet.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Login_Check");
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		String str=sheet.getRow(0).getCell(0).toString();
		System.out.println(str);
		
		for(int i=1;i<rowCount+1;i++)
		{
			
			driver.get(sheet.getRow(i).getCell(1).getStringCellValue());
			System.out.println(sheet.getRow(i).getCell(1).getStringCellValue().toString());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath(sheet.getRow(i).getCell(2).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
			driver.findElement(By.xpath(sheet.getRow(i).getCell(3).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
			driver.findElement(By.xpath(sheet.getRow(i).getCell(4).getStringCellValue())).click();
			if(driver.findElement(By.xpath(sheet.getRow(i).getCell(7).getStringCellValue())).isDisplayed()) {
				System.out.println("Login success");
				sheet.getRow(i).createCell(8).setCellValue("LOgin SUccesss");
				FileOutputStream out = new FileOutputStream(new File("Writesheet.xlsx"));
			      wb.write(out);
			      out.close();
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

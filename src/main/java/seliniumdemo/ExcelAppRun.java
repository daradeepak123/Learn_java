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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExcelAppRun {
	
	
	WebDriver driver;
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		try {
			File file=new File(System.getProperty("user.dir")+"\\Excel_docs\\Untitledspreadsheet.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("vb");
			int rowsSize=sheet.getLastRowNum()-sheet.getFirstRowNum();
			for(int i=0;i<=rowsSize;i++) {
				System.out.println("We r Going to login" +sheet.getRow(i).getCell(0).getStringCellValue());
				driver.get(sheet.getRow(i).getCell(1).getStringCellValue());
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath(sheet.getRow(i).getCell(2).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
				driver.findElement(By.xpath(sheet.getRow(i).getCell(3).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
				driver.findElement(By.xpath(sheet.getRow(i).getCell(4).getStringCellValue())).click();
				if(driver.findElement(By.xpath(sheet.getRow(i).getCell(2).getStringCellValue())).isDisplayed()) {
					System.out.println("Login success");
					sheet.getRow(i).createCell(8).setCellValue("LOgin SUccess");
				}
			}
			FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);
			wb.close();
		}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}

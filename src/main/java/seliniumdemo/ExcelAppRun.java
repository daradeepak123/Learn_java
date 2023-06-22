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

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelAppRun {
	
	
	WebDriver driver;
	@BeforeClass
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.close();
        Runtime.getRuntime().exec("taskkill /F /IM ChromeDriverServer.exe");
	}

	@Test
	public void test() {
		try {
			File file=new File(System.getProperty("user.dir")+"\\Excel_docs\\Untitledspreadsheet.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("vb");
			int rowsSize=sheet.getLastRowNum()-sheet.getFirstRowNum();
			System.out.println(rowsSize);
			for(int i=1;i<=rowsSize;i++) {
				System.out.println("We r Going to login" +sheet.getRow(i).getCell(0).getStringCellValue());
				driver.get(sheet.getRow(i).getCell(1).getStringCellValue());
				driver.findElement(By.xpath(sheet.getRow(i).getCell(2).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
				driver.findElement(By.xpath(sheet.getRow(i).getCell(3).getStringCellValue())).sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
				driver.findElement(By.xpath(sheet.getRow(i).getCell(4).getStringCellValue())).click();
				if(driver.findElement(By.xpath(sheet.getRow(i).getCell(7).getStringCellValue())).isDisplayed()) {
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

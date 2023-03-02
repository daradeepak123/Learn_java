package seliniumdemo;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf_screenshot {
	WebDriver driver;
	Document doc=new Document(PageSize.A4,20,20,20,20);
	
	
	public void srcShotPdf()
	{
		try {
		File screenshot15=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot15, new File("screenshot.jpg"));
		Image image15=Image.getInstance("screenshot.jpg");
		image15.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		doc.add(image15);
		doc.addSubject("Aded Screenshots");
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	@Test
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.mercury.com/payments\r\n");
				
		driver.manage().window().maximize();
		PdfWriter.getInstance(doc, new FileOutputStream(System.getProperty("user.dir")+"\\PDF_Folder\\result.pdf"));
		
		
		doc.open();
		doc.add(new Chunk());
		doc.addCreator("Deepak");
		doc.addAuthor("Deepak");
		//HOME
		System.out.println("test starts here");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/nav/div[1]/a")).click();
		Thread.sleep(2000);
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("screenshot.jpg"));
		Image image=Image.getInstance("screenshot.jpg");
		image.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		doc.add(image);
		doc.addSubject("Added Screenshots");
		
		
		//TRANSACTIONS
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/nav/div[2]/a")).click();
		File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File("screenshot.jpg"));
		Image image1=Image.getInstance("screenshot.jpg");
		image1.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		doc.add(image1);
		doc.addSubject("Added Screenshots");
		
		
       //CARDS
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/nav/div[4]/a")).click();
		Thread.sleep(2000);File screenshot11=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot11, new File("screenshot.jpg"));
		Image image11=Image.getInstance("screenshot.jpg");
		image11.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		doc.add(image11);
		doc.addSubject("Added Screenshots");
		
		//CREDIT
       driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/nav/div[5]/a")).click();
        Thread.sleep(2000);
         File screenshot12=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot12, new File("screenshot.jpg"));
		Image image12=Image.getInstance("screenshot.jpg");
		image12.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		doc.add(image12);
		doc.addSubject("Added Screenshots");
        
		//TREASURY
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/nav/div[6]/a")).click();
        Thread.sleep(2000);
        File screenshot13=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot13, new File("screenshot.jpg"));
		Image image13=Image.getInstance("screenshot.jpg");
		image13.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		doc.add(image13);
		doc.addSubject("Added Screenshots");
        
        
		//CAPITAL
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/nav/div[7]/a")).click();
        Thread.sleep(2000);
        File screenshot14=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot14, new File("screenshot.jpg"));
		Image image14=Image.getInstance("screenshot.jpg");
		image14.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		doc.add(image14);
		doc.addSubject("Aded Screenshots");
		
		//ACCOUNT
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/nav/div[8]/div[1]/a/div")).click();
		Thread.sleep(2000);
		srcShotPdf();
		
		doc.close();
		
	}

}
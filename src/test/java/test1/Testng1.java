package test1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng1 {

	WebDriver d;
	@AfterTest
	public void quit() {
		d.quit();
	}

	@Test(priority = 2)
	public void ResizableLinkVerification() {

		d.findElement(By.xpath("//a[text()='Resizable']")).click();
		assertEquals(d.findElement(By.xpath("//h1[text()='Resizable']")).getText(), "Resizable");
		
		//System.out.println(d.findElement(By.xpath("//h1[text()='Menu']")).getText().equals("Menu"));
	}
	
	@Test(priority = 3)
	public void SelectableVerification() {
		d.findElement(By.xpath("//a[text()='Selectable']")).click();
		
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(d.findElement(By.xpath("//h1[text()='Selectable']")).getText(), "Sectable");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//li[text()='Item 1']")).click();
		assertEquals(d.findElement(By.xpath("//li[text()='Item 1']")).getAttribute("class").contains("ui-selected"),true);
		//System.out.println(d.findElement(By.xpath("//h1[text()='Menu']")).getText().equals("Menu"));
		sf.assertAll();
		d.switchTo().defaultContent();
	}
	
	
	
	@BeforeTest
	public void browsersetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AutomationTesting\\drivers\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		 d.get("https://jqueryui.com/menu/");
			d.manage().window().maximize();
	}
	
	

}

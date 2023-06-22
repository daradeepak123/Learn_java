package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cyclos {
String s = "test";
	WebDriver d;
	
	@Test(priority = 1)
	public void login()   {
		//Thread.sleep(3000);
		d.findElement(By.id("login-link")).click();
		d.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Demoitest");
		d.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("123456");
		d.findElement(By.xpath("//action-button[@actionkind='primary']/button")).click();
	}
	
	@Test(priority = 2)
	public void Payment() {
		
		d.findElement(By.xpath("//a[@href=\"/banking/self/payment\"]")).click();
	}
	
	
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AutomationTesting\\drivers\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.get("https://demo.cyclos.org/ui/home");
		d.manage().window().maximize();
		
		
	}
}

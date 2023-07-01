package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
	WebDriverWait wait;
	WebDriver d;
	@Test(priority = 1)
	public void clickbutton() {
		
		d.findElement(By.id("alertButton")).click();
	}
	@Test(priority = 2)
	public void AlertVerify() {
		
		//Alert alert = (Alert) d.switchTo().alert();
		
		System.out.println(d.switchTo().alert().getText());
		
		d.switchTo().alert().accept();
		d.findElement(By.id("confirmButton")).click();
		d.switchTo().alert().dismiss();
		
	}
	@Test(priority = 3)
	public void text() {
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		
		js.executeScript("window.scrollBy(0,300)", "");
		
		d.findElement(By.id("promtButton")).click();
		//d.findElement(By.id("promtButton")).click();
		d.switchTo().alert().sendKeys("Hello Welcome");
		d.switchTo().alert().dismiss();
		
	//THis is test
		
	}
	@Test(priority = 4)
	public void waittext() {
		
		d.findElement(By.id("timerAlertButton")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		d.switchTo().alert().accept();
	}
	
	@BeforeTest
	public void launch() {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		d = new ChromeDriver();
		 d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
	}
}

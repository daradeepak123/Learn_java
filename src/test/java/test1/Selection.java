package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selection {

	WebDriver d;
	WebDriverWait wait ;
	
	
	
	/*
	 * @Test public void selectDropdown() {
	 * 
	 * d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).
	 * click();
	 * 
	 * 
	 * WebElement selectElement = d.findElement(By.id("day")); //Actions ac = new
	 * Actions(d);
	 * 
	 * //ac.moveToElement(selectElement).build().perform(); Select sc = new
	 * Select(selectElement);
	 * 
	 * sc.selectByVisibleText("20");
	 * 
	 * sc = new Select(d.findElement(By.id("month")));
	 * 
	 * sc.selectByIndex(1);
	 * 
	 * sc = new Select(d.findElement(By.id("year")));
	 * 
	 * sc.selectByValue("2001");
	 * 
	 * 
	 * }
	 */	
	Select sc ;
	public void datepicker(WebDriver d,String Month, String date, String Year) {
		
		
		sc = new Select(d.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		sc.selectByVisibleText(Month);
		
		sc = new Select(d.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		sc.selectByVisibleText(Year);
		
		d.findElement(By.xpath("//div[not(contains(@class,'--outside-month')) and text()='"+date+"']")).click();

	}
	
	@Test
	public void date() {
		
		d.findElement(By.id("datePickerMonthYearInput")).click();
		Selection st = new Selection();
		st.datepicker(d,"January", "2", "2015");
		
	}
	
	@BeforeTest
	public void launc() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AutomationTesting\\drivers\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.get("https://demoqa.com/date-picker");
		d.manage().window().maximize();
		
	}
}

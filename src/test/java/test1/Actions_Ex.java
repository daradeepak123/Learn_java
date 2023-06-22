package test1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_Ex {

	WebDriver d;
	WebDriverWait wait ;
	Actions ac ;
	
	
	  @AfterTest
	  public void close() {
		  d.close(); }
	 
	@Test(priority = 1)
	public void DragDrop() {
		d.switchTo().frame(0);
		WebElement source = d.findElement(By.id("draggable"));
		
		WebElement destination = d.findElement(By.id("droppable"));
		
		ac = new Actions(d);
		
		ac.dragAndDrop(source, destination).build().perform();
		d.switchTo().defaultContent();
	}
	@Test(priority = 2)
	public void sort() {
		d.findElement(By.xpath("//a[@href=\"http://jqueryui.com/sortable/\"]")).click();
		d.switchTo().frame(0);
		
		//List <WebElement> lis = d.findElements(By.xpath("//ul[@id='sortable']/li"));
		String text = d.findElement(By.xpath("//ul[@id='sortable']/li")).getText();
		WebElement source = d.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement destination = d.findElement(By.xpath("//li[text()='Item 2']"));
		ac.click(source).clickAndHold().moveToElement(destination).moveByOffset(0, 10).release().build().perform();
		List <WebElement> lisupdated = d.findElements(By.xpath("//ul[@id='sortable']/li"));
		String updatedtext = d.findElement(By.xpath("//ul[@id='sortable']/li")).getText();
		assertNotEquals(text, updatedtext);
		
		d.switchTo().defaultContent();
		
	}
	@Test(priority = 3)
	public void Resize() {
		d.findElement(By.xpath("//a[@href=\"http://jqueryui.com/resizable/\"]")).click();
		d.switchTo().frame(0);
		ac.click(d.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"))).clickAndHold().moveByOffset(0, 40).release().build().perform();
		
	}
	@BeforeTest
	public void launc() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
	}
	
	
	@Test(priority = 5)
	public void winscrol() throws InterruptedException {
		
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	
		Thread.sleep(3000);
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		
	}
}

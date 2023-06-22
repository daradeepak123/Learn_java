package test1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class firstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AutomationTesting\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/button/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(driver.findElement(By.xpath("//div[@class='widget']//h1")).getText(), "Widg Buttons");
		/*
		 * String text =
		 * driver.findElement(By.xpath("//div[@class='widget']//h1")).getText();
		 * System.out.println(text.equals("Widget Buttons"));
		 */

		driver.findElement(By.xpath("//div[@class='widget']//button")).click();
		boolean re = driver.findElement(By.xpath("//div[@class='widget']//button")).isSelected();
		System.out.println("Buuton Result : " + re);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[text()='New York']")).click();
		boolean result =driver.findElement(By.xpath("//label[text()='New York']")).getAttribute("class").contains("checked ui-state-active");
		System.out.println("radio Result : "+result);
		/*
		 * driver.findElement(By.id("session_key")).sendKeys("Testing@gmail.com");
		 * driver.findElement(By.id("session_password")).sendKeys("test@123");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */
		//driver.findElement(By.id("onetrust-accept-btn-")).click();
		/*
		 * driver.findElement(By.name("search_query")).sendKeys("Manual Testing");
		 * driver.findElement(By.id("search-icon-legacy")).click(); Thread.sleep(3000);
		 * driver.findElement(By.partialLinkText("Manual Testing")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("segmented-like-button")).click();
		 */
		 	sf.assertAll();
	
	}

}

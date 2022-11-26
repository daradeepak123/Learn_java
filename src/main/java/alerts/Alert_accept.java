package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_accept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 
		 
		 ChromeOptions options =new ChromeOptions();
		 options.addArguments("disable-notifications");
		 options.addArguments("disable-media-stream");
		 options.addArguments("disable-geolocations");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        
	        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.switchTo().alert().accept();
	        
	        driver.switchTo().alert().sendKeys("");


	}

}

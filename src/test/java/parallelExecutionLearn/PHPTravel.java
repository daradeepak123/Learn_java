package parallelExecutionLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PHPTravel {
	@Test
	public void dPicker() throws InterruptedException
	{
		String Month="July 2025";
		
		String Day="31";
		
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/");
		
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second explicit wait

		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='depart'])[1]")));
		//driver.findElement(By.xpath("(//input[@name='depart'])[1]")).click();
		button.click();
		String currentMonth=driver.findElement(By.xpath("//*[@id='fadein']/div[10]/div[1]/table/thead/tr[1]/th[2]")).getText();
				
		System.out.println(currentMonth);
		Thread.sleep(4000);
		
		while(true)
		{
		String Current_month=
				driver.findElement(By.xpath("//*[@id='fadein']/div[10]/div[1]/table/thead/tr[1]/th[2]")).getText();
		System.out.println(Current_month);
		if (Current_month.equals(Month))
		{
		
			break;
		
		}
		else
		{
			
			driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[10]/div[1]/table/thead/tr[1]/th[3]")).click();
		}
		}
		
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[10]/div[1]/table/tbody/tr[3]/td[3]")).click();
		
		driver.quit();
		
	}
	
	


}

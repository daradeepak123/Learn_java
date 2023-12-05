package parallelExecutionLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	@Test
	public void hello() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/grid/");
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}

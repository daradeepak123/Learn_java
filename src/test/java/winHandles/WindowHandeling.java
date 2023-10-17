package winHandles;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandeling {
	
	static WebDriver d;
	String parent;
	String second;
	
	@BeforeTest
	public void launch() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
			
		 d = new ChromeDriver();
		 d.get("https://the-internet.herokuapp.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		parent = d.getWindowHandle();
	}
	
	@Test
	public void tstWindowHandle()
	{

		List<WebElement> links=d.findElements(By.xpath("//a"));
		
		for(WebElement ele: links)
		{
			String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ele.sendKeys(clicklnk);
		}
		
		Set<String> wins=d.getWindowHandles();
		for(String s:wins)
		{
			if(!parent.equals(s))
			{
			d.switchTo().window(s);
			System.out.println(d.getCurrentUrl());
			d.close();
			}
		}
		d.switchTo().window(parent);
	}
	

}

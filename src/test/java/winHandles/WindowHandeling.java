package winHandles;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandeling {
	
	WebDriver d;
	String parent;
	String second;
	
	@BeforeTest
	public void launch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.get("https://the-internet.herokuapp.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
			d.switchTo().window(s);
			d.close();
		}
		d.switchTo().window(parent);
	}
	

}

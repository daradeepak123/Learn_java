package gridLearn;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTrail {
	
	
	@Test
	public void testGrid() throws MalformedURLException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN10);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.7:4443/"),caps);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/grid/");
		System.out.println(driver.getTitle());
	}
	

}

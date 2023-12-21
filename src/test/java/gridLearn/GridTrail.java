package gridLearn;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTrail {
	
	
	@Test
	public void testGrid() throws MalformedURLException
	{

		ChromeOptions options=new ChromeOptions();
		options.addArguments("chrome");
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN10);
		
		
		
		//{"browserName":"chrome","goog:chromeOptions":{"args":["--remote-allow-origins=*"]},"platformName":"Windows 11"}
		
		
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/grid/console/hub"),new EdgeOptions());
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/grid/");
		System.out.println(driver.getTitle());
	}
	

}

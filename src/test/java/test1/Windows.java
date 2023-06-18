package test1;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windows {

	
	WebDriver d;
	String parent;
	String second;
	@Test
	public void window () {
		
		d.findElement(By.id("tabButton")).click();
		Set<String> windows = d.getWindowHandles();
		System.out.println(windows);
		for(String win:windows) {
			
			if(!win.equals(parent)) {
				second=win;
				d.switchTo().window(win);
				System.out.println(d.findElement(By.id("sampleHeading")).getText());
			}
			//d.close();
		}
		d.switchTo().window(parent);
		//System.out.println(d.findElement(By.id("sampleHeading")).getText());
		d.findElement(By.id("windowButton")).click();
		windows = d.getWindowHandles();
		for(String wi: windows) {
			
			if(!wi.equals(parent)&& !wi.equals(second)) {
				
				d.switchTo().window(wi);
				System.out.println("Heading 2: "+d.findElement(By.id("sampleHeading")).getText());
			}
		}
	 
	}
	
	
	@BeforeTest
	public void launch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		parent = d.getWindowHandle();
	}
}

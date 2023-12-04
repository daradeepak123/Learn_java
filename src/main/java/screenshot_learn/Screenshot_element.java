package screenshot_learn;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class Screenshot_element {

	@Test
	public static void src_sht() throws IOException {
		// TODO Auto-generated method stub
		
		 //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        WebDriver driver = new EdgeDriver();

	        driver.get("https://demoqa.com");
	        driver.manage().window().maximize();
//	        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//	        ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\darad\\eclipse-workspace\\Learn_java\\Screenshot_normal"));
	        
	        long timeStamp = Calendar.getInstance().getTime().getTime();
	        System.out.println(timeStamp);
			TakesScreenshot scrShot =((TakesScreenshot)driver); // driver will  take screen shot

			
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);  //it will getScreenshotAs method to create image file

			//File DestFile=new File((System.getProperty("user.dir")+ "\\Screenshot_normal"  +timeStamp + ".png"));   // where the screen shot should go
			
			
			File DestFile=new File(("C:\\Work\\Screenshots\\" +timeStamp + ".png"));   // where the screen shot should go
			
			
			//C:\Users\darad\eclipse-workspace\Learn_java\Screenshot_normal
			
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
	        
	        
	        driver.quit();
	        
	        
	}

}

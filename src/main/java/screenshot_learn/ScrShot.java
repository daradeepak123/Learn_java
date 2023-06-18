package screenshot_learn;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://demoqa.com");
	        driver.manage().window().maximize();	        
	        long timeStamp = Calendar.getInstance().getTime().getTime();
	        
	        
	        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        Files.copy(file, new File(System.getProperty("user.dir")+"\\srcshots"+timeStamp+".png"));

	}

}

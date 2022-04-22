import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class functionize {
	
	
	@Test
	public void functionize_test() throws InterruptedException
	
	{
		System.out.println("OM");
		
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.functionize.com/h/test-automation?utm_source=google&utm_medium=paid%20search&utm_campaign=automated%20web%20testing&gclid=Cj0KCQjw3v6SBhCsARIsACyrRAnAAph_ZAzBuAtMMmOxygWzaK8E-NcBrNEaZhArYbZAnJXnlO8BEA8aAjAHEALw_wcB");
		
		Select slt=new Select(driver.findElement(By.xpath("//*[@name='job_role']")));
		slt.selectByValue("Software Engineer");
		
		
		Thread.sleep(1000000);
		
		
		
		
	}

}

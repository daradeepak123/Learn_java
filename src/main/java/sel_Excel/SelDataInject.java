package sel_Excel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.inject.Key;

public class SelDataInject extends ReadCreds{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='username']")).clear();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(creds(0,0));

		driver.findElement(By.xpath("//input[@name='password']")).clear();
		

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(creds(0,1));
		
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		driver.quit();
		
		
		
		

	}

}

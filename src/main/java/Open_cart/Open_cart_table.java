package Open_cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_cart_table {
	
	
	@Test
	public void Dynamic_table()
	{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/");
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
		

		driver.findElement(By.xpath("//input[@name='password']")).clear();

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id='menu-sale']/a")).click();
		

		driver.findElement(By.xpath("//*[@id='collapse26']/li[1]/a")).click();
		
		
		
		String text=driver.findElement(By.xpath("//*[contains(text(),'Showing 1')]")).getText();
		
		int ab=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		int a= Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
				
		System.out.println(a);
		System.out.println(ab);
		
		
		
		
	}
	

}

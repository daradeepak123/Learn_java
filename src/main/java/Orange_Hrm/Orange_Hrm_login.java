package Orange_Hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Hrm_login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println("this is title of our page---> "+driver.getTitle());
		
		
		String title1="OrangeHRM";
		
		if (title.contains(title1))
		{
			System.out.println("test Case pass");
		}
		else 
		{
			System.out.println("testcase fail");
		}
		
		//txtUsername
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		
		
		

	}

}

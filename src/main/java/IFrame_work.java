import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		
		driver.findElement(By.xpath("//span[text()='File']")).click();
		
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("hello");
		
		driver.switchTo().defaultContent();
		
		
		

	}

}

package testNG_learn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	public static WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method");
	  
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class annotation");
	  
	  System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver =new ChromeDriver();
	  
		driver.get("https://www.google.com/");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("this is before suit annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suit annotation");
	  try
	  {
		  
		  Thread.sleep(10000);
		  
//	  driver.close();
//	  driver.quit();
	  }
	  catch(Exception e)
	  {
		  e.getStackTrace();
		  System.out.println(e);
	  }
  }

}

package testNG_learn_new;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("this is Before method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is aafter method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suit");
  }
  
  @Test
  public void test()
  {
	  System.out.println("this is actual test");
  }
  

}

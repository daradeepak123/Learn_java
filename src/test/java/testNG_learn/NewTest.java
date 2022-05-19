package testNG_learn;

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
  @Test
  public void Test() {
	  System.out.println("this is test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class annotation");
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
  }

}

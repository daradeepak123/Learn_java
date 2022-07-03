package testNG_learn;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTest_2 extends NewTest{
	
  @Test
  public void f() {
	  
	  String title=driver.getTitle();
	  
	  System.out.println("page title "+title);
	  
	  
	 assertEquals(title, "Google");
	   
	  
  }
}

package dataProviderLearn;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DP {
	
	
	
	@DataProvider
	public Object[][] dp() {
		
		
		
		return new Object[][] { 
			{ "hello world","welcome"," " },
			{"hello India","welcom","india is great"},
			{"hello India","welcom","india is great"}
			};
	}
	
	
	@Test(dataProvider="dp")
	public void hello(String str,String ss, String an)
	{
		System.out.println(str);
		System.out.println(ss);
		System.out.println(an);
		
		Assert.assertEquals("hello", "hello");
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals("hello", "hello");
		
		sa.assertAll();
		
		
	}

}

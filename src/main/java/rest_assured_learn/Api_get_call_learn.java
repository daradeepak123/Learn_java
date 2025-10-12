package rest_assured_learn;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_get_call_learn {
	
	
	
	
	@Test(enabled=false)
	public void get_calls()
	{
		 RestAssured.baseURI="https://reqres.in";
		 
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  //Response object
		  Response response=httpRequest.request(Method.GET,"/api/users");
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
		  
		  //status line verification
		  String statusLine=response.getStatusLine();
		  System.out.println("Status line is:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		  
	}
	
	@DataProvider(name="dp")
	public Object[] provide()
	{
		 return new Object[][] { { 1 }, 
			 					{ 2}, { 3} };


	}
	
	@Test(dataProvider = "dp")
    public void get_callss(int a) {
		
		
		RestAssured.baseURI = "https://reqres.in";

	    // Send API key in a custom header (as suggested by their error message behavior)
	    RequestSpecification httpRequest = RestAssured.given().header("x-api-key", "reqres-free-v1");
	    
	    Response res=httpRequest.request(Method.GET,"/api/users");
	    String responseString=res.getBody().asString();
	    Assert.assertEquals(responseString.contains("george.bluth@reqres.in"), true);
	    Assert.assertEquals(res.getStatusCode(), 200);
	    
	    
	    for(int i=1;i<=6;i++)
	    {
	    	
	    }
	    Response response = httpRequest.request(Method.GET, "/api/users/"+a);

	    String responseBody = response.getBody().asString();
	    System.out.println("Response Body is: " + responseBody);

	    int statusCode = response.getStatusCode();
	    System.out.println("Status code is: " + statusCode);
	    Assert.assertEquals(statusCode, 200);

	    String statusLine = response.getStatusLine();
	    System.out.println("Status line is: " + statusLine);
	    Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	    
    }

}

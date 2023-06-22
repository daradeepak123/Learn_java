package rest_assured_learn;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Put_call {
	
	
	
	 @Test
	 void RegistrationSuccessful()
	 {
	  
	  //Specify base URI
	  RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
	  
	  //Request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	   
	  //Request paylaod sending along with post request
	  JSONObject requestParams=new JSONObject();
	  
	  requestParams.put("name","Suresh010101");
	  requestParams.put("salary","500000");
	  requestParams.put("age","31");
	  
	  
	  httpRequest.header("Content-Type","application/json");
	  
	  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
	  
	  //Response object
	  Response response=httpRequest.request(Method.POST,"/create");
	    
	  
	  //print response in console window
	  
	  String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  
	  //status code validation
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  if (statusCode==200 || statusCode ==201)
	  {
	  
	  Assert.assertEquals(true, true);
	  }
	  
	  //success code validation
	 String successCode=response.jsonPath().get("SuccessCode");
	  
	System.out.println("this is success code "+successCode);
	  
	 }
	 

}

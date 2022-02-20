package com.apitesting;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteMethod {
	
	static String domain = "https://jsonplaceholder.typicode.com";
	
	
	public static void main(String[] args) {
		DeleteMethod.deleteRequest();
	}
	
	public static void deleteRequest() {
		
		RequestSpecification httpRequest = RestAssured.given();		
		Response response = httpRequest.request(Method.DELETE, domain + "/posts/4");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response body : "+responseBody);
		
		//Verify the status code
		int statusCode = response.getStatusCode();
		System.out.println("The status code is : "+statusCode);
		Assert.assertEquals(statusCode, 200);
			
	}

}

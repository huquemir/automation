package com.apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	
	static String domain = "https://jsonplaceholder.typicode.com";
	
	@Test
	public static void getRequest() {
		
		RequestSpecification httpRequest = RestAssured.given();		
		Response response = httpRequest.request(Method.GET, domain + "/posts");
		
		
		String responseBody = response.getBody().asString();
		System.out.println("Response body : "+responseBody);
		
		//Verify the content of the body
		
		//Verify the title in the body
		String title = response.jsonPath().get("[1].title");
		System.out.println("The title is : "+title);
		String expectedTitle = "qui est esse";
		Assert.assertEquals(title, expectedTitle);
		
		//Verify the id in the body
		int id = response.jsonPath().get("[1].id");
		System.out.println("The id is : "+id);
		int expectedId = 2;
		Assert.assertEquals(id, expectedId);
		
		
		
		//Verify the status code
		int statusCode = response.getStatusCode();
		System.out.println("The status code is : "+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		
		//Verify the content type (from the response header)
		String contentType = response.header("Content-type");
		System.out.println("The content type is : "+contentType);
		String expectedContentType = "application/json; charset=utf-8";
		Assert.assertEquals(contentType, expectedContentType);
		
		
		
		
	}
	
	
	

}

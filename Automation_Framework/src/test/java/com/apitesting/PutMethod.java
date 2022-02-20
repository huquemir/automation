package com.apitesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutMethod {
	
	static String domain = "https://jsonplaceholder.typicode.com";
	
	@Test
	public static void putRequest() {
	
		RequestSpecification httpRequest = RestAssured.given();	
		
		JSONObject data = new JSONObject();
		data.put("title", "My test title updated");
		data.put("body", "This is the json body");
	
		httpRequest.header("Content-type","application/json; charset=utf-8");
		httpRequest.body(data.toJSONString());
		
		Response response = httpRequest.request(Method.PUT, domain + "/posts/3");
		
		String body = response.getBody().asString();
		System.out.println("This is the body with payload : "+body);
		
		//Verify the title in the body
		String title = response.jsonPath().get("title");
		System.out.println("The title is : "+title);
		String expectedTitle = "My test title updated";
		Assert.assertEquals(title, expectedTitle);
		
		//Verify the status code
		int statusCode = response.getStatusCode();
		System.out.println("The status code is : "+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		
		
	}

}

package com.apitesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.testng.annotations.Test;

public class BDDStyleAPI {
	
	static String domain = "https://jsonplaceholder.typicode.com";
	
	@Test
	public static void getBDDMethod() {
		
		given().param("Content-type", "application/json; charset=utf-8")
		.when().get(domain +"/posts").then().statusCode(200).log().all();
		
	}

}

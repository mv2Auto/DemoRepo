package com.test;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

//import org.json.simple.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tests_POST {
	
	
	//@Test
	public void test_1_post() throws JSONException {
		
/*		Map<String ,Object> map = new HashMap<String,Object>();
			
			map.put("name", "madhu");
			map.put("job", "bigbull");
			
			for(Object s:map.values()) {
			System.out.println(s);
			
			}
			
			System.out.println(map);
			
			
		
			JSONObject request = new JSONObject(map);*/
			
			
			
			//System.out.println(map);
			
			
		
			JSONObject request = new JSONObject();
			
			request.put("name", "madhu");
			request.put("job", "bigbull");
			
			System.out.println(request);
			System.out.println(request.toString());
			
			
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toString()).
		when().
		post("https://reqres.in/api/users").
        then().
        statusCode(201);
		

		
			
	}
	
	//@Test
	public void test_1_put() throws JSONException {
		
			JSONObject request = new JSONObject();
			
			request.put("name", "madhu");
			request.put("job", "bigbull");
			
			System.out.println(request);
			System.out.println(request.toString());
			
			
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toString()).
		when().
		put("https://reqres.in/api/users/2").
        then().
        statusCode(200).log().all();

		
			
	}
	
	
	@Test
	public void test_1_delete() throws JSONException {
		
			
		when().
		delete("https://reqres.in/api/users/2").
        then().
        statusCode(204).log().all();

		
			
	}
	

}

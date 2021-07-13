//Author - Madhu
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

//import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class TC01_GET_Request {

/*	@Test
	public void getWeatherDetails() {
		
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET);
		
		String  resp = response.getBody().asString();
		System.out.println(resp);
		System.out.println("Status code is " + response.getStatusCode());
		System.out.println("Content type is " + response.getHeader("content-type"));
		System.out.println("Status line is " + response.getStatusLine());
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(200, statuscode);
		
		
	}*/
	
	// when we change import to static with * - "import static io.restassured.RestAssured.*"
      //We need not use "RestAssured" keyword
	
	
	/*@Test
	public void getWeatherDetails() {
		
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET);
		
		String  resp = response.getBody().asString();
		System.out.println(resp);
		System.out.println("Status code is " + response.getStatusCode());
		System.out.println("Content type is " + response.getHeader("content-type"));
		System.out.println("Status line is " + response.getStatusLine());
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(200, statuscode);
		
		
		
	}*/
	
	@Test
	void test_02() {
		given().get("https://reqres.in/api/users?page=2").
		then()
		.statusCode(200)
		.body("data.id[0]",equalTo(7));
	}
	
	
}

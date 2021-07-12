import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

//import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class Tests_GET {
	
	
	@Test
	public void test_1() {
		given().
		//header("Content-Type","application/json").param(arg0, arg1).
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).body("data.id[1]", equalTo(8)).body("data.first_name",hasItems("Michael","Lindsay"));
		
		
	}

}

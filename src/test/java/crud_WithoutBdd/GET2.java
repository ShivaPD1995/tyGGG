package crud_WithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GET2
{
	@Test
	public void get2()
	{
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.statusCode());
		System.out.println(res.contentType());
		res.then().log().all();
		
	}
}

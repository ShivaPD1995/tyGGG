package crud_WithBdd;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GET2 
{
	@Test
	public void get2()
	{
		baseURI="https://reqres.in/";
		when().get("api/users/2")
		
		.then().assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}
}

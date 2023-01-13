package crud_WithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GET_1AllProjectbdd
{
	@Test
	public void getAllProjectBdd()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when()
		.get("projects")
		.then().assertThat()
		.time(Matchers.lessThan(1500L),TimeUnit.SECONDS)
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
}

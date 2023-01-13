package crud_WithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GET_ProjectBdd 
{
	@Test
	public void getSingleProjectBdd()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when()
		.get("projects/TY_PROJ_16295")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}
}

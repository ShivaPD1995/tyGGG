package parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class PathParameterBdd
{
	@Test
	public void pathParam()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("pid","TY_PROJ_16706")
		
		.when().get("/projects/{pid}")
		
		.then().log().all();
	}
}

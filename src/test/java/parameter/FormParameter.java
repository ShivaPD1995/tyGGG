package parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParameter 
{
	@Test
	public void formParam()
	{
		given()
		.formParam("createdBy","FormParam")
		.formParam("projectName", "formParam1")
		.formParam("status","Ongoing")
		.formParam("teamSize", "6")
		
		.when().post("http://rmgtestingserver:8084")
		
		.then().assertThat().statusCode(201).log().all();
	}
}

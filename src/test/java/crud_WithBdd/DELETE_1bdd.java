package crud_WithBdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DELETE_1bdd 
{
	@Test
	public void deleteBdd()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when()
		.delete("/projects/TY_PROJ_16295")
		
		.then()
		.assertThat()
		.statusCode(204)
		.log().all();
		
	}
}

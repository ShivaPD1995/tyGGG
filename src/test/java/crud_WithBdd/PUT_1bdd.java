package crud_WithBdd;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PUT_1bdd 
{
	@Test
	public void putBdd()
	{
		JSONObject job=new JSONObject();
		job.put("createdBy", "PUT_BDD");
		job.put("projectName","NewBddPostNextPut");
		job.put("status","completed");
		job.put("teanSize", 8);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.body(job)
		.contentType(ContentType.JSON)
		
		.when()
		.put("projects/TY_PROJ_16295")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}
	
	
}

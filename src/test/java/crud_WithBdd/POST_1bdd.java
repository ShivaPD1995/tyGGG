package crud_WithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class POST_1bdd
{

	@Test
	public void postbdd()
	{
		//step1:Create pre-requisite request body

		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "POST_BDD");
		jobj.put("projectName", "NewBddPost");
		jobj.put("status","Assigned");
		jobj.put("teamSize", 5);


		baseURI ="http://rmgtestingserver";
		port=8084;

		given()
		.body(jobj)
		.contentType(ContentType.JSON)

		//step2:Perform Action	
		.when()
		.post("/addProject")

		//step3:Validation
		.then().assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();

	}
}

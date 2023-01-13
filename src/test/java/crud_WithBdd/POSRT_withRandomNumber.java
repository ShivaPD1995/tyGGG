package crud_WithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POSRT_withRandomNumber
{
	@Test
	public void postbdd()
	{
		Random ran=new Random();

		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "POST_BDD");
		jobj.put("projectName", "NewBddPost"+ran.nextInt(500));
		jobj.put("status","Assigned");
		jobj.put("teamSize", 5);


		baseURI ="http://rmgtestingserver";
		port=8084;
		given()
		.body(jobj)
		.contentType(ContentType.JSON)

		.when()
		.post("/addProject")

		.then().assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
	}
}

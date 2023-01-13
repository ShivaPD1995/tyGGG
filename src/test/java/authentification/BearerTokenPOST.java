package authentification;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerTokenPOST
{
	@Test
	public void bearerToken()
	{
		baseURI="https://api.github.com/";
		
		JSONObject job=new JSONObject();
		
		job.put("name","SDET-44");
		
		
		given()
		.auth().oauth2("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")
		.body(job).contentType(ContentType.JSON)
		
		.when().post("/user/repos")
		
		.then().assertThat().statusCode(201).log().all();
	}
}

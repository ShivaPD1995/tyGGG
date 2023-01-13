package diffPostMethods;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostWithHashmap 
{
	@Test
	public void postMap()
	{
		baseURI="http://rmgtestingserver"; //TY_PROJ_16599
		port=8084;
		HashMap values=new HashMap();
		
		values.put("createdBy","PostWithMap");
		values.put("projectName","PostWithMap123");
		values.put("status", "Ongoing");
		values.put("tesmSize", 4);
		
		given().body(values).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
		
		
		
		
		
		
	}
}

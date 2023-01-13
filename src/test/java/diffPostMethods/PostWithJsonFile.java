package diffPostMethods;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostWithJsonFile 
{
	@Test
	public void post()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		File file=new File("./src/test/resources/Dinga.json"); //TY_PROJ_16565
		
		given().body(file).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();		
	}
}

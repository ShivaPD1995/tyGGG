package pojoClasses;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class POST_ReqChain
{
	@Test
	public void pChain()
	{
		Random ran=new Random();
		baseURI="http://rmgtestingserver";
		port=8084;
		CreateObjectForPojoClass poj=new CreateObjectForPojoClass("PostChain","CreatChain1"+ran.nextInt(6800),"Started",2);
		
		
		
		Response res = given().body(poj).contentType(ContentType.JSON)
		
		.when().post("/addProject");
		
		String  pid = res.jsonPath().get("projectId");
		res.then().contentType(ContentType.JSON).log().all();
		
		given().pathParam("pid1", pid)
		
		.when().get("/projects/{pid1}")
		
		.then().assertThat().log().all();
	}
}

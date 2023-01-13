package pojoClasses;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POST_pojo 
{
	@Test
	public void pojo1()
	{
		baseURI="http://rmgtestingserver";//TY_PROJ_16706
		port=8084;
		CreateObjectForPojoClass c1=new CreateObjectForPojoClass("PojoClass4", "PojoCreated4","Ongoing",6);
		
		given().body(c1).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().assertThat().statusCode(201).log().all();
	}
}

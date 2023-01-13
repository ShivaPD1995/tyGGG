package crud_WithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT_1 
{
	@Test
	public void put1()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Post1Method");
		jobj.put("projectName", "FirstPostNextPut");
		jobj.put("status","Ongoing");
		jobj.put("teamSize", "10"); //TY_PROJ_16207
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response response = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_16207");
		System.out.println(response.getContentType());
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		System.out.println(response.prettyPeek());
	}
}

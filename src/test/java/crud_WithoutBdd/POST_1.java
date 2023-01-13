package crud_WithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_1 
{
	@Test
	public void post1()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Post1Method");
		jobj.put("projectName", "FirstPost");
		jobj.put("status","Ongoing");
		jobj.put("teamSize", "9");
		
		RequestSpecification req = RestAssured.given();
		
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response response = req.post("http://rmgtestingserver:8084/addProject");
		
		System.out.println(response.getContentType()); 
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		System.out.println(response.prettyPeek());
		System.out.println(response.asPrettyString());
	}
}
  
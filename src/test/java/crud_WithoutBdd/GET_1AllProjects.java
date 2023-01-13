package crud_WithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GET_1AllProjects
{
	@Test
	public void getAllProject()
	{
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects");
		
		resp.then().log().all();
		int actStatusCode = resp.getStatusCode();
		Assert.assertEquals(200, actStatusCode);		
	}
}

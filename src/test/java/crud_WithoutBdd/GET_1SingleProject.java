package crud_WithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GET_1SingleProject 
{
	@Test
	public void getSingleProject()
	{
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_16207");
		resp.then().log().all();
		int actStatusCode = resp.getStatusCode();
		Assert.assertEquals(200, actStatusCode);		
	}
}

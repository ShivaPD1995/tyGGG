package crud_WithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DELETE_1 
{
	@Test
	public void delete1()
	{
		Response resp = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_16207");
		
		int actStatusCode = resp.getStatusCode();
		Assert.assertEquals(204, actStatusCode);
	}
}

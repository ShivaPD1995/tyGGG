package responseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class GET_DynamicResponseValidation
{
	@Test
	public void dynamicValid()
	{
		String expID="TY_PROJ_16706";
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		Response res = given().get("/projects");
		
		boolean flag=false;
		List<String> pid = res.jsonPath().get("projectId");
		for(String id:pid)
		{
			if(id.equalsIgnoreCase(expID))
			{
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Data Verified");
	}
}

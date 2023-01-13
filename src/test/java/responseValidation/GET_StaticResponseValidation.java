package responseValidation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GET_StaticResponseValidation
{
	@Test
	public void staticValid()
	{
		String expData="TY_PROJ_11111";
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		Response res = when().get("/projects");
		
		String actData = res.jsonPath().get("[15].projectID");
		expData=actData;
		 System.out.println(actData);
		 Assert.assertEquals(actData, expData);
		 System.out.println("Data verified");		
	}
}

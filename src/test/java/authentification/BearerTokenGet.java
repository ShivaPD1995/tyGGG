package authentification;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenGet 
{
	@Test
	public void getBearer()
	{
		baseURI="https://api.github.com/";
		
		given().auth().oauth2("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")
		
		.when().get("events")
		
		.then().assertThat().statusCode(200).log().all();
	}
}

package authentification;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2 
{
	@Test
	public void  auth()
	{
		 Response resp = given()
				  .formParam("client_id", "Dinga")
				 .formParam("client_secret", "62c8e9c1d7b447e9084da9cba97258f1")
				 .formParam("grant_type", "client_credentials")
				 .formParam("redirect_uri", "http://dinga.com")
				 .formParam("code", "authorization_code")
				 
				.when().post("http://coop.apps.symfonycasts.com/token");
		 
		 	String token = resp.jsonPath().get("access_token");
		 	System.out.println(token);
		 	
		 	given()
		 	.auth().oauth2(token).pathParam("USER_ID", "4220")
		 	
		 	.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		 	
		 	.then().log().all();
				 
		
	}
}


//client-secrete:62c8e9c1d7b447e9084da9cba97258f1 Userid:4220 Access Token:082d45bfe1b040b563c34db4ea86e006374939a2
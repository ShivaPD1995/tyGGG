package genericUtility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;


public class BaseClass 
{
	public DatabaseLibrary dlib=new DatabaseLibrary();
	public JavaLibrary jlib=new JavaLibrary();
	public RestAssuredLibrary rlib=new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		dlib.connectDB();
		baseURI="http://rmgtestingserver";
		port=8084;		
	}
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dlib.disconnectDB();
	}
}

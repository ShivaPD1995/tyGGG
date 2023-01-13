package newPojoClassFramework;

import static  io.restassured.RestAssured.*;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointsLibrary;
import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClasses.CreateObjectForPojoClass;

public class CreateProjectAndVerigyProject extends BaseClass
{
	@Test
	public void createProj() throws SQLException
	{
	CreateObjectForPojoClass pojo=new CreateObjectForPojoClass("123","525"+jlib.random(),"958",7);
	Response resp = given().body(pojo).contentType(ContentType.JSON)
	
	.when().post(EndPointsLibrary.createProject);
	
	String expdata = rlib.getJsonData(resp, "projectId");
	System.out.println(expdata);
	
	String query="select * from project";
	String actdata = dlib.readDataFromDBandValidate(query, 1, expdata);
	
	Assert.assertEquals(expdata, actdata);
	System.out.println("TC pass");
	
	resp.then().log().all();
	
	
	}
}

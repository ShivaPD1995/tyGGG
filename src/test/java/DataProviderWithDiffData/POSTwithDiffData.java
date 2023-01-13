package DataProviderWithDiffData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClasses.CreateObjectForPojoClass;

import static io.restassured.RestAssured.*;

public class POSTwithDiffData 
{
	@DataProvider(name="diffData")
	public Object[][] provideData()
	{	
	Object [] [] arr=new Object [4][4];
	
	arr[0][0]="Data";
	arr[0][1] ="Pojo1";
	arr[0][2] ="Completed";
	arr[0][3] =2;
	
	arr[1][0]="Data1";
	arr[1][1] ="Pojo2";
	arr[1][2] ="Completed1";
	arr[1][3] =3;
	
	arr[2][0]="Data2";
	arr[2][1] ="Pojo3";
	arr[2][2] ="Completed2";
	arr[2][3] =4;
	
	arr[3][0]="Data3";
	arr[3][1] ="Pojo4";
	arr[3][2] ="Completed3";
	arr[3][3] =5;	
	
	return arr;
	}
	
	@Test(dataProvider ="diffData")
	public void createProject(String createdBy,String projectName,String status,int teamSize)
	{
		CreateObjectForPojoClass poj=new CreateObjectForPojoClass(createdBy, projectName, status, teamSize);
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().body(poj).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().log().all();
		
		
	}
	
}

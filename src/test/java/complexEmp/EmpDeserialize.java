package complexEmp;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import empPojoClasses.EmpPojo;

public class EmpDeserialize 
{
	@Test
	public void empDeserialize() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj1=new ObjectMapper();
		
		EmpPojo empPojo=obj1.readValue(new File("./complex1.json"), EmpPojo.class);
		
		System.out.println("Employee name is "+empPojo.getName());
		System.out.println("Spouce name is "+empPojo.getSpouce().getName());
	}
}

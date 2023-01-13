package serializeAndDeserialize;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClasses.CreateObjectForPojoClass;

public class Selialization
{
	@Test
	public void srlzn() throws JsonGenerationException, JsonMappingException, IOException
	{
		CreateObjectForPojoClass pojos=new CreateObjectForPojoClass("S1", "S2","S3",5);
		
		ObjectMapper obj=new  ObjectMapper();
		obj.writeValue(new File("./Dinga2.json"), pojos);
	}
	
}

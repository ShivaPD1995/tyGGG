package serializeAndDeserialize;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClasses.CreateObjectForPojoClass;

public class De_Serialization 
{
	@Test
	public void deSerialize() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();

		CreateObjectForPojoClass pojs=obj.readValue(new File("./Dinga2.json"), CreateObjectForPojoClass.class);
		System.out.println(pojs.getProjectName());
		System.out.println(pojs.getStatus());
	}
}

package serializeAndDeserialize;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class ArrayDeserialization
{
	@Test
	public void deSerialize() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper map=new ObjectMapper();
		
		PojoForArray poj=map.readValue(new File("./ArraySerial.json"), PojoForArray.class);
		System.out.println(poj.getMob()[0]);
		System.out.println(poj.getEmpId());
	}
}

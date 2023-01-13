package serializeAndDeserialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.annotations.Test;

public class ArraySerialization 
{
	@Test
	public void arraySerial() throws JsonGenerationException, JsonMappingException, IOException
	{
	Object [] mobNum={"8548","4587"};
	PojoForArray po1=new PojoForArray("Dinga", "Emp1541",mobNum, 8);
	
	ObjectMapper map=new ObjectMapper();
	map.writeValue(new File("./ArraySerial.json"), po1);
	}
}

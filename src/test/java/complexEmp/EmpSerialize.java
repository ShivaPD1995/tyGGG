package complexEmp;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import empPojoClasses.EmpPojo;
import empPojoClasses.SpoucePojo;

public class EmpSerialize
{
	@Test
	public void complex() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] mob1= {458,547};
		SpoucePojo spouce1 = new SpoucePojo("Kristen", mob1);
		
		EmpPojo emp1 = new EmpPojo("Shivakumar",857, spouce1);
		
		ObjectMapper obj=new ObjectMapper();
		
		obj.writeValue(new File("./complex1.json"),emp1);
		
		
		
	}
}

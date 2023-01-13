package genericUtility;

import java.util.Random;

public class JavaLibrary 
{
	public int random()
	{
		Random rNum=new Random();
		int randomNumber = rNum.nextInt(1000);
		return randomNumber;
	}
}

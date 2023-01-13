package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseLibrary 
{
	Driver driverRef;
	Connection con;
	
	
	public void connectDB() throws SQLException
	{
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		 con = DriverManager.getConnection(Iconstants.dbUrl,Iconstants.dbUsername,Iconstants.dbPassword);
	}
	public void disconnectDB() throws SQLException
	{
		con.close();
	}
	public String readDataFromDBandValidate(String query,int columnIndex,String expData) throws SQLException
	{
		boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equals(expData))
			{
				 flag = true;
				 break;
			}
		}
		if(flag)
		{
			System.out.println("Verified");
			return expData;
		}
		else
		{
			System.out.println("Data not verified");
			return " ";
		}
	}
}

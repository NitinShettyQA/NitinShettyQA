package day2;

import java.sql.ResultSet;
import java.sql.SQLException;

import day1.Demo2;

public class Demo1 {
Demo2 DBUtils = new Demo2();

public void Execute() throws SQLException
{
	int empId=101;
String query = "Select * from employeeTable where empId="+empId+"";
DBUtils.connect();
ResultSet result=DBUtils.executeQuery(query);

while(result.next())
{
	String userName = result.getString("userName");
	System.out.println(userName);
}
}
   String mainWindow = driver.getwindowHandle();
   Set<String> allWindoHandles = driver.getwindowHandles();
 
 for(String handle: allWindoHandles)
 {
	 if(!handle.equals(mainWindow))
	 {
		 //perform operations
		 driver.close();
	 }
 }
}

 



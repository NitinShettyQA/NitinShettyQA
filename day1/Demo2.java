package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.NoSuchElementException;

 public class Demo2
 {
	 String DBUrl = "";
	 String userName = "";
	 String passWord = "";
	 
	 Connection connection;
	 
	 //connection to DB
	 public void connect() throws SQLException
	 {
		 connection = DriverManager.getConnection(DBUrl, userName, passWord);
	 }
	 
	 //Disconnecting to DB
	 public void disConnect() throws SQLException
	 {
		 if(connection!=null || !connection.isClosed())
		 connection.close();
	 }
	 
	 public ResultSet executeQuery(String str) throws SQLException
	 {
		 Statement stmt = connection.createStatement();
		 return stmt.executeQuery(str);
	 }
	 
	 public int executeUpdate(String str) throws SQLException
	 {
		 Statement stmt = connection.createStatement();
		 return stmt.executeUpdate(str);
	 }
	 
 }
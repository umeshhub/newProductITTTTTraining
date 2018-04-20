package com.niit.skillmapper.utils;
import java.io.*;
import java.sql.*;
import java.util.Properties;
public class DBConnections {

	
	private static Properties prop=new Properties();
	private static String jdbc_url,jdbc_username,jdbc_password;
	
	/*private DBConnections()
	{
		
		
		DATABASE_URL="data";
	}*/
	
	private DBConnections()
	{}
	
	
	static {
		
		try
		{
			prop.load(new FileInputStream("D:\\Project-workspace\\Testing_NIIT_Project\\src\\com\\niit\\skillmapper\\utils\\database.properties"));
			System.out.print(prop);
			Class.forName(prop.getProperty("jdbc.driver"));
			jdbc_url=prop.getProperty("jdbc.url");
			jdbc_username=prop.getProperty("jdbc.username");
			jdbc_password=prop.getProperty("jdbc.password");
			
		}
		catch(ClassNotFoundException | IOException exe)
		{
			exe.printStackTrace();
			
		}
	}
	
	
	
	
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			con=DriverManager.getConnection(jdbc_url,jdbc_username,jdbc_password);
			if(con != null)
				System.out.println("Connection Successful....");
			
		}
		catch(SQLException exe)
		{
			exe.printStackTrace();
		}
		
		return con;
	}
}

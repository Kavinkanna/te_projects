package com.tyss.jdbcapp.dynamicqueries;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;

public class Insert {
	public static void main(String[] args) {
		
		
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			FileInputStream inputStream = new FileInputStream("info.properties");

			Properties properties = new Properties();

			properties.load(inputStream);
			//step1
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//step 2
		connection =DriverManager.getConnection(properties.getProperty("dbUrl"), properties);
			
		//step 3	
		String query =  " insert into primary_info"
				   +" values(?,?,?,?) ";
	
		preparedStatement = connection.prepareStatement(query);		
	
	Date utilDOB = new Date("15/07/1998");
	java.sql.Date dob = new java.sql.Date(utilDOB.getDate());
	
	preparedStatement.setInt(1, Integer.parseInt(args[0]));
	preparedStatement.setString(2, args[1]);
	preparedStatement.setDate(3, dob);
	preparedStatement.setLong(4, Long.parseLong(args[2]));
	
	int res = preparedStatement.executeUpdate();
	
	//step 4
		System.out.println(res+" no of rows affected ");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
	
				
			} catch (Exception e2) {
					e2.printStackTrace();
			}
		}
		
		
	}
}

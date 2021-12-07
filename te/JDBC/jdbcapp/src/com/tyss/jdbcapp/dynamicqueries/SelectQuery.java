package com.tyss.jdbcapp.dynamicqueries;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;

public class SelectQuery {
		public static void main(String[] args) {
			
		
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			try {
				FileInputStream inputStream = new FileInputStream("info.properties");

				Properties properties = new Properties();

				properties.load(inputStream);
				//step1
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				//step 2
			connection =DriverManager.getConnection(properties.getProperty("dbUrl"), properties);
				
			//step 3	
			String query = " select * from primary_info where id= ? ";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt( 1,Integer.parseInt(args[0]));
			
		    resultSet = preparedStatement.executeQuery();
			
			//step 4
		    if (resultSet.next()) {
		    	int id = resultSet.getInt("id")  ;
				System.out.println( "Employee Id : "+ id);
				String name = resultSet.getString("name");
				System.out.println("employee Name : "+ name);
				Date dob = resultSet.getDate("dob");
				System.out.println("DOB : "+ dob);
				long number = resultSet.getLong("phoneNumber");
				System.out.println("phoneNumber : "+ number);
			}
				
				
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
					if (resultSet != null) {
						resultSet.close();
					}
					
				} catch (Exception e2) {
						e2.printStackTrace();
				}
			}
			
			
		}
}

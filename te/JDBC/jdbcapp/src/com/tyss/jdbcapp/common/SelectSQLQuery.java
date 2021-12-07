package com.tyss.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class SelectSQLQuery {
	
			public static void main(String[] args) {
				Connection connection  = null;
				Statement stmt = null;
				ResultSet resultSet = null;
				
				try {
					//step 1 : Load the Driver
//					Driver driver = new com.mysql.jdbc.Driver();
//					DriverManager.registerDriver(driver);
					
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					
					//step 2 : get DB Connection via driver 
					String dbUrl = "jdbc:mysql://localhost:3306/employee?user=root&password=root";
					
					 connection =	DriverManager.getConnection(dbUrl);
					
					//step 3 : issue sql queries via connection 
					String query = " select * from primary_info ";
					
					 stmt = connection.createStatement();
					
					 resultSet =stmt.executeQuery(query);
					
					//step 4 : process the result
					
					while (resultSet.next()) {
						int id = resultSet.getInt("id")  ;
						System.out.println( "Employee Id : "+ id);
						String name = resultSet.getString("name");
						System.out.println("employee Name : "+ name);
						Date dob = resultSet.getDate("dob");
						System.out.println("DOB : "+ dob);
						long number = resultSet.getLong("phoneNumber");
						System.out.println("phoneNumber : "+ number);
						
						System.out.println("-------------------------------");
					}
					
					
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//step 5
				finally {
					 try {
						 if (connection != null) {
							connection.close();
						}
						 if (stmt != null) {
							stmt.close();
						}
						 if (resultSet != null) {
							resultSet.close();
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
				
				
				
			}//end of main
}// End of Class

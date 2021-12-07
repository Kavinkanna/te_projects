package com.tyss.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertSQLQuery {
		public static void main(String[] args) {
					Connection connection = null;
					Statement statement = null;
				try {
					//step 1 :
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					
					//step 2
					String url = "jdbc:mysql://localhost:3306/employee";
					connection = DriverManager.getConnection(url, "root", "root");
					
					//step 3 
					String query = "insert into primary_info values(30,'Lohit','1994-09-12',55665562)";
					
					statement = connection.createStatement();
					int rows = statement.executeUpdate(query);
					
					//step 4 
					if (rows != 0) {
						System.out.println("Record is inserted ");
						System.out.println(rows+" no of rows affected");
					}
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			
				//step 5
				finally {
					 try {
						 if (connection != null) {
							connection.close();
						}
						 if (statement != null) {
							statement.close();
						}
						 
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			
		}//end of main
}//end of class

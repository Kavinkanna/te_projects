package com.tyss.jdbcapp.dynamicqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			//step 1
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//step 2
			String url = "jdbc:mysql://localhost:3306/employee";
			connection = DriverManager.getConnection(url, "root", "root");
			
			//step 3
			String query = " update primary_info set name = ? where id = ? ";
			
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, args[0]);
			preparedStatement.setInt(2, Integer.parseInt(args[1]));
			
			int res = preparedStatement.executeUpdate();
			
			
			//step 4
			System.out.println(res+" no of rows affected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//step 5
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
		
		
	}//end of main
}//end of class

package com.tyss.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class DeleteSQLQuery {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {

			FileInputStream inputStream = new FileInputStream("info.properties");

			Properties properties = new Properties();

			properties.load(inputStream);

			// step1 :
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// step 2:
			connection = DriverManager.getConnection(properties.getProperty("dbUrl"), properties);

			// step 3
			statement = connection.createStatement();
			int res = statement.executeUpdate(properties.getProperty("deletQuery"));

			// step 4

			System.out.println("Data is Deleted for id 20");

		} catch (Exception e) {
			e.printStackTrace();
		}

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
	}
}

package com.te.junit.math;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MathUtil {

	public int add(int a, int b) {
		return a + b;
	}

	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}

	public double divide(int a, int b) {
		return a / b;
	}

	public boolean addEmp(int id, String name) {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			PreparedStatement statement = connection.prepareStatement("insert into primary_info values(?,?)");

			statement.setInt(1, id);
			statement.setString(2, name);

			int res = statement.executeUpdate();
			if (res != 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	
	public boolean remove(int id) {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			PreparedStatement statement = connection.prepareStatement("delete from primary_info where id =? ");

			statement.setInt(1, id);
			

			int res = statement.executeUpdate();
			if (res != 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}

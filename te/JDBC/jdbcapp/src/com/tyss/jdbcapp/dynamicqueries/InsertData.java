package com.tyss.jdbcapp.dynamicqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class InsertData {
		public static void main(String[] args) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				
				Date utilDOB = new Date("15-07-1998");
				java.sql.Date dob = new java.sql.Date(utilDOB.getDate());
				
				//step 1 
				Class.forName("com.mysql.jdbc.Driver").newInstance();
					
				//step 2
				String url = "jdbc:mysql://localhost:3306/employee?user=root&password=root";
				conn = DriverManager.getConnection(url);
				
				//step3 
				String query =  " insert into primary_info"
							   +" values(?,?,?,?) ";
				
				pstmt = conn.prepareStatement(query);		
				
				pstmt.setInt(1, Integer.parseInt(args[0]));
				pstmt.setString(2, args[1]);
				pstmt.setDate(3, dob);
				pstmt.setLong(4, Long.parseLong(args[2]));
				
				int res = pstmt.executeUpdate();
				
				//step 4
					System.out.println(res+" no of rows affected ");
				
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//step 5
			
			finally {
				try {
						if (conn != null) {
							conn.close();
						}
						if (pstmt != null) {
							pstmt.close();
						}
				} catch (Exception e2) {
				
				}
			}
		}
}

package uk.warley.ganesh.hibernatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection {
	public static void main(String[] args) {

		String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		try(Connection connection=DriverManager.getConnection(jdbcURL,"ganesh","ganesh")) {
		System.out.println(connection);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	
package com.cdgn.service1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishTheConnection {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306";
			String username="root";
			String password="root";
			 connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Successfull...");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

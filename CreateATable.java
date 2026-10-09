package com.cdgn.service1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateATable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement st=connection.createStatement();
			//st.execute("create database Jdbc");
			st.execute("create table Employee(id int,name varchar(30),age int,salary int,email varchar(50))");
			System.out.println("Table Created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

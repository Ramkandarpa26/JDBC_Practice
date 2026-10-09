package com.cdgn.service1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement st=connection.createStatement();
			ResultSet set=st.executeQuery("select * from employee");
			//st.execute("create table Employee(id int,name varchar(30),age int,salary int,email varchar(50))");
			while(set.next()) {
				System.out.println(set.getInt(1));
				System.out.println(set.getString(2));
				System.out.println(set.getInt(3));
				System.out.println(set.getInt(4));
				System.out.println(set.getString(5));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.cdgn.service1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement st=connection.createStatement();
			//st.execute("create database Jdbc");
			//st.execute("create table Employee(id int,name varchar(30),age int,salary int,email varchar(50))");
			//st.executeUpdate("insert into employee values(1,'Ram',18,5000,'ramkandarpa27@gmail.com')");
//			st.executeUpdate("insert into employee values(2,'Charith',18,7000,'charith28@gmail.com')");
//			st.executeUpdate("insert into employee values(3,'Nihal',18,75000,'nihal@gmail.com')");
//			st.executeUpdate("update employee set name='Ramkandarpa' where id=1");
			int s=st.executeUpdate("delete from employee where id='3'");
			System.out.println(s);
			System.out.println("Data Deleted Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

package com.cdgn.service2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataWithPreparedStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
			PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?,?)");
			int id=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			int salary=sc.nextInt();
			String email=sc.next();
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setInt(4, salary);
			ps.setString(5,email);
			ps.executeUpdate();
			System.out.println("Data Inserted Successfully.");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}

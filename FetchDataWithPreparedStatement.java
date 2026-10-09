package com.cdgn.service2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDataWithPreparedStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
			PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ResultSet set=ps.executeQuery();
			while(set.next()) {
				System.out.println(set.getInt(1));
				System.out.println(set.getString(2));
				System.out.println(set.getInt(3));
				System.out.println(set.getInt(4));
				System.out.println(set.getString(5));
			}
			System.out.println("Data Fetched Successfully.");
			
			
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

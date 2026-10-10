package com.cdgn.service3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataExample {

	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			int r1=st.executeUpdate("Insert into employee values(4,'Satvik',23,7500,'satvik21@gmail.com')");
			int r2=st.executeUpdate("delete from employee where id=5");
			con.setAutoCommit(false);
			if(r1==1 && r2==1) {
				con.commit();
				System.out.println("The Transaction is Successfull....");
			}
			else {
				con.rollback();
				System.out.println("The Transaction is failed..");
			}
			
			
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
		


	}

}

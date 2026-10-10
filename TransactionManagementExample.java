package com.cdgn.service3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagementExample {

	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery("select * from employee");
			ResultSetMetaData rs=set.getMetaData();
			int col_count=rs.getColumnCount();
			System.out.println(col_count);
			for(int i=1;i<=5;i++) {
				System.out.print(rs.getColumnClassName(i)+"\t");
				System.out.print(rs.getColumnName(i)+"\t");
				System.out.println(rs.getColumnTypeName(i)+"\n");
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

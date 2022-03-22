package com.example.jdbc;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductData {

	private static String userName;

	public static void main(String[] args) throws IOException{
				try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			String url="jdbc:postgresql://localhost:1025/ttestdb";
			String username = "postgres";
			String password = "Swathi@123";
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement stmt =  con.createStatement();
			ResultSet rs= stmt.executeQuery("select*from productt");
			
			while(rs.next())
		    System.out.println("ID:"+rs.getString("prod_id")+"Name:"+rs.getString("productt"));
			if(con!=null) {
				System.out.println("Successfully connected::");
			}
			else {
				System.out.println("Connection refused::");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public static void createTable(Statement stmt) {
		String query = "create table Person(pres_id varchar(4) primary key,"+"pers_name varchar(20) not null,"
	                    +"age numberic(2))";
		try {
		
		stmt.execute(query);
			System.out.println("Table successfully created");
		
			}catch(SQLException e){
			e.printStackTrace();
		
	}
	}
	


}

 
package com.project.java.quiz_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

	
	public class Jdbc_connection extends Score_check{
		
		  static Connection con;
			 static PreparedStatement p;
			 String sname;
	       
			

		public void methodconnection() throws SQLException {
			 Scanner scan=new Scanner(System.in);
			    System.out.println("enter the name-");
			    sname=scan.next();
			try {
				
				  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","shweta");
					   String s="insert into student(sname,smarks)values(?,?)";
					   PreparedStatement p=con.prepareStatement(s);
				   
						p.setString(1,sname);
						p.setInt(2,score);
						 
						   
							int i=p.executeUpdate();
							System.out.println(i);
							System.out.println("inserted");
							
						
				    	
						con.close();
						p.close();
						
					} catch (Exception e) {
					  e.printStackTrace();
					}	

				
			}



}

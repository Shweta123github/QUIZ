package com.project.java.quiz_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retrivedata {
	ResultSet rs=null;
	Statement s=null;
    Connection con=null;
	
public void retrivemethod() {
		
		try {
			
			OpenConnection OP=new OpenConnection();
			con=OP.getconnection();
			s=con.createStatement();
			
			String s1="SELECT *from student ORDER BY smarks DESC;";
		    rs=s.executeQuery(s1);
		
			
				while(rs.next()) {
					 
				System.out.print(rs.getInt("sid"));
				System.out.print("     ");
				System.out.print(rs.getString("sname"));
				System.out.print("     ");
				System.out.print(rs.getString("smarks"));
				System.out.print("     ");
				System.out.println();
			
			}
				
				System.out.println("data retrived");
			  
			con.close();
			s.close();
				}
		    catch (Exception e) {
		
			e.printStackTrace();
		}
		   

	}

	}










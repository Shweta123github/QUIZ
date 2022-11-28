package com.project.java.quiz_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class Jdbc_connection extends Score_check{
	
	    static Connection con=null;
	    static PreparedStatement p=null;
		String sname;
		
		
       
	    public void methodconnection() throws SQLException {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("enter the name-");
		   sname=scan.next();
		try {
			
			 // step 1 Inserting record of students on database;
		     String s1="insert into student(sname,smarks)values(?,?)";
		     
		     OpenConnection OP=new OpenConnection();
				con=OP.getconnection();
				p=con.prepareStatement(s1);
		   
			 p.setString(1,sname);
			 p.setInt(2,score);
					 
			// step 4 Execute query		   
			 int i=p.executeUpdate();
			 System.out.println("inserted");
						
			// step 5 close connection  	
			 con.close();
			 p.close();
					
		    } 
		 catch (Exception e) 
		    {
		    
			 e.printStackTrace();
			}	

			
		}
}

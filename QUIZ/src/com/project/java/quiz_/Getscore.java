package com.project.java.quiz_;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Getscore {
	ResultSet rs=null;
	Statement s=null;
	Connection con=null;   
public void score() {
		
		try {
			
			OpenConnection OP=new OpenConnection();
			con=OP.getconnection();
			s=con.createStatement();
			
			String s1="SELECT *from student ORDER BY sid DESC";
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the sid-");
			int id=scan.nextInt();
			
			
			ResultSet rs=s.executeQuery(s1);
			
			while(rs.next()) {
				if(id==rs.getInt("sid")) 
				{
				System.out.println("score-" +rs.getInt("smarks"));
			    }
			}
				System.out.println("data retrived");
				con.close();
				s.close();
				rs.close();
		}
		    catch (Exception e) {
		
			e.printStackTrace();
		}
		   
		
	}

	}



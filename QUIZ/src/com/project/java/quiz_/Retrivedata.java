package com.project.java.quiz_;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class Retrivedata {
		
	public void retrivemethod() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","shweta");
				Statement s=con.createStatement();
				String s1="SELECT *from student ORDER BY smarks DESC;";
				
				ResultSet rs=s.executeQuery(s1);
			
				
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













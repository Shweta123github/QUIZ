package com.project.java.quiz_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

	public class Start_quiz extends Mainclass{
		
		static int score=0;
		
	public void methodstart() {
				int TotalQuestion=10;
				
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","shweta");
				Statement s=con.createStatement();
				
				
	            String s1="SELECT Question,option_1,option_2,option_3,option_4,correctanswer from mcq ORDER BY RAND();";
				
				ResultSet rs=s.executeQuery(s1);
			
				  for(int i=1;i<=TotalQuestion;i++) 
				    {
					while(rs.next()) {
						 
					System.out.println("Q)" +rs.getString("Question"));
					System.out.println("A)" +rs.getString("option_1"));
					System.out.println("B)" +rs.getString("option_2"));
					System.out.println("C)" +rs.getString("option_3"));
					System.out.println("D)" +rs.getString("option_4"));
					
					
				    System.out.println("Enter your answer-");
				    Scanner scan=new Scanner(System.in);
				    String answer=scan.next();
				    System.out.println(rs.getString("correctanswer"));
					if(answer=="A" && rs.getString("option_1")==rs.getString("correctanswer"))
							{
						score=score+1;
					        }
					else if(answer=="B" && rs.getString("option_2")==rs.getString("correctanswer"))
							{
						score=score+1;
					        }
					else if(answer=="C" && rs.getString("option_3")==rs.getString("correctanswer"))
							{
						score=score+1;
					        }
				    else
				    {
				    	score=score+1;
				    }
					}
				    } 
				  
				 // System.out.println("total score is-" +score);
				  
				
			    con.close();
				s.close();
				
				}     
					
		 catch (Exception e) {
			
				e.printStackTrace();
			}
	}
	}
		




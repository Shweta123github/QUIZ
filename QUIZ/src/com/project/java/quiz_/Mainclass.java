package com.project.java.quiz_;

import java.sql.SQLException;
import java.util.Scanner;


public class Mainclass {
	  
	  static String sname;
	  int score=0;
	  static int choice=0;
	  public static void main(String[] args) throws InterruptedException, SQLException {
	  Scanner scan=new Scanner(System.in);
	  System.out.print("Loading");
		  
	  for(int i=0;i<=5;i++) 
	  {
	  Thread.sleep(1000);
	  System.out.print(".");
	  }  
	  
	  System.out.println();
	  System.out.println();
	  System.out.println("    Data Loaded");
	  System.out.println("<<--Welcome to Java Technical quiz-->>" );
		
	  do {
		    
	         System.out.println("Enter your choice from below options:");
			 System.out.println("Enter 1: INSTRUCTIONS");
			 System.out.println("Enter 2: START");
			 System.out.println("Enter 3: To fetch the student data from database..");
			 System.out.println("Enter 4: Fetch the particular student score");
			 System.out.println("Enter 5: EXIT");
				
		     int choice=scan.nextInt();
			 switch(choice) 
				{
			 
			   case 1:
				    Instructions i=new Instructions();
				    i.display();
				 
			   case 2:
					
			        System.out.println("Start The Quiz:");
					Start_quiz sq=new Start_quiz();
					sq. methodstart();
					Thread.sleep(3000);
					
					//inserting student record into database
					Jdbc_connection jb=new Jdbc_connection();
					jb.methodconnection();
					
				    //calculating the score as per performance
					Score_check sc=new Score_check();
					sc.methodscore();
					Thread.sleep(3000);
				    break;
				
				case 3:
					//fetch the whole record as per highest marks
					Retrivedata rv=new Retrivedata();
					rv.retrivemethod();
					Thread.sleep(3000);
					break;
				
				case 4:
					//fetch the particular student record using student id
					Getscore gs=new Getscore();
					gs.score();
					break;
					
				case 5:
					System.out.println("Exiting...");
					System.exit(0);
					default:
						System.out.println("Enter a valid key");
				}
		}while(choice<=5);
		scan.close();
		}
			
	  }
	  

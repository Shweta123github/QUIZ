package com.project.java.quiz_;

import java.sql.SQLException;
import java.util.Scanner;

public class Mainclass {
	
	 static String sname;
	  int score=0;
	  public static void main(String[] args) throws InterruptedException, SQLException {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Loading");
		  
		for(int i=0;i<=5;i++) {
			Thread.sleep(1000);
		System.out.print(".");
			

	   }  
	        System.out.println();
			System.out.println( "*Data Loaded*");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("       |");
			System.out.println("*Welcome to Java Technical quiz*" );
			System.out.println("Enter your choices");
			System.out.println("Enter 1 to start the quiz");
			System.out.println("Enter 2 to reterive the student data from database..");
			System.out.println("Enter 3 to get particular student score");
			System.out.println("Enter 4 to exit");
			
			
			
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Start quiz");
				
				Start_quiz sq=new Start_quiz();
				sq. methodstart();
				Thread.sleep(3000);
				
				Jdbc_connection jb=new Jdbc_connection();
				jb.methodconnection();
			
				Score_check sc=new Score_check();
				sc.methodscore();
				Thread.sleep(3000);
			    break;
			
			case 2:
				System.out.println("reterive the whole student data from database");
				Retrivedata rv=new Retrivedata();
				rv.retrivemethod();
				Thread.sleep(3000);
				break;
			
			case 3:
				Getscore gs=new Getscore();
				gs.score();
				break;
				
			case 4:
				System.out.println("Exiting...");
				System.exit(0);
				default:
					System.out.println("Enter a valid key");
			}
			

		  }
	

}

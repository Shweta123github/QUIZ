package com.project.java.quiz_;


	
	public class Score_check extends Start_quiz{

		
		public void methodscore() {
			  System.out.println("--------Result---------");
		        System.out.println("Total Questions: "+"10"); 
		        System.out.println("Correct Answered Questions : "+score);
		       
		        if(score==10){
		            System.out.println("Performance : Class A");
		        }
		        else if(score<6){
		            System.out.println("Performance : Class B");
		        }
		        else if(score==3){
		            System.out.println("Performance : Class C");
		        }else {
		        	System.out.println("fail");
		}

	}

}




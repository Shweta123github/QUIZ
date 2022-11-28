package com.project.java.quiz_;

public class Score_check extends Start_quiz{

	    public void methodscore() 
	    {
	    	//As per performance check the score
			System.out.println("Test is completed");
			System.out.println("--------Result---------");
		    System.out.println("Total Questions: "+"10"); 
		    System.out.println("Correct Answered Questions : "+score);
		       
		    if(score>=8)
		    {
		    System.out.println("Good!.Keep it up: Class A");
		    }
		    else 
		    	
		    if(score>5 && score<8)
		    {
		    System.out.println("Keep practising : Class B");
		    }
		    else 
		    	
		    if(score==3)
		    {
		    System.out.println("Performance : Class C");
		    }else
		    	
		    {
		    System.out.println("fail");
		}

	}

}


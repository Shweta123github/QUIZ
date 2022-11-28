package com.project.java.quiz_;


import java.sql.Connection;
import java.sql.DriverManager;

public class OpenConnection {
           /* connection class is created
            * so we don't need to write in each class username and password
            */
	        String username="root";
	        String password="shweta";
	        static final String DB_URL="jdbc:mysql://localhost:3306/quiz";
	
	        public Connection getconnection() {
		
		    Connection con =null;
		    try 
		    {
			//step 1 Load driver using forname
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 open connection
			con = DriverManager.getConnection(DB_URL,username,password);
		    }
		    catch(Exception e) 
		    {
			System.out.println(e);
		    }
		    return con;
		
	}
}

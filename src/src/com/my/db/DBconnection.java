package com.my.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnection {
	
	
	
	
	private static String DB_URL = "jdbc:mysql://localhost:3306/oop project";
    private static String USER = "root";
	private static String PASS = "root";
	
	private static Connection connection;
	
	private DBconnection(){		
	}
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		
		if(connection == null ||  connection.isClosed()){
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			
			
			
		}
		
		
		return connection;
	}
	

}

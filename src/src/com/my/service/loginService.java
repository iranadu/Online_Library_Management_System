package com.my.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.my.model.Login;
import com.my.db.*;




public class loginService  implements interLogin{
	
	
	private Connection connection;

	private Statement statement;
	
	
	public boolean loginValidate(Login login) throws ClassNotFoundException, SQLException{
	
		
		String uid = login.getUid();
		String pass = login.getPass();
		String uType = login.getType();		
		
		
		connection = DBconnection.getDBConnection();
		connection.setAutoCommit(false);
		
	
		statement = connection.createStatement();
			
		String loginQuery = "SELECT * FROM userdb WHERE UserID = '"+uid+"' AND Password='"+pass+"' AND UserType = '"+uType+"'";
			
		ResultSet rs = statement.executeQuery(loginQuery);
		connection.commit();
		
				if(rs.next()){
						return true;
				}
				else
				{
						return false;
				}
		}
		
		
		
	
	
	
	
}








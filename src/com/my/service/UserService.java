package com.my.service;

import java.sql.*;



import com.my.db.*;
import com.my.model.*;



public class UserService implements InterUser {
	

	private Connection connection;

	private Statement statement;
	
	
	
	public void regUser(User User) throws ClassNotFoundException, SQLException {
		
		String uType = User.getUserType();
		String fname = User.getfname();
		String lname = User.getlname();
		String uid = User.getUid();
		String pword = User.getPword();
		String address = User.getAddress();
		String mail = User.getMail();
		
		
		
		
		connection = DBconnection.getDBConnection();
		connection.setAutoCommit(false);
		
		statement = connection.createStatement();
	
		
			
		
		String addUser ="INSERT INTO userdb " + "VALUES ('"+uType+"' , '"+fname+"' , '"+lname+"', '"+uid+"', '"+pword+"', '"+address+"', '"+mail+"')";
		statement.executeUpdate(addUser);
		
		
	
	/*	if (User.getUserType() == "Staff"){
		
			
			preparedStatement = connection.prepareStatement("Insert into staff");
		
		
		}
		else {   */
 	
			
		
		
	/*	
		preparedStatement.setString(3, User.getUid());
		preparedStatement.setString(1, User.getfname());
		preparedStatement.setString(2, User.getlname());
		preparedStatement.setString(4, User.getPword());
		preparedStatement.setString(5, User.getAddress());
		preparedStatement.setString(6, User.getMail());
		
		preparedStatement.execute();
		*/
		connection.commit();
		
	}

	public void RegUser(User User) {
		// TODO Auto-generated method stub
		
	}


	
	

}

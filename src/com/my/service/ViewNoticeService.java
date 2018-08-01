package com.my.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.my.db.DBconnection;
import com.my.model.Notice;

public class ViewNoticeService {


	private Connection connection;

	private Statement statement;
	
	
	public void viewNotice(Notice nt2) throws ClassNotFoundException, SQLException{
		
		connection = DBconnection.getDBConnection();
		connection.setAutoCommit(false);
		
		
		
		
		statement = connection.createStatement();
		
		String sql = "SELECT NoticeID,Notice FROM notices";
		
		ResultSet rs = statement.executeQuery(sql);
		
		
		
		while(rs.next()){
			
			nt2.setNotice(rs.getString("Notice"));
			
			System.out.println(rs.getString("Notice"));
			
			
		}
		
		
		
		
	}
	





}

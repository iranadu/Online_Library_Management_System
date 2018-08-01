package com.my.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.my.db.DBconnection;
import com.my.model.Notice;

public class NoticeService {

	private Connection connection;

	private Statement statement, stmt;
	
	public void addNotice(Notice nt1) throws ClassNotFoundException, SQLException{
		
		
		String getNote = nt1.getNotice();
		@SuppressWarnings({ "static-access"})
		int getID = nt1.getNoticeID();
		String endDate = nt1.getEndDate();
		
		connection = DBconnection.getDBConnection();
		connection.setAutoCommit(false);
		
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // HH:mm:ss
		Date date = new Date();
		//System.out.println(formatter.format(date));


		
		String pDate = formatter.format(date);
		
		nt1.setPdate(pDate);
		
		
		statement = connection.createStatement();
		String addNote = "INSERT INTO `notices`(`PublishDate`,`NoticeID`, `Notice`,`EndDate`) VALUES ('"+pDate+"','"+getID+"','"+getNote+"', '"+endDate+"')"; 
		statement.executeUpdate(addNote);
		
		
		if(endDate.equals(formatter.format(date))){
			
			stmt = connection.createStatement();
			String sql1 = "DLETE FROM notices WHERE EndDate = '"+endDate+"' ";
			stmt.executeQuery(sql1);
			
			System.out.println("Notice Deleted");
			
		}
		
	
		connection.commit();
		
	}
	
	
}


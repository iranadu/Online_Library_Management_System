package com.my.service;



import java.sql.SQLException;

import com.my.model.*;

public interface InterUser {

	public void regUser(User User) throws ClassNotFoundException, SQLException;
	
}

package com.my.service;

import java.sql.SQLException;

import com.my.model.Login;

public interface interLogin {
	
	public boolean loginValidate(Login lg) throws ClassNotFoundException, SQLException;

}

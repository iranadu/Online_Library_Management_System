package com.my.model;

public class User {
	private String userType;
	private String fname;
	private String lname;
	private String uid;
	private String pword;
	private String cpword;
	private String address;
	private String mail;
	

	public void setUserType(String userType){
		this.userType = userType;
	}
	public String getUserType(){
		return userType;
	}
	
	
	public void setfname(String fname){
		this.fname = fname;
	}
	public String getfname(){
		return fname;
	}
	
	public void setlname(String lname){
		this.lname = lname;
	}
	public String getlname(){
		return lname;
	}
	
	
	public void setUid(String uid){
		this.uid = uid;
	}
	public String getUid(){
		return uid;
	}
	
	
	public void setPword(String pword){
		this.pword = pword;
	}
	public String getPword(){
		return pword;
	}
	
	
	public void setCpword(String cpword){
		this.cpword = cpword;
	}
	public String getCpword(){
		return cpword;
	}
	
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	
	
	public void setMail(String mail){
		this.mail = mail;
	}
	public String getMail(){
		return mail;
	}
	
	
}

package com.my.model;



public class Notice {
	
	private String endDate;
	private String pDate ;
	private String notice;
	private static int noticeID = 1000; 
		
	
	
	public void setNotice(String notice){
		this.notice = notice;
	}
	public String getNotice(){
		return notice;
	}

	public static int getNoticeID(){
		noticeID = noticeID +1;
		return noticeID;
	}
	
	public void setPdate(String pDate){
		this.pDate = pDate;
	}
		public String getPdate(){
		return pDate;
	} 
	
		
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
	public String getEndDate(){
		return endDate;
	} 
	
}

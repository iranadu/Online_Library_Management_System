<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
  
  <%@ page import="java.sql.*, java.util.*, com.my.model.*, com.my.service.*, com.my.db.*"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updated Notces</title>
</head>
<body background="edu5.jpg">

<%
	Connection connection;
	Statement statement;

	
	connection = DBconnection.getDBConnection();
	connection.setAutoCommit(false);
	
	
	statement = connection.createStatement();
	
	String sql = "SELECT PublishDate,NoticeID,Notice FROM notices";
	
	
	
	
	
	ResultSet rs = statement.executeQuery(sql);
	
	Notice nt2 = new Notice();
	
	int i = 1;
	
	
	
	
	%> 
	
	<h1 align="center">Student Notices</h1>
	<table align="center" border="1">
	<tr><th width="100">Publish Date</th><th>Notice</th></tr>


	<% 
	
	while(rs.next()){
		
		nt2.setNotice(rs.getString("Notice"));
		nt2.setPdate(rs.getString("PublishDate"));
		%>
		<tr><td width="200"><%=nt2.getPdate()%></td><td><textarea readonly rows=5 cols=50><%=nt2.getNotice()%></textarea></td> </tr>
		<%
			System.out.println(rs.getString("Notice"));
		}
	%>
</table>		
	 

<!-- 	ViewNoticeService vns = new ViewNoticeService();
	
	
	vns.viewNotice(nt2);
	
	
	String note = nt2.getNotice();
 	int a,b; */
	
 	 -->

<!--
<form name="viewNotice" action="ViewNoticeServlet" method="get">
<input type="submit" value="View Last Updated Result">
</form>
-->

</body>
</html>
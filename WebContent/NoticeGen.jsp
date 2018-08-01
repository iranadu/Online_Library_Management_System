<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make A Notice</title>
</head>
<body background="edu5.jpg" style="text-align:center">

<h3> Enter Student Notice</h3>



<form name="FormNotice" action="NoticeGenServlet"  method="post" >
<table  align="center">


<tr>
<td>Enter Notice</td>
<td></td>
</tr>

<tr>
<td><textarea name="notice" rows=10 cols=50 ></textarea></td>
<td></td>
</tr>

<tr>
<td>Enter End Date :</td>
<td></td>
</tr>

<tr>
<td><input type="text" name="endDate" size=50 value="dd/MM/yyyy" \></td>
<td></td>
</tr>

</table>

	<input type="submit" value="Submit Notice"\>


</form>

</body>
</html>
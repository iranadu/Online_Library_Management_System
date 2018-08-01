<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login | System</title>
</head>
<body background="edu5.jpg">


<form name="loginForm" action="loginServlet" method="get">
<br>
<br>
<br>
<br>
<table align="center">
<tr>
<td>User Type :<br>
<br> </td>
<td><select name="uType">
  <option >Student</option>
  <option >Staff</option>
</select><br>
<br></td>
</tr>


<tr>
<td>User ID:<br>
<br> </td>
<td><input type="text" name="uid" size="50"\><br>
<br></td>
</tr>
<tr>
<td>Password: <br>
<br></td>
<td><input type="password" name="pword" size="50"\><br>
<br></td>
</tr>

<tr>
<td><input type="submit" value="Submit" \></td>
<td><input type="reset" value="Reset" \></td>
</tr>



</table>

		
		 


</form>



</body>
</html>
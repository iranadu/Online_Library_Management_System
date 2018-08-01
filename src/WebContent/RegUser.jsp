<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration | Users </title>
</head>


<body background="edu5.jpg" style="text-align:center">



<br>
<br>
<br>


<h3> User Registration Form </h3>

<form name="myForm" action="RegServlet" method="post">
<table align="center">

<tr>
<td>Select User Type :<br>
	<br></td>

<td><select name="uType">
	<option>Student</option>
	<option>Staff</option>
	</select>
	<br>
	<br>
	
</td>
</tr>


<tr>
<td>First Name :<br>
	<br></td>
<td> <input type="text" name="fname" size="50" \><br>
	<br></td>
</tr>


<tr>
<td>Last Name :<br>
	<br></td>
<td> <input type="text" name="lname" size="50" \> <br>
	<br></td>
</tr>

<tr>
<td>User ID :<br>
	<br></td>
<td><input type="text" name="uid" size="50" \><br>
	<br></td>
</tr>


<tr>
<td>Password :<br>
	<br> </td>
<td><input type="password" name="pword" size="50"  \><br>
	<br></td>
</tr>


<tr>
<td>Confirm Password : <br>
	<br></td>
<td><input type="password" name="cpword"  size="50" \><br>
	<br></td>
</tr>


<tr>
<td>Address : <br>
	<br></td>
<td><input type="text" name="address" size="50" \><br>
	<br></td>
</tr>

<tr>
<td>Email :<br>
	<br></td>
<td><input type="text" name="mail" size="50"  \><br>
	<br></td>
</tr>

</table>
		<input type="submit" value="Submit" \>
		<input type="reset" value="Reset" \> 
		

</form>

</body>

</html>


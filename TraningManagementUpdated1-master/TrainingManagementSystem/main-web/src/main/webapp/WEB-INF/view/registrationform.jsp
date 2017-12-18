<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="Post" action="register"
	commandName="registration">
	
	<table>
	<tr>
	<td>Name :</td>
	<td><form:input path="name"/></td>
	</tr>
	
	<tr>
	<td>Contact :</td>
	<td><form:input path="contact"/></td>
	</tr>
	<tr>
	<td>Address :</td>
	<td><form:input path="address"/></td>
	</tr>
	<tr>
	<td>Login Name:</td>
    <td><form:input path="loginname" />
	</tr>
		
		<tr>
			<td>Email:</td>
		
			<td><form:input path="email" /></td>
		</tr>
		
		<tr>
			<td>Password:</td>
		
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>
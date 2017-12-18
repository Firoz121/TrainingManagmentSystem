<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<script>
function validate(){
var name=document.form.name.value;
var contact=document.form.contact.value;
var username=document.form.username.value;
var password=document.form.password.value;

if(name==""){
 alert("Enter name!");
  return false;
}

if(contact==""){
 alert("Enter contact");
  return false;
}
if(username==""){
 alert("Enter Username!");
  return false;
}
if(password==""){
 alert("Enter Password!");
  return false;
}
return true;
}

</script>

<form:form name="form" method="Post" action="register"
	commandName="registration" onsubmit="javascript:return validate();">
	
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
	<td>Username:</td>
    <td><form:input path="username" />
	</tr>
		
		<tr>
			<td>Password:</td>
		
			<td><form:password path="password" /></td>
		</tr>
		
		<tr>
			<td>Batch:</td>
		<td>	
		
		<select name="batch">
			
			<%
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cmsmgmtdb","root","root");  
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from batches");
           while(rs.next()){
           %>

<option  value="<%=rs.getString("batch")%>"><%=rs.getString("batch")%><option>
<%


     
           }
%> 
			<select> </td>
			
			
			</tr>
		
		
		<tr>
			<td colspan="1" align="right"><input type="submit" value="Submit" /></td>
		</tr>
		
	</table>
</form:form>
</body>
</html>
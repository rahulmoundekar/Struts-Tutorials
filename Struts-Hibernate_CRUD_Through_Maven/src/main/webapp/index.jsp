<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body >
<center>
<h3>Login Here</h3>
<s:form action="login.action">
<s:textfield label="Cust_UserName" name="customerName" value="Please Enter UserName"> </s:textfield>
<s:password label="Cust_Password" name="customerPass" value="Please Enter Password"></s:password>
<s:submit value="Login"></s:submit>
<s:a href="reg.jsp">New User</s:a>
</s:form> 
</center> 
</body>  
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<center>
<h1>Register Here</h1>
<s:form action="reg">
<s:textfield label="Customer_Name" name="customerName"></s:textfield>
<s:password label="Cust_Password" name="customerPass"></s:password>
<s:textfield label="Cust_Address" name="customerAddress"></s:textfield>
<s:date name="createdDate" format="yyyy-mm-dd" />
<s:submit name="Register" value="Register"></s:submit>

</s:form>
</center>
</body>
</html>
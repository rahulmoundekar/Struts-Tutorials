<%@ page language="java" contentType="text/html; charset=charset=US-ASCII"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Sucess Page</title>
</head>

<body>
<h1>User Info updated successfully</h1>
Name:<s:property value="name"/>
Address:<s:property value="address"/>
UpdateTime:<s:date name="updateTime"/>
<h4>Thank You</h4>
</body>
</html>
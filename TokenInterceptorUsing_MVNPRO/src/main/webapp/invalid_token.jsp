<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Update Duplicate Request Page</title>
</head>
<body>
<h1>User information is not updated,Duplicate request detected</h1>
<h3>Passible reasons are</h3>
<ul>
<li>Back button usage to submit form again</li>
<li>Double clickon submit button</li>
<li>Using reload option in browser
</ul>
<br>
<s:if test="hasActionErrors()">
<s:actionerror/>
</s:if>

</body>
</html>
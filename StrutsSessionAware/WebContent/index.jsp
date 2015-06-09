<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
</head>
<body>
<center>
<table>
<s:form action="log.action">
<s:textfield name="uname" label=" Enter UserName"></s:textfield>
<s:textfield name="uage" label="Enter UserAge"></s:textfield>
<s:textfield name="umarks" label="Enter UserMarks"></s:textfield>
<s:textfield name="ucountry" label="Enter UserCountry"></s:textfield>
<s:submit value="Login" align="center"></s:submit>
</s:form>
</table>
</center>
</body>
</html>
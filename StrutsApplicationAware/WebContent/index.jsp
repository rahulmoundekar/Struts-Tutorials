<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login Page</title>
</head>
<body>
<center>
 <s:actionerror/> 
<s:form action="log.action">
<s:textfield  name="uname" label="username" ></s:textfield><br>
<s:password name="upass" label="password" ></s:password><br>
<s:textfield name="age" label="age" ></s:textfield><br>
<s:textfield name="country" label="country" ></s:textfield><br>

<s:submit value="Login" align="center"></s:submit>
</s:form>

</center>
</body>
</html>
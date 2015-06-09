<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Success Page</title>
</head>
<body>
<s:form action="next">
Name:<s:property value="#session.un"/><br>
Age:<s:property value="#session.age"/>
<s:submit value="next"></s:submit>
</s:form>
</body>
</html>
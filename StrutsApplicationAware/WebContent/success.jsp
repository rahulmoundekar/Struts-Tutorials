<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Success Page</title>

</head>
<body>
Hello:<s:property value="#application.un"/>
pass:<s:property value="#application.pw"/>
age:<s:property value="#application.age"/>
country:<s:property value="#application.country"/>
</body>
</html>
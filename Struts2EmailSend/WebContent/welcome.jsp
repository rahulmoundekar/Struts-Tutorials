<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Email From</title>
</head>
<body>
<em>The form below uses Google's SMTP server.   
   So you need to enter a gmail username and password  </em>
 <form action="emailer.action" method="post" enctype="multipart/form-data">
 <label for="from">From</label>
 <input type="text" name="from">
 <label for="password">Password</label>
 <input type="password" name="password">
 <label for="to">To</label>
 <input type="text" name="to">
 <label for="subject">Subject</label>
 <input type="text" name="subject">
 <label for="body">Body</label>
 <input type="text" name="body">
 <input type="submit" value="Send EMail">
 </form>
</body>
</html>
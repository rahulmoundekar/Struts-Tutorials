<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert Record</title>
<link rel="stylesheet" type="text/css" href="css/java4s.css">
<script type="text/javascript">
function display(){
	document.form.action="varify.action";
	document.form.submit();
}

</script>

</head>
<body>
<s:form action="insert" name="form">
<table class="mtableu">
<tr>
<td colspan="2">
<input type="button" value="Display Records" onclick="display()">
</td>
</tr>
<tr>
<td>
<s:textfield label="Number" name="mb.no" cssClass="bord"></s:textfield>
<s:textfield label="Name" name="mb.nam" cssClass="bord"></s:textfield>
<s:textfield label="Country" name="mb.ct" cssClass="bord"></s:textfield>
<s:submit value="Insert"></s:submit></td></tr>
</table>
</s:form>

</body>
</html>
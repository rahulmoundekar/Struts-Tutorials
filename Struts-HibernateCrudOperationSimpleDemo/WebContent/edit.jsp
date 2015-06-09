<%@taglib uri="/struts-tags" prefix="s" %>
<%@page import="java.util.*" %>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link rel="stylesheet" type="text/css" href="css/java4s.css">
<script type="text/javascript">
function display(){
document.form.action="varify.action"	;
document.form.submit();
}
</script>
<title>Edit Record</title>
</head>
<body>
<center>
<s:form action="updateRecInDB" method="post" name="form">
<table class="mtableu">
<tr>
<td colspan="2">
<input type="button" value="Display Records" onclick="display()">
</td>
</tr>
<tr>
<td>
<s:textfield label="Number" value="%{#application.x}" readonly="true" name="mb.no" cssClass="bord"></s:textfield>
<s:textfield label="Name" value="%{#application.y}"  name="mb.nam" cssClass="bord"></s:textfield>
<s:textfield label="Country" value="%{#application.z}"  name="mb.ct" cssClass="bord"></s:textfield>
<s:submit value="Update"> </s:submit>
</td>
</tr>
</table>

</s:form>
</center>
</body>
</html>
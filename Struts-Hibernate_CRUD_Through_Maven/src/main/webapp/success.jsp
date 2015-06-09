<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function insert() {
	alert("Do you want to add record");
	document.form.action="reg.jsp";
	document.form.submit;
	
}
function deleteRec(customer_id) {
	alert("Do you want to delete record of id=:"+customer_id);
	
	document.form.action="delete.action?customer_id="+customer_id;
	document.form.submit;
	
}
function update() {
	alert("Do you want to update record");
	document.form.action="update.action?id="+id;
	document.form.submit;
	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Collection of Record</title>
</head>
<body>
<center>
success page
<s:form name="form">
<table border="2">
<tr>
<th><font color="red">Customer_Id</font></th>
<th><font color="red">Customer_Name</font></th>
<th><font color="red">Customer_Address</font></th>
<th><font color="red">Created_Date</font></th>
</tr>
<s:iterator value="al">
<tr>

<td><s:property value="customerId"/></td>
<td><s:property value="customerName"/></td>
<td><s:property value="customerAddress"/></td>
<td><s:property value="createdDate"/></td>
<td><button onclick="javascript:insert()">ADD</button></td>
<td><button onclick="javascript:update(<s:property value="customerId"/>)">Update</button></td>
<td><button onclick="javascript:deleteRec(<s:property value="customerId"/>)">Delete</button></td>
</tr>
</s:iterator>
</table>
</s:form>
</center>
</body>
</html>
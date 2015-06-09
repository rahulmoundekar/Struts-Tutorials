<%@taglib uri="/struts-tags" prefix="s" %>
<%@page import="java.util.*,com.demo.Mybean" %>
<%
	Mybean mb;
%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
<title>Display Records</title>

<link rel="stylesheet" type="text/css" href="css/java4s.css">
<script type="text/javascript">
function deleteRecord(){
	document.form.action="delete.action";
	document.form.submit();
}
function insertRecord(){
	document.form.action="insertLink.action";
	document.form.submit();
}
function editRecord(val){
	document.form.action="update.action?fid="+val;
	document.form.submit();
}
</script>

</head>
<body>
<center>
<h1>Collection of All Records</h1>
<form  method="post" name="form">

<table class="mtable">

<tr><td colspan="5">
<font face="vardhana" size="2">
<input type="button" value="insert" onclick="insertRecord()">
<input type="button" value="delete" onclick="deleteRecord()">
</font>
</td>
</tr>
<tr>
<td class="th"><b>Select</b></td>
<td class="th"><b>SNo</b></td>
<td class="th"><b>SName</b></td>
<td class="th"><b>Country</b></td>
<td class="th"><b>Operation</b>
</td>
</tr>
<%
	List l=(List)request.getAttribute("rec");
if(l!=null){
	Iterator itr=l.iterator();
	while(itr.hasNext()){
		mb=(com.demo.Mybean)itr.next();
%>
		<tr>
		
		<td class="bord"><input type="checkbox" value="<%=mb.getNo() %>" name="rdel"></td>
	<td class="bord"><%=mb.getNo()%> </td>
	<td class="bord"><%=mb.getNam()%> </td>
	<td class="bord"><%=mb.getCt()%> </td>
	<td class="bord" ><a href="javascript:editRecord('<%=mb.getNo()%>')">Edit</a></td>
	</tr>
	
	
	<% 
	}
}
%>
</table>
</form>

</center>
</body>

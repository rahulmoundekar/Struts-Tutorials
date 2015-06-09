<%@taglib uri="/struts-tags" prefix="s"%>  
<html>
<head>
<s:head/> 
</head>
<body> 
<s:actionerror/>  
<form action="uploadImage.action" method="post" enctype="multipart/form-data">
<s:file name="userImage" label="Choose Image" size="40"></s:file>
<s:submit value="Upload" name="Submit"></s:submit>
</form>  
</body> 
</html>               
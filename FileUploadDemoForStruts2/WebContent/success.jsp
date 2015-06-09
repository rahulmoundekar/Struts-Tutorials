<%@taglib uri="/struts-tags" prefix="s" %> 
  
<html>
<body>  
        <h2>  
            Struts2 File Upload Example  
        </h2>  
File Uploaded successfully...
User Image:<s:property value="userImage"/> 
Content Type:<s:property value="userImageContentType"/>
Temp File Name:<s:property value="userImageFileName"/>
Uploaded Image:<img src="userimages/<s:property value="userImageFileName"/>"   
                                                     width="100" height="100" />  
</body>          
</html>    
<%@taglib uri="/struts-tags" prefix="s"%>  
<s:form action="login.action">
<s:textfield name="uname" label="UserName"></s:textfield>
<s:password name="pw" label="Password"></s:password>
<s:submit value="Login"></s:submit>
<s:reset value="Clear"></s:reset>     
</s:form>             
      
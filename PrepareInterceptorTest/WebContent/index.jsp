<%@taglib uri="/struts-tags"  prefix="s"%>
<s:form action="login">
<s:textfield name="uname" label="UserName"></s:textfield>
<s:password name="upass" label="Password"></s:password>
<s:submit value="Login" ></s:submit>
</s:form>
package extremityindia;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ApplicationAware {
Map m;
private String uname,upass,country;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
private int age;
	@Override
	public void setApplication(Map m) {
		// TODO Auto-generated method stub
		this.m=m;
	}
	@Override
		public String execute() throws Exception {
			m.put("un",uname );
			m.put("pw", upass);
			m.put("age", age);
			m.put("country", country);
			return SUCCESS;
		}

}

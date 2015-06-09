import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.FileUploadInterceptor;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;


public class LoginEx  extends ActionSupport implements ServletRequestAware{
	private File userImage;
	
	public File getUserImage() {
		return userImage;
	}
	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}
	public String getUserImageContentType() {
		return userImageContentType;
	}
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}
	public String getUserImageFileName() {
		return userImageFileName;
	}
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
	private String userImageContentType;
	private String userImageFileName;
	private  HttpServletRequest servletRequest;
@Override
public String execute() throws Exception {
	System.out.println("excutemethod");  
	String filePath=servletRequest.getSession().getServletContext().getRealPath("/").concat("userimages");
	System.out.println("server path:"+filePath);
	//File fileToCreate=new File(filePath,this.userImageFileName);
	File fileToCreate=new File(filePath, this.userImageFileName);
	System.out.println(fileToCreate);
	FileUtils.copyFile(this.userImage,fileToCreate);
	
	return SUCCESS;  
}
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		this.servletRequest=servletRequest;
		
	}
}

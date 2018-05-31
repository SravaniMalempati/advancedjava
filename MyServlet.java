
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyServlet implements Servlet
{
	private ServletConfig config;
	public void destroy()
	{
	System.out.println("Inside destroy()");
	
	}
	public void init(ServletConfig config)
	{
		this.config =config;
		System.out.println("inside init()");
	}
	
	public ServletConfig getServletConfig()
	{
		System.out.println("inside getServletConfig()");
		return config;
	}
	public void service(ServletRequest req, ServletResponse res)
	{
		System.out.println("inside service()");
		
	}
	public String getServletInfo()
	{
		System.out.println("inside getServletInfo()");
		return "";
		
	}
	
	
	
	
}
/*File name save as :- index.html*/
<html>
	<form action="LifeCycleServlet">
		<input type="submit" value="Click of Action">
	</form>
</html>

/*File name save as :- LifeCycleServlet.java*/
import javax.servlet.*;
import java.io.*;

public class LifeCycleServlet implements Servlet {

	ServletConfig config = null;
	public void init(ServletConfig sc)
	{
		config = sc;
		System.out.println("in init");
	}
	public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException
	{
		res.setContenttype("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2>hello from life cycle servlet</h2>");
		System.out.println("in service");
	}
	public void destroy()
	{
		System.out.println("in destroy");
	}
	public String getServletInfo()
	{
		return "LifeCycleServlet";
	}
	public ServletConfig getServletConfig()
	{
		return config; 
	}
}


/*File name save as :- web.xml*/
<?xml version="1.0" encoding="UTF=8"?>
<web-app>
	<servlet>
		<servlet-name>LifeCycleServlet</servlet-name>
		<servlet-class>LifeCycleServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>LifeCycleServlet</servlet-name>
		<url-pattern>/LifeCycleServlet</url-pattern>
	</servlet-mapping>
	<session-config>
		<session-timeout>
			30
		</session-config>
</web-app>

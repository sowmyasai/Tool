import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HttpServletClass extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("In Get Method");
		System.out.println("User Name is :" + request.getParameter("uname"));
		System.out.println("Password is :" + request.getParameter("pwd"));
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("In Post Method");
		System.out.println("User Name is :" + request.getParameter("uname"));
		System.out.println("Password is :" + request.getParameter("pwd"));
	}

}

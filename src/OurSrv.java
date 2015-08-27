import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OurSrv extends HttpServlet {

	//private ServletResponse response;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		
		
		PrintWriter out=arg1.getWriter();
		arg1.setContentType("text/html");
		out.println("Today's date is= " +new Date(0));
		System.out.println("Welcome to HTML!!!");
	}
	
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		
		
		System.out.println("Welcome to HTML!!!");
	}
	
}

package pack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class login extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object RequestDispatcher) throws 
	IOException,ServletException
	{
		String u = request.getParameter("u");
		String p = request.getParameter("p");
		loginbean b= new loginbean();
		b.setName(u);
		b.setPassword(p);
		boolean status = b.check();
		if(status)
		{
		RequestDispatcher=request.getRequestDispatcher("logs.jsp");	
		((javax.servlet.RequestDispatcher) RequestDispatcher).forward(request , response);
		}
		else
			RequestDispatcher=request.getRequestDispatcher("loger.jsp");
	}
}

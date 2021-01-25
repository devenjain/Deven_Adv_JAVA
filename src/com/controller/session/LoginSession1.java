package com.controller.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSession1
 */
public class LoginSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String loginName = request.getParameter("txtUserName");
		String loginPwd = request.getParameter("pwd");
		String cmpName = "Deven";
		String cmpPwd = "deven321";
		
		session.setAttribute("logiNname", loginName);
		session.setAttribute("loginPwd", loginPwd);
		session.setAttribute("cmpPwd", cmpPwd);
		session.setAttribute("cmpName", cmpName);
		
		if(loginName.equals(cmpName) && loginPwd.equals(cmpPwd)) {
									
			response.setContentType("text/html");
			
			PrintWriter pw = response.getWriter();
			
			pw.print("<html><body>");
			pw.print("<h3> Login Successfull !!! </h3>");
			pw.print("</body></html>");
			pw.close();
			
		}
		
		else {	
			response.setContentType("text/html");
			
			PrintWriter pw = response.getWriter();
			
			pw.print("<html><body>");
			pw.print("<h3> Login Failed Try again !!! </h3>");
			pw.print("</body></html>");
			pw.close();
			response.sendRedirect("Login.html");
		}
	}

}

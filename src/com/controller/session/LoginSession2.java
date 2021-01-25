package com.controller.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String loginName = (String) session.getAttribute("logiNname");
		String loginPwd = (String) session.getAttribute("loginPwd");
		String cmpName = (String) session.getAttribute("cmpName");
		String cmpPwd = (String) session.getAttribute("cmpPwd");
		
		if(loginName.equals(cmpName) && loginPwd.equals(cmpPwd)) {
			
			response.setContentType("text/html");
			
			PrintWriter pw = response.getWriter();
			
			pw.print("<html><body>");
			pw.print("<h3> Login thai Gayu !!! </h3>");
			pw.print("</body></html>");
			pw.close();
			
		}
		
		else {	

			response.setContentType("text/html");
			
			PrintWriter pw = response.getWriter();
			
			pw.print("<html><body>");
			pw.print("<h3> Fari Prayatna Karo !!! </h3>");
			pw.print("</body></html>");
			pw.close();
			response.sendRedirect("Login.html");
		}
	}

}

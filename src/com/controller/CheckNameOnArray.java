package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckNameOnArray
 */
public class CheckNameOnArray extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String arr[] = new String[3];
		
		arr[0] = "Deven";
		arr[1] = "Digu";
		arr[2] = "Jain";
		
		String uName = request.getParameter("txtUserName");
		boolean flag = false;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			if(uName.equals(arr[i]))
				flag = true;
						
		}
		
		if(flag == true) {
			request.setAttribute("User", uName);
			request.getRequestDispatcher("CheckNameOnArray2").forward(request, response);
		}
		
		else {
			request.getRequestDispatcher("EnterName.html").include(request, response);
		}
		
	}

}

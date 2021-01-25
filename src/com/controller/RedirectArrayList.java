package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectArrayList
 */
public class RedirectArrayList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<String> al;
	
		public void init() throws ServletException {
			 al = new ArrayList<String>();  
		}
		
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(al.size() > 5) {
			
			response.setContentType("text/html");
			
			PrintWriter pw = response.getWriter();
			
			pw.print("<html><body>");		
			for(String s : al) {
				pw.print("<h3>| " + s + " | </h3>");
			}
			pw.print("<html><body>");
			pw.close();
			
			for(String s : al) {
				System.out.println(s);
			}
			
		}
		
		else {
			
			String prName = request.getParameter("pName");
			al.add(prName);
			response.sendRedirect("alData.html");
				
		}
		
	}

}

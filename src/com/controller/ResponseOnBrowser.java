package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseOnBrowser
 */
public class ResponseOnBrowser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("");
//		 response.setContentType("text/plain");
		 
//		 PrintWriter pw = response.getWriter();
//		 pw.print("Print Thai Gayu...");
		 
		 response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();
		 pw.print("<html><body><h1>");
		 pw.print("HTML na H1 tag ma print thai gayu...");
		 pw.print("</h1></body></html>");
		 
		 
	}

}

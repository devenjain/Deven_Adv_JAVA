package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sname =  request.getParameter("sName");
		String sgender = request.getParameter("sGender");
		
		response.setContentType("type/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.print("<html><body>");
		pw.print("<h1>Student Name   : " + sname + "</h1>");
//		pw.print("<h2>Age : " +  + "</h2>");
		pw.print("<h2>Student Gender : " + sgender + "</h3>");
		pw.print("</body></html>");
		pw.close();
		
	}

}

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScanFromConsol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name : ");
		String name = sc.next();
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Employee Gender : ");
		String gender = sc.next();
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		pw.print("<html><body>");
		pw.print("<h1>Name : " + name + "</h1>");
		pw.print("<h2>Age : " + age + "</h2>");
		pw.print("<h3>Gender : " + gender + "</h3>");
		pw.print("</html></body>");
		pw.close();
		
	}

}

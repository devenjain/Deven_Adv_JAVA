package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String prName = request.getParameter("name");
		String priceString = request.getParameter("price");
		String qtyString = request.getParameter("qty");
		int price = 0,qty = 0;
		if(priceString != null && !priceString.equals("") && qtyString != null && !qtyString.equals("")) {
			price = Integer.parseInt(priceString);
			qty = Integer.parseInt(qtyString);
		}
		
		String cat[] = request.getParameterValues("pc");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<center><h1>Product Detail</h1></center>");
		out.print("<h2>Product Name : " + prName + "</h2>");
		out.print("<h3>Price    	: " + price + "</h3>");
		out.print("<h3>Quantity 	: " + qty + "</h3>");
		out.print("<h3>Catagory 	: </h3>");
		
		for(String s : cat) 
			out.print("<h3>| " + s + " | </h3>");
		out.print("<h2>Total		: "	+ price*qty + "</h2>");
		out.print("</body></html>");
		out.close();
		
		
	}

}

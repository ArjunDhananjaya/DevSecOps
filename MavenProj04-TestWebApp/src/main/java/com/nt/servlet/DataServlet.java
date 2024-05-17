package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DataServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   //set response content type
		res.setContentType("text/html");
		//get PrintWriter 
		PrintWriter pw=res.getWriter();
		// send message as the  response
		pw.println("<h1> Date and Time is ::"+new Date()+"</h1>");
		
		//add hyperlink
		pw.println("<br><a href='index.jsp'>home </a>");
		
		//close  the  stream
		pw.close();
		
	}

}

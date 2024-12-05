package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Home</title>");
		out.println("</head>");
		out.println("<body bgcolor='pink'>");
		out.println("<h1>Student Information...</h1>");
		out.println("<p>Firstname:- ShiV</p>");
		out.println("<p>Lastname:- Patne</p>");
		out.println("<p>Qualification:- Msc.Maths </p>");
		out.println("<p>College:- Shivaji University</p>");
		out.println("<p>Birth Date:- 05/11/1999</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
	

}

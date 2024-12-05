package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/result")
public class ResultServlet extends HttpServlet {
	
	ArrayList<Makrs> result;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
		result = new ArrayList<>();
	    result.add(new Makrs("Java programming", 80.0));
	    result.add(new Makrs("Web programming", 85.0));
	    result.add(new Makrs("Database technologies", 83.0));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		for(Makrs m:result) {
		    out.println("<tr>");
		    out.printf("<td>%s<td>\r\n", m.getSubject());
		    out.printf("<td>%.2f<td>\r\n", m.getMarks());
		    out.println("</tr>");
		}
		
		
	}
	
	
	
	

}

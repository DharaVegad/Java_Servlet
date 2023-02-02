package com.va.assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class output
 */
@WebServlet("/output")
public class output extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public output() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name=request.getParameter("username"); 
		PrintWriter out = response.getWriter();
		
		 Cookie ck[]=request.getCookies();  
		 out.print("WELCOME "+ck[0].getValue());
		 
		//out.print("Welcome "+name);
		
		out.print("<form action='student.html' >");  
        out.print("<input style=\"padding: 14px 40px\" type='submit' value='Enter Details'");  
        out.print("</form>"); 
	}

}

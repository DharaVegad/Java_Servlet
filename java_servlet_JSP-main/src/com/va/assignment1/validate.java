package com.va.assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validate   
 */
@WebServlet("/validate")
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
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
		try{  
	    	  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	        String name=request.getParameter("username");  
	        String password = request.getParameter("pass");
	        if((password.equals("priyal213")) && (name.equals("Groupi")))
	        {
	        	Cookie ck=new Cookie("name",name);
		        response.addCookie(ck);  
		      
	        	//request.setAttribute("name", name);//make cookie afterwards instead of this
	        	RequestDispatcher rd = 	request.getRequestDispatcher("output");
	        	rd.forward(request, response);
	        }
	        else {
	        	out.print("Invalid username/password try again or NULL");
	        	
	        }
	        
	        	out.close();  
	      
	        }catch(Exception e)
	 		{System.out.println(e);}  

	}

}

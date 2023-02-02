package com.va.assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class score
 */
@WebServlet("/score")
public class score extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public score() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		String sname = request.getParameter("student_name");
		int sub1= Integer.parseInt(request.getParameter("subject1"));
		int sub2= Integer.parseInt(request.getParameter("subject2"));
		int sub3= Integer.parseInt(request.getParameter("subject3"));
		int sub4= Integer.parseInt(request.getParameter("subject4"));
		int sub5= Integer.parseInt(request.getParameter("subject5"));
		out.println("hello " +sname);
		
		double sum = (sub1+sub2+sub3+sub4+sub5);
		double avg = sum/5;
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(sub1);
		al.add(sub2);
		al.add(sub3);
		al.add(sub4);
		al.add(sub5);
		
		int mini = Collections.min(al);
		int maxi = Collections.max(al);
		
		//response.sendRedirect("final.jsp");
		
		
		request.setAttribute("average",avg);
		request.setAttribute("maximum",maxi);
		request.setAttribute("minimum", mini);
		request.setAttribute("average", avg);
		
		request.getRequestDispatcher("final.jsp").forward(request,response);
	}

}

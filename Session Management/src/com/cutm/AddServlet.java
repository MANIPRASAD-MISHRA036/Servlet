package com.cutm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;//Default serial id 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i036 = Integer.parseInt(request.getParameter("num1036"));//variable created
		int j036 = Integer.parseInt(request.getParameter("num2036"));//variable created
		int k036 = i036 + j036;// add two numbers
		HttpSession session=request.getSession();//session 
		session.setAttribute("k036", k036);
		
		
	}

}
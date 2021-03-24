package org.simplilearn.workshop;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("username");  
		    String p=request.getParameter("password");  
		          
		    if(n!=null && p!=null){ 
		    	if(n.contentEquals("ritvik")&& p.contentEquals("12345"))
		    	{
		    		out.println("User Found");
		        RequestDispatcher rd=request.getRequestDispatcher("admindashboard.html");  
		        rd.forward(request,response);  
		    }  
		    else{  
		        out.print("Sorry username or password error , Please Try Again");  
		        RequestDispatcher rd=request.getRequestDispatcher("Adminlogin.jsp");  
		        rd.include(request,response);  
		    }  
		          
		    out.close();  
		    }  
		}  
	}


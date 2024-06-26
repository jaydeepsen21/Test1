package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import com.entity.Student;
import com.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchStudent() {
         }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		PrintWriter p=response.getWriter();
		
		p.println("SerachStdent call incontroller");
		String t1=request.getParameter("t1");
		int id=Integer.parseInt(t1);
	
		StudentService service=new StudentService();
		Student student=service.findbyId(id);
		
		 
		request.setAttribute("student", student);
		RequestDispatcher rd=request.getRequestDispatcher("Details.jsp");
	    rd.forward(request,response);
	  
	}

}
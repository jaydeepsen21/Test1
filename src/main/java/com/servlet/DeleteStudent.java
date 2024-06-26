package com.servlet ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.entity.Student;

import com.service.StudentService;

public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("d1"));
		p.println(id);
	
		StudentService service=new StudentService();
		Student student=service.DeleteStudent(id);
		
		 
		request.setAttribute("student", student);
		RequestDispatcher rd=request.getRequestDispatcher("Details.jsp");
	    rd.forward(request,response);
		
	}

}
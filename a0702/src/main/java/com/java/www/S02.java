package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S02")
public class S02 extends HttpServlet {
       
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		if(id.equals("admin")&&pw.equals("1111")){	
			response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head><title>S01서블릿</title></head>");
			writer.println("<body>");
			writer.println("<h1> 로그인에 성공하셨습니다. </h1>");
			writer.println("</body></html>");
			writer.close();
		} else {
		//	response.sendRedirect("login.jsp");
			response.sendRedirect("login.jsp?logCheck=0");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 방식으로 실행됨");
		doAction(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 방식으로 실행됨");
		doAction(request,response);

	}

}

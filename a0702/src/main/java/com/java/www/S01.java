package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S01") // 주소
public class S01 extends HttpServlet {
	

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post일때 필요한 한글변환부분
		request.setCharacterEncoding("utf-8"); // post방식은 이거 항상 써줘야함
		
		System.out.println("doGet 호출");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String[] interest = request.getParameterValues("interest");
		
		String query = "select * from MEmber where id = "+id;
		System.out.println("오라클 쿼리 : "+ query);
		
		System.out.print(id);
		System.out.print(name);
		System.out.println(Arrays.toString(interest));
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head><title>S01서블릿</title></head>");
		writer.println("<body>");
		writer.println("<h3> 아이디 : "+id+"</h3>");
		writer.println("<h3> 이름 : "+name+"</h3>");
		writer.println("</body></html>");
		writer.close();
	
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// url로 열때, + form태그에서 메서드가 get방식일때
		doAction(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	
	}

}

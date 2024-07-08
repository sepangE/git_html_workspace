package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/S02")
public class S02 extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // post방식 한글깨짐방지
		PrintWriter writer = response.getWriter();
		// 출력을 위한 setContentType
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// 세션만들기
		HttpSession session = request.getSession();
		if(id.equals("aaa") && pw.equals("1111")) {
			session.setAttribute("sessionId", id);
			session.setAttribute("sessionNicName", "홍시");
			session.setAttribute("sessionName", "홍길동");
			response.sendRedirect("main.jsp");
		} else {
			writer.println("<script>");
			writer.println("alert('왜 안되냐 이거');");
			writer.println("location.href='login.jsp?loginCk=0'");
			writer.println("</script>");
			//response.sendRedirect("login.jsp?loginCk=0");
		}
		writer.close();
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);

	}

}

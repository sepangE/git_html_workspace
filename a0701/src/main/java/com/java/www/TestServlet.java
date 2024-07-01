package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet") // 주소를 의미함
// 자바클래스는 상속받은 것이 없지만
// 서블릿같은 경우는 HttpServlet를 상속받음 > 웹에서 접근가능하게 해줌
public class TestServlet extends HttpServlet {
    // 웹에서 접근가능한 파일들은 webapp 아래에 위치
	// 자바파일들은 웹에서 접근하지 못함 > 그런 파일들은 java resource 아래에 위치
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// post로 넘어올수도 있으니 한글 안깨지게 위에 설정해줌
		
		// 모든 타입은 다 스트링으로 넘어온다
		String name = request.getParameter("name");
		System.out.println(name);
		String age = request.getParameter("age");
		System.out.println(age);
		// 숫자로 변경이 필요할 경우 Integer.parseInt(age)
		// 라디오타입
		String gender = request.getParameter("gender");
		System.out.println(gender);
		// 체크박스는 여러개의 값이 함께 전달됨 > [] 배열로 전달 받아야함
		String[] hobbys = request.getParameterValues("hobbys");
		for(int i = 0; i < hobbys.length; i++) {
			System.out.println(hobbys[i]);
		}
	}
	
   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get 방식으로 넘어왔을때 + url에 직접 접근했을때
		// html끼리는 원하는 정보를 주고 받을 수 없다.
		// 전달된 값으로 무언가를 하기 위해서는 java가 필요하고 그 역할을 서블릿이 해줌
		System.out.println("get방식으로 호출됨");
		doAction(request,response);
		
		
		
		
		
		System.out.println("출력. 콘솔창에 출력되는 부분입니다.");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head><title>탭에표시되는제목</title></head></html>");
		writer.println("<body>");
		writer.println("<h2>안녕하세요</h2>");
		writer.println("</body></html>");
		writer.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 방식으로 넘어왔을때
		System.out.println("post방식으로 호출됨");
		doAction(request,response);
	}
	

}

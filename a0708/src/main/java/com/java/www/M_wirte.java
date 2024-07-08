package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/M_wirte")
public class M_wirte extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String hobby = "";
		String id = request.getParameter("mid");
		String pw = request.getParameter("mpw");
		String name = request.getParameter("mname");
		String phone = request.getParameter("mphone");
		String gender = request.getParameter("mgender");
		String[] hobbys = request.getParameterValues("hobby");
		for(int i = 0; i < hobbys.length; i++) {
			if(i==0)hobby+=hobbys[i];
			else hobby+= ","+hobbys[i];
		}
		//System.out.println(id);
		
		String msg = "";
		String url = "";
		// m_write.jsp로부터 가져온 정보들로 멤버객체 생성하기
		MemberDto mdto = new MemberDto(id,pw,name,phone,gender,hobby);
		// 메서드를 위해서 mdao객체 생성
		MemberDao mdao = new MemberDao();
		int result = mdao.insertMember(mdto);
		if(result != 1) {
			msg="회원정보가 저장되지 않음 다시 입력해주세요";
			url="m_write.jsp";
		} else {
			msg="회원정보 저장 완료";
			url="m_main.jsp";
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>회원가입확인</title></head>");
		writer.println("<body>");
		writer.println("<script>");
		writer.println("alert('"+msg+"');");
		writer.println("location.href='"+url+"';");
		writer.println("</script>");
		writer.println("</body>");
		writer.println("</html>");
	
	}
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form태그에서 get 방식일때. url을 직접 입력해서 호출받았을때
		System.out.println("M_write_do Get 호출");
		doAction(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("M_write_do Post 호출");
		doAction(request, response);
	
	}

}

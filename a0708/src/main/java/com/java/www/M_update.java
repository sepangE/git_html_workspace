package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/M_update")
public class M_update extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // post방식 한글깨짐방지
		String id = request.getParameter("mid");
		String phone = request.getParameter("mphone");
		String gender = request.getParameter("mgender");
		String[] hobbys = request.getParameterValues("mhobby");
		String hobby = "";
		for(int i = 0; i < hobbys.length; i ++) {
			if(i==0) hobby += hobbys[i];
			else hobby += ","+ hobbys[i];
		} // for
		
		MemberDao mdao = new MemberDao();
		int result = mdao.memberUpdate(id,phone,gender,hobby);
		
		String msg = "", url ="";
		
		if(result == 1) { // 성공
			msg = "회원정보 수정 완료";
			url = "m_view.jsp?id="+id;
		} else { // 실패
			msg = "회원정보 수정 실패";
			url = "m_view.jsp?id="+id;
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>로그인확인</title></head>");
		writer.println("<body>");
		writer.println("<script>");
		writer.println("alert('"+msg+"');");
		writer.println("location.href='"+url+"';");
		writer.println("</script>");
		writer.println("</body>");
		writer.println("</html>");
	} // doAction
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet방식 호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost방식 호출");
		doAction(request, response);
	}

}

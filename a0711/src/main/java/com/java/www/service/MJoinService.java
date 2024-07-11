package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.MemberDao;
import com.java.www.dto.Member;

public class MJoinService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("uid");
		String pw = request.getParameter("upw");
		String name = request.getParameter("uname");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String hobby = "";
		String[] hobbys = request.getParameterValues("hobby");
		for(int i = 0; i < hobbys.length; i++) {
			if(hobby==null) hobby+=hobbys[i];
			else hobby += ", " +hobbys[i];
		}
		MemberDao mdao = new MemberDao();
		Member m = new Member();
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setPhone(phone);
		m.setGender(gender);
		m.setHobbys(hobby);
		int result = mdao.dojoin(m);
		
		request.setAttribute("result", result);
	}

}

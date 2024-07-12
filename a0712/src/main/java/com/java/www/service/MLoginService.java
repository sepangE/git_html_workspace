package com.java.www.service;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.java.dao.MemberDao;
import com.java.www.dto.Member;

public class MLoginService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		MemberDao mdao = new MemberDao();
		Member m = mdao.selectOne(id,pw);
		System.out.println(m.getId()+", "+m.getMno()+", "+m.getName()+", "+m.getPw()+", ");
		
	
		HttpSession session = request.getSession();
		if(m!=null) {
			session.setAttribute("sessionId", m.getId());
			session.setAttribute("sessionName", m.getName());
		}
		request.setAttribute("m", m);
	}

}

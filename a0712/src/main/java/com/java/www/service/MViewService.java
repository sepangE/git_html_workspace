package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.dao.MemberDao;
import com.java.www.dto.Member;

public class MViewService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("sessionId");
		MemberDao mdao = new MemberDao();
		
		Member m = mdao.showOne(id);
		if(m != null) {
			System.out.println("mview service");
			System.out.println(m.getId());
			System.out.println(m.getName());
			System.out.println(m.getPhone());
		}
		request.setAttribute("member", m);
		

	}

}

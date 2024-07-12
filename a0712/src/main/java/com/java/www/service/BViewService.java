package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.BoardDao;
import com.java.www.dto.Board;

public class BViewService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		//System.out.println(bno);
		BoardDao bdao = new BoardDao();
		Board b = bdao.selectOne(bno);
		
		System.out.println(b.getBcontent());
		
		request.setAttribute("board", b);
	}

}

package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.BoardDao;

public class BDelService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		System.out.println(bno);
		
		BoardDao bdao = new BoardDao();
		int result = bdao.deleteOne(bno);
		
		request.setAttribute("result", result);

	}

}

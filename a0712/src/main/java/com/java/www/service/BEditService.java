package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.BoardDao;
import com.java.www.dto.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BEditService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath = "c:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(
					request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
			int bno = Integer.parseInt(multi.getParameter("bno"));
			System.out.println(bno);
			BoardDao bdao = new BoardDao();
			Board b = new Board();
			String id = multi.getParameter("id");
			String title = multi.getParameter("btitle");
			String content = multi.getParameter("bcontent");
			String file = multi.getFilesystemName("bfile");
			String oldfile = multi.getParameter("oldfile");
			if(file == null) b.setBfile(oldfile);
			else b.setBfile(file);
			b.setId(id);
			b.setBtitle(title);
			b.setBcontent(content);
			b.setBno(bno);
			int result = bdao.modiOne(b);
			request.setAttribute("result", result);
		} catch(Exception e) {e.printStackTrace();}
		
	} // execute

} // class

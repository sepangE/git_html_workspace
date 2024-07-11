package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BWriteService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath = "c:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(
					request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
			String id = multi.getParameter("id");
			String title = multi.getParameter("btitle");
			String content = multi.getParameter("bcontent");
			String file = multi.getFilesystemName("bfile");
			
			BoardDao bdao = new BoardDao();
			Board b = new Board();
			b.setBfile(file);
			b.setBcontent(content);
			b.setBtitle(title);
			b.setId(id);
			int result = bdao.insertOne(b);
			request.setAttribute("result", result);
		} catch (Exception e) {e.printStackTrace();}

	}

}

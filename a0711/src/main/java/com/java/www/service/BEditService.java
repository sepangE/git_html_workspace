package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
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
			String id = multi.getParameter("id").trim();
			String title = multi.getParameter("btitle").trim();
			String content = multi.getParameter("bcontent").trim();
			String file = multi.getFilesystemName("bfile");
		//========================================================//
			int bno = Integer.parseInt(multi.getParameter("bno").trim());
			String oldfile = multi.getParameter("oldfile").trim();
			
			System.out.println("file : "+file);
			System.out.println("oldfile : "+oldfile);
			
			BoardDao bdao = new BoardDao();
			Board b = new Board();
			if(file == null) {
				b.setBfile(oldfile);
			} else {
				b.setBfile(file);
			}
			b.setBcontent(content);
			b.setBtitle(title);
			b.setId(id);
			b.setBno(bno);
			int result = bdao.updateOne(b);
			request.setAttribute("result", result);
		} catch (Exception e) {e.printStackTrace();}

	}

}

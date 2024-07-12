package com.java.www.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.MemberDao;
import com.java.www.dto.Member;

public class MJoinService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("회원가입");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw1");
		String email_h = request.getParameter("mail_id");
		String email_t = request.getParameter("mail_tail");
		String email = email_h+"@"+email_t;
		String postal = request.getParameter("postal");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String addr = postal+","+addr1+","+addr2;
		String f_phone = request.getParameter("f_tell");
		String m_phone = request.getParameter("m_tell");
		String l_phone = request.getParameter("l_tell");
		String phone = f_phone+"-"+m_phone+"-"+l_phone;
		String b_year = request.getParameter("b_year");
		String b_month = request.getParameter("b_month");
		String b_day = request.getParameter("b_day");
		String bday = b_year+"-"+b_month+"-"+b_day+" 0:0:0";
		Timestamp bdate = Timestamp.valueOf(bday);
		String gender = request.getParameter("gender");
//		System.out.println(name+id+pw+email+email_t+postal+addr1+addr2+f_phone+m_phone+l_phone+
//							b_year+b_month+b_day+gender);
//		System.out.println(email);
//		System.out.println(phone);
//		System.out.println(addr);
//		System.out.println(bday);
		MemberDao mdao = new MemberDao();
		Member m = new Member(name,id,pw,email,addr,phone,gender,bdate);
		int result = mdao.insertOne(m);
		request.setAttribute("result", result);
		
	}

}

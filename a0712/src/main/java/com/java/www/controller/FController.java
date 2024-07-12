package com.java.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.service.BDelService;
import com.java.www.service.BEditService;
import com.java.www.service.BListService;
import com.java.www.service.BService;
import com.java.www.service.BViewService;
import com.java.www.service.BWriteService;
import com.java.www.service.MJoinService;
import com.java.www.service.MLoginService;
import com.java.www.service.MService;
import com.java.www.service.MViewService;

@WebServlet("*.do")
public class FController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String fileName = uri.substring(cPath.length());
		String url = "";
		BService bservice = null;
		MService mservice = null;
		System.out.println("파일이름 : "+fileName);
		switch(fileName) {
		case "/main.do":
			url="main.jsp";
			break;
		case "/join.do":
			url = "join.jsp";
			break;
		case "/dojoin.do":
			mservice = new MJoinService();
			mservice.execute(request, response);
			url = "dojoin.jsp";
			break;
		case "/login.do":
			url = "login.jsp";
			break;
		case "/dologin.do":
			mservice = new MLoginService();
			mservice.execute(request, response);
			url = "doLogin.jsp";
			break;
		case "/modiMem.do":
			mservice = new MViewService();
			mservice.execute(request, response);
			url = "modiMem.jsp";
			break;
		case "/domodiMem.do":
			url = "domodiMem.jsp";
			
			
			
			
			
			
		case "/list.do":
			bservice = new BListService();
			bservice.execute(request, response);
			url = "list.jsp";
			break;
		case "/view.do":
			bservice = new BViewService();
			bservice.execute(request, response);
			url = "view.jsp";
			break;
		case "/delete.do":
			bservice = new BDelService();
			bservice.execute(request, response);
			url = "delete.jsp";
			break;
		case "/write.do":
			url = "write.jsp";
			break;
		case "/doWrite.do":
			bservice = new BWriteService();
			bservice.execute(request, response);
			url = "dowrite.jsp";
			break;
		case "/edit.do":
			bservice = new BViewService();
			bservice.execute(request, response);
			url = "edit.jsp";
			break;
		case "/doedit.do":
			bservice = new BEditService();
			bservice.execute(request, response);
			url = "do_edit.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		
	}	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoGet - FController");
		doAction(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoPost - FController");
		doAction(request, response);
	}

}

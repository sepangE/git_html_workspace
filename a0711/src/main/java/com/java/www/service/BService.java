package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BService {
	// 인터페이스는 미완성 메서드로만 구성
	void execute(HttpServletRequest request, HttpServletResponse response);
}

package j0531;

import java.util.Scanner;

public class Member {
	
	//아이디, 이름, 비밀번호, 이메일, 주소, 가입일, 생일 의 속성을 가짐
	String id;
	String name;
	int pwd;
	String email;
	String add;
	int sign;
	int bday;
	// 아이디를 출력해주는 메서드. printId()
	void printId() {
		System.out.println(this.id);
	}
	// 비밀번호를 전달받아(매개변수) 비밀번호를 바꿔주는 메서드
	// resetPw() 메서드를 만들어 보세요
	int resetPw(int npwd) {
		return this.pwd = npwd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

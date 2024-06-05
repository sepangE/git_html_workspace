package j0605;

public class Member {
	// 1. 변수
	String id;
	String name;
	String pwd;
	String email;
	
	//2. 생성자
	Member(){
		
	}
	
	Member(String id, String pwd){
		this.id = id;
		this.pwd = pwd;
	}
	Member(String id, String name, String pwd, String email){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
	void printAtt() {
		System.out.printf("아이디 : %s 이름 : %s 비밀번호 : %s 이메일 : %s\n",id,name,pwd,email);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

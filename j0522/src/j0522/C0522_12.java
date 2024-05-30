package j0522;

import java.util.Scanner;

public class C0522_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 중첩 if문 : if문 안에 if문이 있는것
		
		if(조건식1){
			조건식 1이 참일때 실행되는 코드들
			if(조건식2){
				조건식 1은 참
				조건식 2가 참일때 실행되는 코드들
			}else{
				조건식 1은 참
				조건식 2가 거짓일때 실행되는 코드들
			}
		}else{
			조건식 1이 거짓일때 실행되는 코드들
		}
		*/
		// 19세 이상이면 성인 이하이면 청소년 이라는 if-else문을 만들어보세요
		
		int age = 7;
		
		if(age >= 19) {
			//System.out.println("성인");
			if(age >= 40) {
				System.out.println("중장년 입니다");
			}else
				System.out.println("청년입니다");
		}else {
			//System.out.println("청소년");
			if (age < 14) {
				if(age<8) {
					System.out.println("미취학 아동입니다.");
				}else {
					System.out.println("어린이입니다.");
				}
			}else {
				System.out.println("청소년입니다.");
			}
		}
		
		
		
		String id = "admin";
		String pw = "1111";
		// 아이디랑 비밀번호를 입력받아서
		// 아이디가 같으면 비밀번호가 같은지 비교해서
		// 두개 다 같으면 로그인되었습니다 출력
		// 아이디가 같지만 비밀번호가 틀리면 비밀번호가 틀렸습니다 출력
		// 아이디가 틀렸으면 아이디가 일치하지 않습니다 출력
		System.out.println("아이디를 입력해주세요");
		String uid = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String upw = scan.nextLine();
		if(uid.equals(id)) {
			if(upw.equals(pw)) {
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

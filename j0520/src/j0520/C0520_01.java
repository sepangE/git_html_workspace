package j0520;

public class C0520_01 {

	public static void main(String[] args) {
		
		// 실행 단축키 컨트롤+f11
		/*
		 컨트롤 + 쉬프트 + L : 단축키 리스트
		 컨트롤 +   +  : 글자 키우기
		 컨트롤 +   -  : 글자 축소하기
		 컨트롤 +   d  : 한줄 삭제하기
		 컨트롤 +  알트 + 방향키 아래(위) : 행단위 복사
		 탭 : 들여쓰기
		 쉬프트 + 탭 : 들여쓰기 반대
		 컨트롤 + / : 주석
		 컨트롤 + 쉬프트 + / 두줄이상 주석
		 컨트롤 + 스페이스 : 자동완성
		 	클래스 생성시 main 가져오기 안했을 경우,
		 	main + 컨트롤 + 스페이스 하면 됨
		 	sysout + control + space
				System.out.println();
		 	
		*/ 
		// 한줄 주석을 쓰고싶을때
		/*
		여러줄을 쓰고싶을때는 /*이 안에 작성*/
		
		// 콘솔창에 출력할때 println("안녕하세요"); 사용
		System.out.println("안녕하세요. 자바수업을 진행하겠습니다");
		System.out.println("로그인해주세요 >>");
		System.out.println("아이디 : ");
		System.out.println("비밀번호 : ");
		// print는 줄바꿈 없이 출력
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print(10);
		// 줄바꿈을 하고싶을때
		System.out.print("\n"); // 줄바꿈 방법 1
		System.out.println("줄바꿈은 역슬래시+엔"); // \n이 줄바꿈을 의미
		System.out.print(11);
		System.out.println(); //줄바꿈 방법 2
		System.out.print(12);
		System.out.println();
		// 쌍 따옴표 안에 있는 것은 문자 그대로 출력한다
		System.out.println("5+3");
		System.out.println("안녕하세요");
		System.out.println("안녕"+"하세요");
		System.out.println(2+4);
		System.out.println(4.1234);
		System.out.println("문자"+3);// 문자+숫자는 문자
		System.out.println("문자"+1+2); //문자+문자 = 문자 +2 라서 문자
		System.out.println("문자"+(1+2));
		
		System.out.println(5+3);// 계산의 결과출력
		System.out.println(5-2);
		System.out.println(5*3);
		System.out.println(5/3); // 나누기 같은 경우 정수/정수 -> 정수
		// 실수의 결과를 얻고자 한다면 숫자 두개중 한개는 실수여야함
		System.out.println(5.0/3);  // 실수
		System.out.println(5/3.0);  // 실수
		System.out.println(5.0/3.0);// 실수
		
		System.out.println("문자열"); // 문자열
		System.out.println(100); // 숫자
		int a = 10;
		System.out.println(a); // 변수
		
		
		
		
		
		
		
		
		
	} // 이 안에 실행문 적어야 실행됨
	
	
}

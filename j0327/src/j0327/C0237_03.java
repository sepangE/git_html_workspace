package j0327;

public class C0237_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수
		
		int number = 10;
		number = 1000;
		
		System.out.println(number);
		
		// 변수의 타입
		// 논리형 : 참, 거짓
		boolean b = true; // 참
		boolean b1 = false; // 거짓
		// 선언 전에 값 정하기
		
		boolean b2 ;
		b2 = true; // 변수 초기화
		// 선언 후에 값 정하기
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		
		// 문자형 (한글자)
		char ch1 = ' '; // 공백 없이는 사용할 수 없음
		char ch2 = 'a';
		// char ch3 = 'AB'; 한글자만 넣을 수 있다.
//		char ch4 = " "; 쌍따옴표는 사용할 수 없다.
		char ch5 = 'A';
		char ch6 = '!';
		char ch7 = '가';
		
	    System.out.println(ch7);
	    
	    // 정수형
	    // byte, shortm int, long
	    byte num1 = 1 ;
	    byte num2 = 127; // -128 ~ 127까지 넣을 수 있다
	    byte num3 = -128;
	    
	    short num4 = 10;
	    short num5 = 32767; // -32768 ~ 32767 까지 넣을 수 있음
//	    short num6 = 32768;
	    
	    int num7 = 21;
	    int num8 = 2147483647;
	    // long : int 포함가능 범위 벗어나면 접미사 l 혹은 L 넣어야함
	    long num9 = 21;
	    long num10 = 2147483648l;
	    
	    // 실수형 : float , double
	    // float : 숫자 맨 뒤에 접미사 f , F 넣어주기
	    float num11 = 9.87654321f; // 8자리까지 정밀도 표현 가능
	    System.out.println(num11);
	    
	    // double : 접미사 생략 가능
	    double num12 = 1.123456789012345;  //16자리까지 표현 가능
	    System.out.println(num12);
	    
	    // 자바에서 기본적으로 제공해주는 변수타입
	    // boolean
	    // char
	    // byte, short, int, long
	    // float, double
	    
	    // 문자열 : 쌍따옴표
	    String str1 = "abc";
	    // String 변수명 = "문자열";
	    String str2 = ""; // 빈 공백을 안넣어도 됨
	    
	    System.out.println(str1);
	    

	}

}

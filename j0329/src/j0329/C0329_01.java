package j0329;

public class C0329_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(7); // 정수 출력 가능
		System.out.print(3.14);
		System.out.println("자바!");
		System.out.println("문자열끼리의 "+"연결이 가능합니다.");
		System.out.println("숫자 " + 3 + "과 문자열을 함께 연결 할 수 있습니다.");
		
		
		/*
		변수 선언
		
		
		  변수타입 변수명; // 변수 선언 방법
		  변수타입 변수명 = 값; // 변수 선언과 동시의 값을 초기화
		  
		  변수명은 영문자, 숫자, _, $ 로만 구성될 수 있음
		  변수명은 숫자로 시작 할 수 없음
		  변수명 사이에는 공백 포함 불가
		  자바에서 미리 정의된 단어는 사용할 수 없음
		  
		 
		  */
		  int num;
		  int num1, num2, num3; // 같은 타입이면 동시선언 가능
		  double num4 = 3.14; // 선언과 동시에 초기화
		  double num5 = 1.23, num6 = 10.123;
		  // 같은 타입의 변수를 동시에 선언하면서 초기화
		  // 하지만 이미 선언된 변수를 동시에 초기화 할 수 없음
		  
		  /*
		  자바에는 8가지 기본형 변수타입이 있음
		  논리형 : boolean (참, 거짓)
		  문자형 : char (문자열 한글자만)
		  정수형 : byte short int long
		  실수형 : float, double
		  
		   */
		  boolean b = true;
		  boolean b1=false;
		  
		  System.out.println (b1);
		  
		  char ch='k';
		  System.out.println(ch);
		  
		  int n =10;
		  long l = 100l;
		  
		  float f = 2.12f;
		  double d = 123.456789;
		  
		  
		  // 상수
		  // 변수와 같지만 선언과 동시에 초기화 해주어야 함
		  // final 을 사용해서 선언
		  
		  final double PI = 3.14;
		  
		  
		  
		
		
		
		
		
		

	}

}

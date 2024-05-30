package j0520;

public class C0520_02 {

	public static void main(String[] args) {
		/* 데이터를 저장하기 위해 생성하는 메모리 공간은
		   목적에 따라 크기와 특징이 다른데, 이를 자료형이라고 한다
		   메모리 공간은 자료형에 따라 저장할 수 있는 값의 종류와 특징이 결정됨
		   반드시 자료형을 선언해야함
		   변수의 자료형을 선언할때 변수이름 앞에 자료형을 표기함
		   
		   자료형이 선언되지 않은 변수는 사용할 수 없음
		   한번만 선언해야함 한번 선언된 변수의 자료형은 바꿀 수 없음
		   
		   변수 이름 만들때 반드시 지켜야하는 사항
		   영소문, 영대문, 한글을 사용할 수 있음
		   특수문자는 _ 와 $ 만 사용 가능
		   숫자는 사용가능. 다만 맨 첫글자로는 사용 불가능
		   예약어는 사용할 수 없다
		   
		   권장사항
		   변수는 소문자로 시작하고 카멜표기법을 권장함
		   상수는 변수와 구분을 위해 대문자로 표기 _로 단어연결함
		*/ 
		// 즉, 변수란 하나의 값을 저장할 수 있는 메모리공간
		int number; // 자료형 변수명 ;
		int num = 10; // 자료형 변수명 = 값 ;
		System.out.println(num);
		number = 30;
		System.out.println(number);
		
		int a = 1, b = 2; //같은 타입의 변수는 동시에 선언 가능
		int num1, num2; // 콤마로 동시선언 가능
		// 그러나 동시에 초기화는 불가능
		// num1 = 10; num2 = 20;
		num1 = 10;
		num2 = 20;
		
		// 변수 읽기 : 변수 값이 필요한 곳에 변수 이름을 넣는다
		System.out.println(11+4);
		System.out.println(11-4);
		System.out.println(11*4);
		System.out.println(11/4);
		
		int a1 = 11, b1 = 4;
		System.out.println(a1+b1);
		System.out.println(a1-b1);
		System.out.println(a1*b1);
		System.out.println(a1/b1);
		
		// 변수의 자료형 (변수의 타입)
		// 변수의 타입과 저장할 값의 타입은 일치해야함
		// int는 정수형 타입
		int age = 20; 
		//age = 20.2; // 불일치의 오류 
		// 변수 : 하나의 값을 저장하기 위한 공간
		// 상수 : 한번만 값 저장이 가능한 변수
		
		int score = 100 ; // 변수 선언
		System.out.println(score);
		score = 200; // score에 200 이라는 값으로 변경되어 들어감
		System.out.println(score);
		
		// 상수 : 변수와 마찬가지로 이름을 가지는 메모리 공간으로
		//		 final 키워드를 사용하고 선언과 동시에 반드시 초기화 해야함
		final int SC0 = 100;
		//SC0 = 3;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}// 이 안에 들어있어야 실행문 실행

}

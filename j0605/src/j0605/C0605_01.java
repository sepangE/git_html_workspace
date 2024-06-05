package j0605;

public class C0605_01 {
	public static void main(String[] args) {
		/*
		변수 : 8 가지 기본형 + 참조형 변수 
		기본형 : 
	 	boolean |  char  | byte, short, int, long  | float, double 
		=> 기본타입변수는 메모리에 직접 저장
		
		참조형 : 기본타입을 제외한 배열, 클래스, 인터페이스 등 
		=> 참조타입변수는 객체의 주소를 저장  
		*/		
		// 참조타입 변수는 객체의 주소를 저장
		int n = 2; // 변수값을 메모리에 저장
		System.out.println(n);  //2
		n = 3;
		System.out.println(n); //3
		
		//참조형변수
		int[] arr = new int[5];		//배열을 선언하고 생성
		int[] arr1 = {1,2,3,4,5};	// 배열을 선언하고 생성과 동시에 초기화
		System.out.println(arr1); 	// 주소값
		System.out.println(arr1[0]);// 1
		arr1[0]= 6;
		System.out.println(arr1); 	// 주소는 그대로
		System.out.println(arr1[0]); // 값은 변경 6
		int[] arr2 = arr1;			// 얕은복사
		System.out.println(arr2); 	//arr2는 arr1의 주소값을 저장
		System.out.println(arr2[0]); // arr1[0] 방에 들어있는 6 값과 같다
		// 깊은복사
		int[] arr3 = arr1.clone();
		System.out.println(arr3);	// arr1, 2와는 다른주소. 값만 복사
		
		// 2차원 배열
		int[][] arr4 = new int[2][]; // 2개의 행을 가진 배열을 생성
		arr4[0] = new int[]{1};
		arr4[1] = new int[]{2,3,4};
		System.out.println(arr4); 	// 2차원 배열이 저장되어있는 주소값
		System.out.println(arr4[0]); //2차원 배열중 1행이 저장되어있는 주소값
		// 배열의 값에 접근하려면
		for(int i = 0; i<arr4.length; i++) {
			for(int j = 0; j<arr4[i].length; j++) {
				System.out.println(i+"번째 방의 "+j+"번째 "+arr4[i][j]);
			}
		}
		
		
		// 클래스 객체 선언 및 생성
		Data c1 = new Data();
		c1.x = 3;
		System.out.println(c1);		// 객체의 주소값
		System.out.println(c1.x);	// 객체의 인스턴스 변수값
		
		Data c2 = new Data();
		c2.x = 7;
		System.out.println(c2);
		System.out.println(c2.x);
		
		System.out.println(Data.y);
		// 클래스 변수는 객체를 생성하지 않아도 값을 가져옴
		
		//클래스 배열 새엇ㅇ
		int[]arr5 = new int [5]; // 정수를 담을 수 있는 5칸배열
		//arr5 는 주소를 나타냄
		String[] arr6 = new String[2]; // 문자열 담을 수 있는 2칸배열
		//arr6 = 배열의 주소
		Data[] c3 = new Data[10]; // Data 타입을 담을 수 있는 10칸배열
		// c3 은 배열의 주소
		System.out.println(c3);	//[Lj0605.Data;@cac736f
		// c3은 그냥 배열을 생성한것
		for(int i = 0; i< c3.length; i++) {
			c3[i] = new Data();	// 배열의 각 방에 객체 생성하기
			c3[i].x = i+1;
		}
		for(int i = 0; i<c3.length; i++) {
			System.out.println(c3[i].x);
		}
		
		// 객체를 생성하지 않고 클래스메서드 호출이 가능
		Data.myFunc2(100);
		
		// 객체는 인스턴스 메서드, 클래스 메서드 호출이 가능
		c2.myFunc1(20);		// 지역변수 10(x) + 20=> 30
		c2.myFunc2(30);		// 매개변수30 + 클래스변수10(y) => 40
		
		// 객체 선언 및 생성
		Data c4 = new Data();
		c4.x = 1; // c4 객체의 x값을 1로 초기화
		Data c5 = new Data();
		c5.x = 1; // c5 객체의 x값을 1로 초기화
		
		System.out.println(c4.x); // 1
		c4.plusOne();	  // c4 객체의 x를 1만큼 증가시키는 메서드 호출
		System.out.println(c4.x); // 2
		System.out.println(c5.x); // 1
		// 같은 메서드를 사용할 수 있지만 메서드결과에 영향을 받진 않음
		int r = c5.plusTwo(5);
		System.out.println(c5.x); // 1
		System.out.println(r);	  // 5(매개변수)+2 = 7
		
		int[] ar = {22};
		System.out.println("메서드 호출 전");
		System.out.println(ar);		//주소값
		System.out.println(ar[0]);
		c5.plusThree(ar);			// 메서드 호출
		System.out.println("메서드 호출 후");
		System.out.println(ar);		//주소값
		System.out.println(ar[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

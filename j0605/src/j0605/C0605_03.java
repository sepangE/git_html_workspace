package j0605;

import java.util.Scanner;

public class C0605_03 {
	// 클래스변수
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		C0605_03 c = new C0605_03();
		int a = 0;
		int b = 0;
		int[]arr = new int[2];
		input(arr);
		System.out.println("main "+arr);
		int result = max(arr[0],arr[1]); // 클래스 메서드는 객체선언 없이 사용 가능
		int result2 = c.min(arr[0],arr[1]);
		System.out.println("두 수 중 큰 수는 : "+result);
		System.out.println("두 수 중 작은 수는 : "+result2);
		
	}// main
	
	static void input(int[]arr) {
		System.out.println("input "+arr);
		System.out.println("첫번째 숫자 : ");
		arr[0] = scan.nextInt();
		System.out.println("두번째 숫자 : ");
		arr[1] = scan.nextInt();
	}
//	
//	static int[] input() {
//		int arr[] = new int[2];
//		System.out.println("input "+arr);
//		System.out.println("첫번째 숫자 : ");
//		arr[0] = scan.nextInt();
//		System.out.println("두번째 숫자 : ");
//		arr[1] = scan.nextInt();
//		return arr;
//		// return a, b;	// 리턴은 무조건 한개만 가능
//	}
	
	
	// static이 있으면 클래스메서드 - 객체 선언 없이 사용가능함
	// 클래스명.메소드명으로 호출
	static int max(int a, int b) {
		if(a>b) return a;
		else return b;
		
	}//max
	// static이 없으면 인스턴스메서드 - 객체 선언 후 사용가능
	// 참조변수명.메서드명 으로 호출
	int min (int a, int b) {
		if (a<b) return a;
		else return b;
	} // min
}

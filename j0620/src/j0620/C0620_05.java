package j0620;

public class C0620_05 {
	public static void main(String[] args) throws Exception{
		
		//method3();
		// 책임을 누군가는 꼭 져야함
		System.out.println("프로그램 시작");
		method1();
		method2();
		// method1, method2는 자기 예외를 자기가 처리함
		// try-catch는 예외를 처리하는 구문
		
		// method3, method4는 호출한쪽에서 예외처리 해줘야함;
		try {
			method3();
			method4(); // method3에 오류가 있어서 method4는 실행되지 않음
		}catch(Exception e) {
			System.out.println("메서드에 오류있음");
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
		
		// throw : 예외 발생시키기
		// throws : 예외책임 떠넘기기
	} // main
	
	
	public static void method1() {
		try {
			throw new ArithmeticException("에러1");
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}// method1
	public static void method2() {
		try {
			throw new ArrayIndexOutOfBoundsException("에러2");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}// method2
	// 오류처리 책임을 호출한쪽으로 미루기
	public static void method3() throws ArithmeticException {
			throw new ArithmeticException("에러3");
		
	}// method3
	public static void method4() throws ArrayIndexOutOfBoundsException {
			throw new ArrayIndexOutOfBoundsException("에러4");
	}// method4
	
}

package j0619;

import java.util.Scanner;

public class C0619_05 {
	public static void main(String[] args) {
		// 0 으로 나눈것은 런타임오류에 해당
		//System.out.println(0/0);
		
		System.out.println(1);
		try {
			System.out.println(3); // 실행됨
			System.out.println(0/0); // 오류
			System.out.println(4); // 실행안됨
		} catch (ArithmeticException ae) {
			// 산술적 오류가 있다면 이곳으로 온다
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			//모든 오류를 다루는곳
			System.out.println(e.getMessage());
		} finally {
			// 예외발생여부에 관계없이 항상 수행되어야하는 코드를 넣는다
			// try=catch문의 가장 마지막에 위치해야함
			System.out.println("여기는 오류가 있던 없던 출력이 됩니다");
		}
		System.out.println(5);
		System.out.println("===============================");
		// 예외 발생시키기.
		// 1. 연산자 new를 이용해 발생시키려는 예외클래스 객체를 만든다
		Exception error = new Exception("오류발생!!!");
		// 2. thorw를 이용해서 강제로 예외발생시킨다
		try {
			throw error; // 강제로 예외를 발생을 시킴
		}catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		}catch(Exception e ) {
			System.out.println("Exception!!!");
			System.out.println(e.getMessage());
		}
		System.out.println("===============================");
		Scanner scan = new Scanner(System.in);
		System.out.println("음수를 제외한 숫자를 입력하세요");
		try {
			int num = scan.nextInt(); // 사용자로부터 숫자 입력받음
			if(num < 0) {
				// 만약 사용자가 음수를 입력한다면.. 예외발생시키기
				throw new ArithmeticException("왜 음수를 입력하셨나요");
			}
			System.out.println("음수를 입력하지 않으셨군요");
			System.out.println("입력하신 숫자는 "+num);
		}catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}finally {
			System.out.println("프로그램을 종료합니다");
		}
		
		// 예외를 처리하기 - try - catch
		// 예외를 떠넘기기 throws
		// 예외가 발생할 수 있는 코드를 작성할때 try-catch블럭으로 처리하는것이 기본
		// 하지만 경우에 따라 다른곳에서 예외를 처리하도록 호출한 곳으로 예외를
		// 떠넘길 수 도 있다.
		
		method1(); // static 메서드이기때문에 객체생성없이 메서드를 호출할 수 있다.
		
		try {
			method2();
		}catch (Exception e) {
			System.out.println("메서드2에서 발생한 예외가");
			System.out.println("메인메서드에서 처리됨");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main
	
	static void method1() {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1에서 예외처리가 되었습니다");
		}
	}// method1
	static void method2() {
		
	}
}

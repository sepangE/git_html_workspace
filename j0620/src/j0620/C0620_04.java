package j0620;

import java.util.Scanner;

public class C0620_04 {
	public static void main(String[] args) {
		
		//런타임 에러 - 컴파일러는 잡지못하는데 실행 시 실행안됨
	//	System.out.println(0/0);
		
		System.out.println("프로그램 시작");
		try { // 예외가 발생할 수 있는 코드를 try문 안에 넣는다
			System.out.println(10/0); // 예외사항 발생
			System.out.println(args[0]); // 예외사항 발생
			System.out.println(2);		
		} catch (ArithmeticException ae) {
			System.out.println("산술적 예외사항 발생");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열범위 예외사항 발생");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		} catch(Exception e) {
			System.out.println("예외사항의 조상 (모든예외사항)");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외가 있던 없던 무조건 실행됨");
		}
		System.out.println("프로그램 종료");
		
		
		System.out.println("=====================================");
		Exception error = new Exception("고의로 예외 발생");
		// throw를 사용해서 오류를 발생시킬 수 있다
		System.out.println("프로그램 시작 (고의로 예외 발생)");
		try {
			System.out.println("프로그램 진행중..... ");
			throw error ; // 고의로 예외 발생시킴
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다... ");
		}
		System.out.println("=====================================");
		
		
		// 숫자 두개를 입력받아서 나눗셈 결과를 보여주는데 (무한반복)
		// 0으로 나누어도 오류없이 계속 입력을 받아 결과를 보여주는 코드를 만들어보세요
		
		Scanner scan = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		loop : while(true) {
			System.out.println("숫자 입력 0.종료");
			n1 = scan.nextInt();
			if(n1 == 0) break loop;
			System.out.println("나눌 숫자 입력");
			n2 = scan.nextInt();
			try {
				n3 = n1/n2;
				System.out.println(n1/n2);
			} catch (ArithmeticException e){
				e.printStackTrace();
			}
			System.out.println();
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

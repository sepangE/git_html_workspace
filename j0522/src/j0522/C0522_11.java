package j0522;

import java.util.Scanner;

public class C0522_11 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int balance = 10000000;
		
		// 인출할 금액을 입력받아
		// 만원단위가 아니면 만원단위만 인출합니다 라고 출력
		// 인출하려는 금액이 현재있는 금액보다 크면 잔액이 모자라다고 출력
		// 그 외의 경우 00원을 출금합니다 라고 출력
		System.out.println("출금할 금액을 입력해주세요");
		int n1 = scan.nextInt();
		if(n1 % 10000 != 0) {
			System.out.println("만원단위만 인출합니다");
		}else if(n1 > balance){
			System.out.println("잔액이 모자랍니다.");
		}else {
			System.out.printf("%d원을 출금합니다. 잔액은 %d원 입니다. \n"
					+ "",n1,balance-n1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

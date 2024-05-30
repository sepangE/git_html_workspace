package j0527;

import java.util.Scanner;

public class C0527_04 {
	public static void main(String[] args) {
	//	무한반복 : while(true) 사용하면됨, switch
	Scanner scan = new Scanner(System.in);
		// 연산할 숫자 두개를 입력받아 종료되기전까지 무한히 반복하는
		// 사칙연산 프로그램을 만드세요
		int n1;
		int n2;
		boolean a=true;
		while(a) {
			System.out.println("[사칙연산 프로그램]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("원하는 번호를 입력해주세요(종료:0)");
			int ch = scan.nextInt();
			if (ch==0) break;
			switch (ch) {
				case 1 : 
					System.out.println("첫번째 숫자를 입력해주세요");
					n1 = scan.nextInt();
					System.out.println("두번째 숫자를 입력해주세요");
					n2 = scan.nextInt();
					System.out.printf("%d와 %d를 더한 값은 %d 입니다. \n",n1,n2,n1+n2);
					break;
				case 2 :
					System.out.println("첫번째 숫자를 입력해주세요");
					n1 = scan.nextInt();
					System.out.println("두번째 숫자를 입력해주세요");
					n2 = scan.nextInt();
					System.out.printf("%d에서 %d를 뺀 값은 %d 입니다. \n",n1,n2,n1-n2);
					break;
				case 3 : 
					System.out.println("첫번째 숫자를 입력해주세요");
					n1 = scan.nextInt();
					System.out.println("두번째 숫자를 입력해주세요");
					n2 = scan.nextInt();
					System.out.printf("%d와 %d를 곱한 값은 %d 입니다. \n",n1,n2,n1*n2);
					break;
				case 4 : 
					System.out.println("첫번째 숫자를 입력해주세요");
					n1 = scan.nextInt();
					System.out.println("두번째 숫자를 입력해주세요");
					n2 = scan.nextInt();
					System.out.printf("%d와 %d를 나눈 값은 %d 입니다. \n",n1,n2,n1/n2);
					break;
				default :
					System.out.println("숫자를 잘못 입력하셨습니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

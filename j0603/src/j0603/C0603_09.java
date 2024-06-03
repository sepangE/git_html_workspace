package j0603;

import java.util.Scanner;

public class C0603_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Calculate cal = new Calculate();
		Calculate2 cal2 = new Calculate2();
		long num1 = 5l, num2 = 3l;
		
		cal2.n1 = 5l;
		cal2.n2 = 3l;
		System.out.println(cal2.ADD());
		System.out.println(cal2.SUB());
		System.out.println(cal2.MUL());
		System.out.println(cal2.DIV());
		System.out.println(cal2.remain());
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 수식을 입력받아 (+,-,*,/,%)
		// + 인 경우 5 + 3 = 8 을 출력해보세요
		// 1. 함수를 사용해야함 switch문을 사용해야함.
		System.out.println("수식을 입력해주세요(+,-,*,/,%)");
		String a1 = scan.next();
		switch(a1) {
		case "+" : 
			System.out.printf("%d+%d=%d\n",num1,num2,cal.ADD(num1, num2));
			break;
		case "-" :
			System.out.printf("%d-%d=%d\n",num1,num2,cal.SUB(num1, num2));
			break;
		case "*" :
			System.out.printf("%d*%d=%d\n",num1,num2,cal.AXB(num1, num2));
			break;
		case "/" :
			System.out.printf("%d/%d=%.2f\n",num1,num2,cal.AB(num1, num2));
			break;
		case "%" :
			System.out.printf("%d나머지%d=%d\n",num1,num2,cal.ab(num1, num2));
			break;
		default : System.out.println("잘못입력하셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// 두 수를 입력받아 합과 차를 구해보세요
		System.out.println("첫번째숫자를 입력해주세요");
		int n1 = scan.nextInt();
		System.out.println("두번째숫자를 입력해주세요");
		int n2 = scan.nextInt();
		int r1= cal.add(n1, n2);
		System.out.println(r1);
		int r2= cal.sub(n1, n2);
		System.out.println(r2);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

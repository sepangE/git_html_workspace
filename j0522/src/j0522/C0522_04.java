package j0522;

import java.util.Scanner;

public class C0522_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// nextline으로 2자리 숫자를 입력받아서
		// 27을 입력받는다면
		// 2와 7의 4칙연산을 출력해주세요
		// 2+7 = 9
		// 2-7 = -5
		// 2*7 = 14
		// 2/7 = 0.2 (소수점1자리까지)
		
		String str1;
		System.out.println("2자리 숫자를 입력해주세요");
		str1 = scan.nextLine();
		int a = str1.charAt(0) - '0';
		int b = str1.charAt(1) - '0';
		System.out.printf("%d + %d = %d \n",a,b,a+b);
		System.out.printf("%d - %d = %d \n",a,b,a-b);
		System.out.printf("%d * %d = %d \n",a,b,a*b);
		System.out.printf("%d / %d = %.1f \n",a,b,(double)a/b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

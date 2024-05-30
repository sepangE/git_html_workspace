package j0522;

import java.util.Scanner;

public class C0522_09 {
	public static void main(String[] args) {
		// 숫자를 입력받아 3의 배수이면 입력받은 수에 * 10을 한 값
				// 3의 배수가 아니면 입력받은수에 * 7 한 값을 출력해보세요
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scan.nextInt();
		int r;
		if (n%3==0) {
			r = 10 * n;
		}else {
			r = 7 * n; 
		}
		System.out.println(r);
		// 문자를 입력받아
				// 대문자 면 대문자입니다.
				// 소문자면 소문자 입니다
				// 숫자면 숫자입니다
				// 그외 문자입니다 라고 출력해보세요
		System.out.println("문자를입력하세요");
		String str = scan.next();
		char ch = str.charAt(0);
		
		if(('a'<=ch)&&(ch<='z')) {
			//소문자
			System.out.println("소문자");
		}else if(('A'<=ch)&&(ch<='Z')){
			//대문자
			System.out.println("대문자");
		}else if(('0'<=ch)&&(ch<='9')){
			//숫자
			System.out.println("숫자");
		}else {
			System.out.println("그 외의 문자입니다.");
		}
		
		
		
		
		
		
		
	}
}

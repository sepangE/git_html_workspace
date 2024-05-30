package j0527;

import java.util.Scanner;

public class C0527_05 {
	public static void main(String[] args) {
		// 한글자 알파벳을 입력받아서 랜덤하게 생성된 알파벳과 비교해서
		// 정답이 나올때까지 맞추는 프로그램을 만들어보세요
		// 만약 랜덤생성 알파벳이 a이고 입력한 값이 a면 정답 출력하고 while문 종료
		Scanner scan = new Scanner(System.in);
		
		int a = ((int)(Math.random()*25)+97); // 소문자
		char ch = (char)a;
		int b = a-32;
		char bch = (char)b;
		System.out.println(ch);
		System.out.println(bch);
		while(true) {
			System.out.println("알파벳을 입력해주세요");
			String ch1 = scan.next();
			char ch2 = ch1.charAt(0);
			if(ch2 == ch || ch2 == bch) {
				System.out.println("정답!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

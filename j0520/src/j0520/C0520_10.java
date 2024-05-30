package j0520;

import java.util.Scanner;

public class C0520_10 {
	public static void main(String[] args) {
		//Scanner 실습
		//next(), nexLine() : 문자열
		
		// nextInt()
		Scanner scan = new Scanner (System.in);
		
		System.out.println("정수를 입력해 주세요 ");
		int n1 = scan.nextInt(); // 정수만 입력 가능
		System.out.printf("입력하신 숫자는 : "+ n1);
		
		System.out.println("실수를 입력해 주세요");
		float f1 = scan.nextFloat();
		System.out.printf("입력하신 숫자는 : " + f1);
		
		System.out.println("실수를 입력해 주세요");
		double d1 = scan.nextDouble();
		System.out.printf("입력하신 숫자는 : "+ d1);
		
		// 숫자를 입력받는다는 것은 산술적 계산이 가능하다는걸 의미
		System.out.println("숫자를 입력해주세요 ");
		int n2 = scan.nextInt();
		System.out.printf("입력하신 숫자 * 5 : "+(n2*5));
		
		//나이를 입력받아서 (20)
		//출력: [당신은 내년에 21살 입니다]가 출력이 되도록
		
		System.out.println("나이를 입력해주세요 ");
		int n3 = scan.nextInt();
		System.out.printf("[당신은 내년에 %d살 입니다]",n3+1);
		
		
		
		
		
		
		
	}
}

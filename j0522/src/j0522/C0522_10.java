package j0522;

import java.util.Scanner;

public class C0522_10 {
	public static void main(String[] args) {
		// 숫자 3개를 입력받아 가장 큰 수 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 점수를 입력해주세요");
		int a1 = scan.nextInt();
		System.out.println("두번째 점수를 입력해주세요");
		int a2 = scan.nextInt();
		System.out.println("세번째 점수를 입력해주세요");
		int a3 = scan.nextInt();
		int result= 0;
		
		// 점수 3개를 입력받아서
		// 과락이 존재함 과목 중 하나라도 40점 이하면 불합격
		// 세 과목의 평균이 60점 이하면 불합격
		// 합격
		
		if(a1 <= 40 || a2 <= 40 || a3 <= 40 || (a1+a2+a3)/3 <= 60) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(a1 > a2 && a1 > a3) {
			result = a1;
		}
		if(a2 > a1 && a2 > a3) {
			result = a2;
		}
		if(a3 > a1 && a3 > a2) {
			result = a3;
		}
		System.out.println("가장 큰 수는 : "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

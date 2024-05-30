package j0520;

import java.util.Scanner;

public class C0520_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// 숫자 한개를 입력받아 (8)을 입력받으면
		// 구구단을 출력해보세요 (*3 까지만)
		// 8 * 1 = 8
		// 8 * 2 = 16
		// 8 * 3 = 24
		
		System.out.println("숫자를 입력해 주세요 ");
		int n = scan.nextInt();
		System.out.printf(" %d * 1 = %d\n",n,n*1);
		System.out.printf(" %d * 2 = %d\n",n,n*2);
		System.out.printf(" %d * 3 = %d\n",n,n*3);
		
		System.out.println(" "+n+" * "+4+" = "+(n*4));
		
		// 숫자 두개를 입력받아서 사칙연산을 출력해보세요
		// n1, n2 n1이 5 n2가 3이면
		// 5 + 3 = 8
		// 5 - 3 = 2
		// 5 * 3 = 15
		// 5 / 3 = 1
		// 5 / 3 = 1.67
		System.out.println("숫자를 두개 입력해 주세요 ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.printf(" %d + %d = %d\n",n1, n2, n1+n2);
		System.out.printf(" %d - %d = %d\n",n1, n2, n1-n2);
		System.out.printf(" %d * %d = %d\n",n1, n2, n1*n2);
		System.out.printf(" %d / %d = %d\n",n1, n2, n1/n2);
		System.out.printf(" %d / %d = %.2f\n",n1, n2, (double)n1/n2);
		
		// 국 영 수 점수를 입력받아 100 99 99
		// [홍길동님의 평균은 99.3 입니다] 로 출력
		String name = "홍길동";
		System.out.println("국어 점수를입력해 주세요 ");
		int kor = scan.nextInt();
		System.out.println("영어 점수를입력해 주세요 ");
		int eng = scan.nextInt();
		System.out.println("수학 점수를입력해 주세요 ");
		int math = scan.nextInt();
		int total = kor+eng+math;
		double avg = (double)total/3;
		System.out.printf("[%s님의 평균은 %.1f 입니다]",name,avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

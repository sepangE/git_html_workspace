package j0603;

import java.util.Scanner;

public class C0603_10 {

	public static void main(String[] args) {
		Score sco = new Score();
		Scanner scan = new Scanner(System.in);
		// 숫자 3개를 입력받아 평균이 60점 이상이면 "합격"을 반환
		// 이하면 불합격 반환
		double[] n2 = new double[3];
		System.out.println("각 점수를 3개 입력");
		for(int i = 0; i< n2.length; i++) {
			n2[i] = scan.nextInt();
		}
		System.out.printf("%2.0f점, %2.0f점, %2.0f점으로 %s입니다\n",n2[0],n2[1],n2[2],sco.pass(n2[0],n2[1],n2[2]));
		
		// 평균을 리턴해주는 avg()
		System.out.printf("평균은 %.2f점 \n",sco.avg(n2[0],n2[1],n2[2]));
		// 총점을 리턴해주는 sum()
		System.out.printf("총점은 %2.0f점\n",sco.sum(n2[0],n2[1],n2[2]));
		
		
		// 숫자 두개(두개를 담는 배열)를 입력받아 더 작은값을 반환해주는 함수
		// 만들어 호출
		
		Calculate cal = new Calculate();
		
		
		int[] n1 = new int[2];
		System.out.println("비교할 두 수를 입력");
		for(int i = 0; i < n1.length; i++) {
			n1[i] = scan.nextInt();
		}
		
		System.out.printf("%d와 %d 중 더 작은 수는 %d\n",n1[0],n1[1],cal.min(n1[0],n1[1]));
		System.out.printf("%d와 %d 중 더 큰 수는 %d\n",n1[0],n1[1],cal.max(n1[0],n1[1]));
		// 숫자 3개를 입력받아 가장 작은 수를 반환해주는 함수 만들기
//		System.out.printf("%d와 %d, %d 중 가장 작은 수는 %d\n",n2[0],n2[1],n2[2],cal.Min(n2[0],n2[1],n2[2]));
//		System.out.printf("%d와 %d, %d 중 가장 큰 수는 %d\n",n2[0],n2[1],n2[2],cal.Max(n2[0],n2[1],n2[2]));
		
		// 쵀대값 3항식 사용

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

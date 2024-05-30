package j0530;

import java.util.Scanner;

public class C0530_02 {
	public static void main(String[] args) {
		
		// 정수 10개를 저장하는 배열을 만들고
		// 1~10 사이의 정수를 랜덤하게 생성해서 저장
		// 배열의 요소를 for문으로 하나하나 출력해보고
		// 요소들의 평균 출력
		
		int[] n = new int[10];  //10칸 배열
		int k = 0;				// 랜덤숫자 저장할 변수
		int sum = 0;			// 총합 저장할 변수
		double avg = 0;			// 평균 저장할 변수
		
		
		for(int i = 0; i < n.length; i++) {
			k = (int)(Math.random()*10)+1; 	// 1~10 사이 랜덤숫자
			n[i] = k;						// 랜덤숫자를 n[i]번째에 넣어줌
		}

		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" "); 	// 요소 확인
		}
		System.out.println();
		
		for(int i = 0; i< n.length; i++) {
			sum += n[i]; 
		}
		avg = (double)sum/10;
		System.out.printf("총합은 : %d, 평균은 : %.2f\n",sum,avg);
		
		// scan.next 로 주민등록 번호를 입력받아
		// char 배열에 저장하고
		// 성별표시 제외한 뒤에 6자리는 *로 표현
		// 입력 8304221185600
		// char 배열에는 {'8','3','0','4',...}
		// 출력 8304221******
		Scanner scan = new Scanner(System.in);
		
		char[] ch; 
		String n1;
		
	
		System.out.println("주민등록번호를 입력해주세요");
		n1 = scan.next(); // 주민번호를 입력받아
		ch = new char[n1.length()];
		
		
		for(int i = 0; i<ch.length;i++) {
			ch[i] = n1.charAt(i); // 순서대로 ch[i] 배열에 넣어줌
		}
		
		for(int i = 7; i < ch.length; i++) {
			ch[i] = '*';	// 주민번호의 맨 뒤 6자리를 *로 바꿔줌
		}
		
		for(int i = 0; i< ch.length; i++) {
			System.out.print(ch[i]); // 출력
		}
		System.out.println(); // 줄바꿈
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

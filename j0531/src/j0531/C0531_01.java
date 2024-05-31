package j0531;

import java.util.Arrays;
import java.util.Scanner;

public class C0531_01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		
		// 로또 프로그램
		// 변수선언, 배열생성
		// 로또번호 생성 (1~45 랜덤숫자 6개)
		// 로또번호 입력 (6개, 1~45사이 숫자)
		// 로또번호 확인 (당첨된 숫자, 번호 출력)
		// 출력
		
		// 변수선언 배열생성
		int[] n45 = new int[45]; // 1~45 순차 저장 후 셔플 후 저장
		int[] n6 = new int[6]; // 셔플한거에서 6개 가져옴
		int[] lotto = new int[6]; // 입력받을 번호 저장할 배열
		int k; // 셔플할때 쓸 랜덤숫자
		int tmp; // 셔플할때 쓸 임시저장변수
		int count = 0; // 당첨된 갯수 몇갠지 셀 변수
		
		for(int i = 0; i< n45.length; i++) {
			n45[i] = i+1;
		}
		
		for(int i = 0; i< 500; i++) {
			k = (int)(Math.random()*45);
			tmp = n45[0];
			n45[0] = n45[k];
			n45[k] = tmp;
		}
		
		for (int i = 0; i< n6.length; i++) {
			n6[i] = n45[i];
		}
		
		for(int i = 0; i<lotto.length; i++) {
			System.out.println((i+1)+"번째 로또번호를 입력해주세요 1~45 중복없이");
			lotto[i] = scan.nextInt();
		}
		
		System.out.print("입력한 숫자는 ");
		for(int i = 0; i< lotto.length; i++) {
			System.out.printf("%2d ",lotto[i]);
		}
		System.out.println();
		
		System.out.print("당첨된 번호는 ");
		for(int i = 0; i< lotto.length; i++) {
			System.out.printf("%2d ",n6[i]);
		}
		System.out.println();
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(n6[i] == lotto[j]) {
					System.out.println("당첨입니다!");
					count++;
				} 
			}
		}
		System.out.println("당첨갯수는 "+count);
		System.out.println("꽝!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package j0528;

import java.util.Arrays;
import java.util.Scanner;

public class C0528_06 {
	public static void main(String[] args) {
		
		// 1~100 랜덤한 숫자 하나를 발생시켜 맞추는 프로그램
		// 총 기회는 10번
		// 입력했던 모든 수를 저장함
		// 입력한 숫자가 랜덤숫자보다 크면 [더 작은수를 입력하세요]
		// 입력한 숫자가 랜덤숫자보다 작으면 [더 큰 수를 입력하세요] 라고 출력
		// 무한 반복문으로 만들기
		
		
		//변수선언 
		Scanner scan = new Scanner(System.in);
		int[] n100; 						// 1~100 숫자 순서대로 넣어줄 배열 만들기
		int k; 								// 1~100 사이 랜덤숫자 셔플용
		int tmp; 							// n[0]값을 임시로 저장할 변수 셔플용
		int mnum; 							// 내가 입력한 숫자
		int cnt = 0;					 	// 입력한 횟수 카운팅
		int[] count = new int[10]; 			// 입력한 숫자 저장할 변수
		int rnum; 							// 1~100 사이의 랜덤한 숫자 1개
		n100 = new int[100];				// 배열의 자릿수 정하기
		for(int i = 0; i<n100.length;i++) { 
			n100[i] = i+1; // 1~100까지 순차적으로 넣어줌
		}
		
		k = 0;
		for(int i = 0; i<500;i++) {			// 500번 반복하는 반복문
			k = (int)(Math.random()*100);	// 1~100 사이 랜덤한 숫자 생성
			tmp = n100[0];				  	// tmp에 임시로 n100[0] 값을 넣어줌
			n100[0] = n100[k];				// n100[0]에 n100[k] 값을 넣어줌
			n100[k] = tmp;					// n[k]에 임시로 저장했던 tmp 값을 넣어줌
		}									// n100[0]과 n100[k] 값이 서로 바뀜
		rnum = n100[0];
		loop : while(true) { 				// 무한반복문 loop 라는 별명 만들어줌
			System.out.println("1~100 숫자를 입력해주세요 총 기회 10번 중 "+(cnt+1)+"번째"); // 출력문
			mnum = scan.nextInt(); 			// 입력받을 숫자
			count[cnt] = mnum; 				// 입력받은 숫자를 저장
			System.out.println("입력한 숫자"+count[cnt]+" ");
			if(mnum == rnum) { 				// 랜덤숫자와 같을때
				System.out.println("정답입니다!");
				break loop; 				// 무한반복문에서 탈출
			}else if(mnum > rnum) {			// 입력받은 숫자가 랜덤숫자보다 클때
				System.out.println("더 작은수를 입력해주세요");
			}else if(mnum < rnum) {			// 입력받은 숫자가 랜덤숫자보다 작을때
				System.out.println("더 큰수를 입력해주세요");
			}
			if (cnt == 10) {				// 입력한 횟수가 10회일때
				System.out.println("기회소진! 다음에 다시 도전해보세요!");
				break loop; 				// 무한반복문에서 탈출
			}
			cnt++;							// 입력한 횟수 증가
		}// while
		
		System.out.println("총 도전 횟수는 "+cnt);
		System.out.println("입력했던 숫자들은 ");
		//System.out.println(Arrays.toString(count));
		for(int i = 0; i < cnt; i++) {
			 System.out.print(count[i]+", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package j0529;

import java.util.Arrays;
import java.util.Scanner;

public class C0529_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램 만들기
		
		// 1~45 사이의 랜덤 숫자 6개 생성
		// 사용자가 입력한 6개의 숫자와 비교해서 당첨된 개수와 번호를 출력
		
		// 변수선언
		int [] n45 = new int[45]; 	// 1~45가 순차적으로 들어갈 배열
		int [] rnum = new int[6]; 	// 1~45사이의 랜덤숫자 6개가 들어갈 배열
		int temp;				 	// rnum[0]의 값을 임시로 저장할 변수
		int [] inum = new int[6];	// 입력받을 숫자 6개 저장할 배열
		int k;						// 1~45랜덤생성 숫자 저장할 변수
		int count = 0;				// 당첨된 번호 갯수
		int [] lnum = new int[6];	//  당첨된 번호들
		// 2. 로또 번호 생성 (번호섞기, 6개 로또 만들기)
		for(int i = 0; i<n45.length; i++) {	// n45 배열에 1~45 순서대로 넣기
			n45[i] += i+1;
		}// for 1~45 넣기
		
		for(int i = 0; i<200; i++) {	// 1~45 200번 셔플
			k = (int)(Math.random()*45);
			temp = n45[0];
			n45[0] = n45[k];
			n45[k] = temp;
		}
		
		for(int i = 0; i<rnum.length; i++) { // 로또번호 6개 생성
			rnum[i] = n45[i];
		}
		// 3. 로또 번호 입력
		for(int i = 0; i<rnum.length; i++) { // 숫자 6개 입력받기
			System.out.println((i+1)+"번째 로또번호 6개를 입력해주세요!(1~45 중복없이)");
			inum[i] = scan.nextInt();
		}
		
		// 4. 로또 당첨 번호 확인
		for(int i = 0; i<rnum.length; i++) { // 당첨된 번호 갯수 세기
			for(int j = 0; j<rnum.length; j++) {
				if(inum[i]==rnum[j]) {
					lnum[count]=rnum[i];	// 당첨된 번호 저장하기
					count++;
				}//if
			}//for_j
		}//for_i
		
		// 5. 출력
		System.out.println("입력 번호는 : "+Arrays.toString(inum));
		System.out.println("당첨 개수 : "+count);
		System.out.print("당첨 번호 : ");
		
		for(int i = 0; i< count; i++) {
			if(i==0) {
				System.out.print(lnum[i]);
			}else {
				System.out.print(" , "+lnum[i]);
			}
		}
		System.out.println();
		System.out.println("로또 번호 : "+Arrays.toString(rnum));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

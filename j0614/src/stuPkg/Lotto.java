package stuPkg;

import java.util.Scanner;

public class Lotto {
	static Scanner scan = new Scanner(System.in);
	
	// 2. 1-45 사이의 숫자 넣기
	void lottoInput(int[] n) {
		for(int i = 0; i < n.length; i++) {
			 n[i] = 1+i;
		}
	}
	// 3. 숫자 랜덤하게 섞기 
	void lottoShuffle(int[] n) {
		int k = 0; int tmp;
		for(int i = 0; i < 500; i++) {
			k = (int)(Math.random()*n.length);
			tmp = n[0];
			n[0] = n[k];
			n[k] = tmp;
		}
	}
	// 4. 6개 번호 넣기 
	void myInput(int[] n) {
		System.out.println("1~45사이 숫자 6개 넣기");
		for(int i = 0; i< n.length; i++) {
			System.out.println((i+1)+"번째 숫자 입력");
			n[i] = scan.nextInt();
		}
	}
	// 5. 당첨번호 6개 출력 - 6개의 랜덤한 숫자 
	void lottoPrint(int[] n) {
		for(int i = 0; i< 6; i++) {
			System.out.print("당첨번호 : "+n[i]+" ");
		}
		System.out.println();
	}
	// 6. 자신번호 6개 출력
	void myNumPrint(int[]n) {
		System.out.print("내가 입력한 번호는");
		for(int i = 0; i< n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	// 7. 당첨번호 개수확인 : - win 배열 채우기 
	int lottoCnt(int[] l, int[] ip, int[] w) {
		int n = 0;
		for(int i = 0; i<ip.length; i++) {
			for(int j = 0; j<ip.length; j++) {
				if(l[i]==ip[j]) {
					w[n] =l[i];
					n++;
					break;
				}//if
			}// for-j
		}//for-i
		return n;
	}// lottoCnt
	// 8 당첨번호 개수, 번호 출력 : lottoNo() - 최종결과 출력하기
	void lottoNo(int n, int[]w) {
		System.out.println("당첨된 갯수는 "+n+"개");
		System.out.print("내가 당첨된 번호 : ");
		for(int i = 0; i < w.length; i ++) {
			System.out.print(w[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
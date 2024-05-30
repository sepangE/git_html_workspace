package j0529;

import java.util.Arrays;
import java.util.Scanner;

public class C0529_07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//빙고게임 만들기
		int[][] box = new int [5][5];// 빙고 숫자가 되어줄 2차원 배열
		int[] num = new int[25]; // 1~25 사이 랜덤숫자배열
		String[][]box1 = new String[5][5]; // 선택하면 x로 보여질 배열
		int k = 0, tmp = 0;
		String input;
		
		// num배열에 1~25 채우고 랜덤하게 셔플
		for(int i = 0; i < num.length; i++) {
			num[i]= i+1;
		}
		// 셔플
		for(int i = 0; i < 300; i++) {
			k = (int)(Math.random()*25);
			tmp = num[0];
			num[0] = num[k];
			num[k] = tmp;	
		}
		
		for(int i = 0; i < box.length; i++) {
			for(int j = 0; j<box[i].length; j++) {
				box[i][j] = num[i*box[i].length +j];
				box1[i][j] = ""+num[i*box1[i].length+j];
			}//for-j
		}//for-i
		
		while(true) {
			// 빙고판 출력
			System.out.print("    ");
			for(int i = 0 ; i < box.length ; i++ ) {
				System.out.printf("%3d ",i);
			}
			System.out.println("\n------------------------------------------------------");
			for(int i = 0;i < box1.length; i++) {
				System.out.print(i+"| ");
				for(int j = 0; j<box1[i].length; j++) {
					System.out.printf("%3s ",box1[i][j]);
				}
				System.out.println();
			}
			System.out.println("------------------------------------------------------------");
			System.out.println("좌표를 입력해주세요 (종료 -1)");
			input = scan.next();
			if(input.equals("-1")) break; // -1 입력시 while true 종료
			int n1 = input.charAt(0)-'0'; // 문자를 숫자로 바꾸려면 -'0'
			int n2 = input.charAt(1)-'0';
			box1[n1][n2] = "X";
		}//while-true
			
		
		
		
//		System.out.print("    ");
//		for(int i = 0 ; i < box.length ; i++ ) {
//			System.out.printf("%2d ",i);
//		}
//		System.out.println();
//		for(int i = 0 ; i < box.length ; i ++) { // 2차원 배열 출력문
//			System.out.print(i+" | ");
//			for(int j = 0 ; j < box[i].length; j++) {
//				System.out.printf("%2d ",box[i][j]);
//			}
//			System.out.println("\n------------------------------------------------------");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

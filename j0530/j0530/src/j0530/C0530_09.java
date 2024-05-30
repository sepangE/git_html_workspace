package j0530;

import java.util.Scanner;

public class C0530_09 {
	public static void main(String[] args) {
		// 입력한 좌표를 X로 바꾸는 프로그램 .
		Scanner scan = new Scanner(System.in);
		String[][] box1 = new String[5][5];
		int count = 0;
		
		
		
		
		
		
		for(int i = 0; i < box1.length; i++) {
			for(int j = 0; j < box1[i].length; j++) {
				box1[i][j] = "";
			}
		}
		while(true) {
			System.out.print("    ");
			for(int i = 0 ; i < box1.length; i++) {
				System.out.printf("%3d ", i);
			}
			System.out.println();// 줄바꿈
			System.out.println("-----------------------------------");
			for(int i = 0 ; i< box1.length; i ++) {
				System.out.print(i+"|  ");
				for(int j = 0 ; j < box1[i].length; j++) {
					System.out.printf("%3s ", box1[i][j]);
				}
				System.out.println();// 줄바꿈
			}
			System.out.println("-----------------------------------");
			if(count == 25) break;
			System.out.println("좌표를 입력해주세요");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			if(n1<0 || n1>4 || n2 < 0 || n2 > 4) {
				System.out.println("좌표를 잘못입력하셨습니다");
				continue;
			}
			if(box1[n1][n2] == "") {
				box1[n1][n2] ="O";
			}else {
				System.out.println("이미 변경한 곳입니다.");
				continue;
			}
			
		}//while-true

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

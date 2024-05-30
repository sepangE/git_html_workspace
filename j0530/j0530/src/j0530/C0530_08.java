package j0530;

import java.util.Arrays;
import java.util.Scanner;

public class C0530_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 지뢰찾기
		// 1. 1이  5개 들어있는 5 * 5 배열을 만든다.
		// 1-1. 1이 5개들어잇는 25칸 1차원 배열을 만든다.
		// 1-2. 25칸 배열을 잘 섞는다.
		// 1-3. 5 * 5 배열에 잘 섞은 25칸 배열 값을 넣는다.
		
		// 변수 및 배열선언
		int[][] box = new int[5][5];
		int[] n25 = new int[25];
		String[][] box1 = new String[5][5];
		int count = 0, k = 0, tmp =0;
		
		// 1-1. 1이 5개들어잇는 25칸 1차원 배열을 만든다.
		for(int i = 0 ; i < n25.length; i++) {
			if(count<6) {
				n25[i] = 1;
				count++;
			}
		}
		// 1-2. 25칸 배열을 잘 섞는다.
		for(int i = 0; i< 500; i++) {
			k = (int)(Math.random()*n25.length);
			tmp = n25[0];
			n25[0] = n25[k];
			n25[k] = tmp;
		}
		System.out.println(Arrays.toString(n25));
		// 1-3. 5 * 5 배열에 잘 섞은 25칸 배열 값을 넣는다.
		for(int i = 0; i<box.length; i++) {
			for(int j = 0; j< box[i].length; j++) {
				box[i][j] = n25[i*box[i].length +j];
				box1[i][j] ="";
			}
		}
		System.out.println(Arrays.deepToString(box1));
		
		
		
		
		count=0;
		while(true) {
			System.out.println("[지뢰찾기 게임]");
			System.out.print("    ");
			for(int i = 0; i<box.length; i++) {
				System.out.printf("%3d ",i);
			}
			System.out.println();
			System.out.println("---------------------------------------------------------------------");
			for(int i = 0; i<box.length; i++) {
				System.out.print(i+" | ");
				for(int j = 0; j< box[i].length; j++) {
					System.out.printf("%3s ",box1[i][j]);
				}
				System.out.println();
			}
		
			System.out.println("---------------------------------------------------------------------");
			if(count > 0) {
				System.out.println("펑!");
				break;
			}
			System.out.println("좌표를 입력해주세요 종료 -1");
			String input = scan.next();
			if(input.equals("-1")) break;
			int n1 = input.charAt(0)-'0';
			int n2 = input.charAt(1)-'0';
			if(box[n1][n2] == 1) {
				box1[n1][n2] = "꽝";
				count++;
			
			}else {
				box1[n1][n2] = "X";
				
			}
			
			
			
			
			
			
			
			
		}//while true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package j0529;

public class C0529_10 {

	public static void main(String[] args) {
		/*
		     랜덤숫자00 랜덤숫자01 랜덤숫자02  i=0합
		     랜덤숫자10 랜덤숫자11 랜덤숫자12  i=1합
		     랜덤숫자20 랜덤숫자21 랜덤숫자22  i=2합
		     j=0합     j=1 합    j=2 합    총합
		 
		 */
		int[][] arr = new int[4][4] ; // 전체 숫자들이 들어갈 2차원 배열 
		int iLastN = arr.length - 1;    // 3
		int jLastN = arr[0].length -1 ; // 3
		for (int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0; j<arr[i].length;j++) {
				if( i != iLastN && j !=jLastN ) {
					arr[i][j] = (int)(Math.random()*10)+1;
					arr[i][jLastN] += arr[i][j];
					arr[iLastN][j] += arr[i][j];
					arr[iLastN][jLastN] +=arr[i][j];
				}
			}
		}
		// 출력
		for (int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			
		

	}

}
//package j0529;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class C0529_10 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int[][] gr = new int[4][4]; // 전체 숫자들이 들어갈 2차원배열
//		int[] n16 = new int[16]; 	// 랜덤숫자 들어갈 배열
//		int k = 0;					// 랜덤숫자 임시저장변수
//		for(int i = 0; i<n16.length; i++) {
//			k = (int)(Math.random()*15);
//			n16[i] = k;
//		}
//		System.out.println(Arrays.toString(n16));
//		
//		// 2차원배열 4행4열을 제외한 나머지 행,열들에 값 넣기
//		for(int i = 0; i<gr.length-1; i++) {
//			for(int j = 0; j<gr[i].length-1; j++) {
//				gr[i][j] = n16[i*gr[i].length+j];
//			}
//		}
//		// 출력
//		for(int i = 0; i<gr.length; i++) {
//			for(int j = 0; j<gr[i].length
//					; j++) {
//				System.out.printf("%2d ",gr[i][j]);
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//}

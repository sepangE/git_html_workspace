package j0529;

import java.util.Arrays;

public class C0529_06 {

	public static void main(String[] args) {
		// 2 차원 배열 
		/*
		선언
		1. 타입[][] 배열이름; 
		2. 타입  배열이름[][];
		3. 타입[]  배열이름[][]; 
		생성
		new int[][]
		*/
		
		//배열을 만들고
		int[][] arr = new int[2][3]; 
		
		//배열을 초기화하고
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0 ; j < arr[i].length ; j ++ ) {
				arr[i][j] = 10;
			}// for - j 
		} // for - i
		
		// 배열을 출력
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		 타입[][] 배열이름 = {
		  {배열요소[0][0], 배열요소[0][1],......},
		  {배열요소[1][0], 배열요소[1][1],......},	  
		 }
		*/
		int [][] arr1 = {{10,20,30},{40,50,60}};
		int[][] arr2 = new int[][] {{1,2,3},{4,5,6}};
		
		// dynamic array : 열의 길이가 서로 다를 수 있다.
		int[][] arr3 = new int[3][];
		arr3[0] = new int[2];
		arr3[1] = new int[4];
		arr3[2] = new int[1];
		
		for(int i = 0 ; i < arr3.length ; i ++) {
			for(int j = 0 ; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}		
		int[][] arr4 = {{10,20},{10,20,30,40,},{10}};
		for(int i = 0 ; i < arr4.length ; i ++) {
			for(int j = 0 ; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}		
		
		
		// 4*3 크기의 배열을 만들어서
		// 0~11 까지의 숫자로 초기화해서 출력
		
		int[][] n12 = new int[4][3];
		for(int i = 0; i<n12.length;i++) {
			for(int j = 0; j<n12[i].length;j++) {
				n12[i][j] = i*n12[i].length +(j);
			}
		}
		
		for(int i = 0 ; i < n12.length ; i ++) {
			for(int j = 0 ; j < n12[i].length; j++) {
				System.out.print(n12[i][j]+" ");
			}
			System.out.println();
		}		
		
		
		
		int[] n1 = {1,2,3,4,5,6,7,8,9};
		int[][] n2 = new int[3][3];
		
		for(int i = 0; i<n2.length;i++) {
			for(int j = 0; j<n2[i].length;j++) {
				n2[i][j] = n1[i*n2[i].length] +(j);
			}					
		}

		for(int i = 0 ; i < n2.length ; i ++) {
			for(int j = 0 ; j < n2[i].length; j++) {
				System.out.print(n2[i][j]+" ");
			}
			System.out.println();
		}	
		
		// 소문자 a ~ o 까지 채운 1차원 배열을 만들어보세요 (15개)
		char[] ch = new char[15];
		int count = 97;
		for(int i = 0;i<15;i++) {
			ch[i] = (char)count;
			count++;
		}
		System.out.println(Arrays.toString(ch));
		// 3*5 2차원 배열을 만들어서 그 안에 a-o까지로 채워보세요
		
		char[][] ch1 = new char[3][5];
		for(int i = 0; i< ch1.length; i++) {
			for(int j = 0; j < ch1[i].length; j++) {
					ch1[i][j] = ch[i*ch1[i].length +(j)];
			}
		}
		
		for(int i = 0 ; i < ch1.length ; i ++) { // 2차원 배열 출력문
			for(int j = 0 ; j < ch1[i].length; j++) {
				System.out.print(ch1[i][j]+" ");
			}
			System.out.println();
		}	
		
		//1~25 로 채운 1차원 배열을 만들고
		// 2차원 5*5배열에 채워보세ㅛㅇ
		
		int[] n25 = new int[25];
		for(int i = 0; i<n25.length; i++) {
			n25[i] = i+1;
		}
		System.out.println(Arrays.toString(n25));
		
		int[][] num25 = new int[5][5];
		for(int i = 0; i< num25.length; i++) {
			for(int j = 0; j< num25[i].length; j++) {
				num25[i][j] = n25[i*num25[i].length + j];
			}
		}
		
		for(int i = 0 ; i < num25.length ; i ++) { // 2차원 배열 출력문
			System.out.print(i+" | ");
			for(int j = 0 ; j < num25[i].length; j++) {
				System.out.printf("%2d ",num25[i][j]);
			}
			System.out.println();
		}	
		System.out.println("------------------------------------------------------");
		
		
		
		int[] nb25 = new int[25];
		for(int i = 0; i<nb25.length; i++) {
			nb25[i] = i+1;
		}
		
		int temp = 0, random = 0;
		for(int i = 0; i<200 ; i++) {
			random = (int)(Math.random()*25);
			temp = nb25[0];
			nb25[0] = nb25[random];
			nb25[random] = temp;
		}
		
		// 2차원 5*5배열로 만들기
		int [][] n55 = new int[5][5];
		for(int i=0; i<n55.length; i++) {
			for(int j = 0; j<n55[i].length; j++) {
				n55[i][j] = nb25[i*n55[i].length + j];
			}
		}
		
		for(int i = 0 ; i < n55.length ; i ++) { // 2차원 배열 출력문
			System.out.print(i+" | ");
			for(int j = 0 ; j < n55[i].length; j++) {
				System.out.printf("%2d ",n55[i][j]);
			}
			System.out.println("\n------------------------------------------------------");
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
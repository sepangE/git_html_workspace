package j0530;

import java.util.Arrays;

public class C0530_07 {
	public static void main(String[] args) {
		
		// 2차원 배열
		int[][] arr1 = new int [3][5];
		
		// 각 행마다 다른 열을 개수를 가지고 싶을때 : 가변배열
		int[][] arr2 = new int[2][]; // 열 크기 생략가능
		arr2[0] = new int[4];
		arr2[1] = new int[2];
		
		// 2차원 배열에 접근
		System.out.println(arr1); // arr1의 주소값
		System.out.println(arr1[0]); // arr1[0]의 주소값
		System.out.println(arr1[0][0]); // 실제 값에 접근
		
		int[][] arr3 = {{16,10,6,17,21},{23,5,12,18,3},{19,13,25,1,9}};
		// 배열 속 숫자의 최대값과 최소값을 구해보세요
		
		int max = 1, min = 1;
	
		for(int i = 0; i< arr3.length; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				if(arr3[i][j]>max) {
					max = arr3[i][j];
				}
				if(arr3[i][j]<min) {
					min = arr3[i][j];
				}
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		int[][] arr4 = { {95,86} , {83,92,96},{78,83,93,87,88}};
		// arr4의 총 합계와평균을 구해보세요
		int sum = 0;
		double avg = 0;
		int[] sum1 = new int [arr4.length];
		for(int i = 0; i< arr4.length; i++) {
			for (int j = 0; j <arr4[i].length; j++) {
				sum += arr4[i][j];
				if(i == 0)sum1[i] += arr4[i][j]; 
				if(i == 1)sum1[i] += arr4[i][j]; 
				if(i == 2)sum1[i] += arr4[i][j]; 
			}
			System.out.println(arr4[i].length);
		}
		avg = (double)sum/10;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		for(int i = 0; i < sum1.length; i++) {
			System.out.print(sum1[i]+", ");
		}
		System.out.println();
		
		// 4 * 4 배열을 만드는데.
		// 1-16까지 랜덤한 숫자가 (겹치는 숫자 없이)
		// 들어가는 배열을 만들어보세요
		
		int[][] n4 = new int [4][4];
		int[] n16 = new int [16];
		int tmp = 0;
		int k = 0;
		
		for(int i = 0; i < n16.length; i++) {
			n16[i] = i+1;
		}
		
		for(int i = 0; i<500; i++) {
			k = (int)(Math.random()*n16.length);
			 tmp = n16[0];
			 n16[0] = n16[k];
			 n16[k] = tmp;
		}
		
		for(int i = 0; i < n4.length; i++) {
			for(int j = 0; j < n4[i].length; j++) {
				n4[i][j] = n16[i*n4[i].length +j];
			}
		}
		System.out.println(Arrays.deepToString(n4));
		
		// ++ 6개의 랜덤한 위치에 숫자를 0으로 바꿔보세요
		
		int count = 1;
		
		while(count<7) {
			int n1 = (int)(Math.random()*4); // 0~3 4*4 배열이기때문에
			int n2 = (int)(Math.random()*4); // 0~3 4*4 배열이기때문에
			
			if(n4[n1][n2] != 0) {
				n4[n1][n2] = 0;
				count++;
			}			
		}
		System.out.println(Arrays.deepToString(n4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

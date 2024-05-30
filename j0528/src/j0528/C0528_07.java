package j0528;

import java.util.Arrays;

public class C0528_07 {
	public static void main(String[] args) {
		
		// 2차원 배열
		/*
		1. 선언
		int[][] a;	// 자료형[][] 변수명
		int a[][];	// 자료형 변수명[][]
		int[] a[];	// 자료형[] 변수명[]
		
		차원이 1개씩 늘어날 때마다 [] 대괄호가 하나씩 늘어남
		3차원은 int[][][] a;로 선언가능
		
		int[][] arr;
		arr[0][0]	arr[0][1]	arr[0][2] ....... arr[0][n]
		arr[1][0]	arr[1][1]	arr[1][2] ....... arr[1][n]
		arr[2][0]	arr[2][1]	arr[2][2] ....... arr[2][n]
		..........
		arr[n][0]	arr[n][1]	arr[n][2] ....... arr[n][n]
		*/
		// 선언하는 방법들
		int[][] arr1 = new int[3][3];
		int[][] arr2;
		arr2 = new int[3][3];
		int arr3[][] = new int[3][3];
		int arr4[][];
		arr4 = new int[3][3];
		int[] arr5[] = new int[3][3];
		int[] arr6[];
		arr6 = new int[3][3];
		
		//초기화하기 (값 넣기)
		int[][] a = new int [2][4];		// 2행 4열짜리 배열
		a[0][0] = 1;	a[0][1] = 2;	a[0][2] = 3; a[0][3] = 4;
		a[1][0] = 5;	a[1][1] = 6;	a[1][2] = 7; a[1][3] = 8;
		
		for(int i= 0; i< 2; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		// 배열의 길이
		System.out.println(a.length);		// 행의 길이
		System.out.println(a[0].length);	// [0]번째 행의 열의 길이
		System.out.println(a[1].length);	// [1]번째 행의 열의 길이
		
		// 10*10 배열을 생성하고
		//1~100까지 숫자들을 채워보기
		
		int a10[][] = new int [10][10];
		int temp = 1;
		for(int i = 0; i<a10.length; i++) {
			for(int j = 0; j<a10[i].length; j++) {
				a10[i][j] = temp;
				temp++;
			}
		}
		System.out.println(a10[1][8]);
		
		
		
		// 초기화를 하는 또 다른 방법
		int[][] b = new int[2][]; // 행생성
		b[0] = new int[] {1,2,3,4,5}; // 열 생성
		b[1] = new int[] {6,7,8,9,10};
		
		int[][] c = new int[][] {{1,2,3},{4,5,6}};
		int[][] d;
		d = new int[][] {{2,4,6},{1,3,5}};
		
		// 아래의 경우는 분리해서 표현할 수 없다
		int[][] e = {{10,11,12},{15,16,17}};
		// 행마다 열의 길이를 다르게 할 수 있다.
		int[][] ar1 = new int [3][];
		ar1[0] = new int[1];			//0번째 행 열의 길이를 1로 만듬
		ar1[0][0] = 1;			
		ar1[1] = new int [3];			//1번째 행 열의 길이를 3로 만듬
		ar1[1][0] = 2;
		ar1[1][1] = 2;
		ar1[1][2] = 2;
		ar1[2] = new int[] {3,4,5,6,7};	// 2번째 행 열의 길이를 5로 만듬
		
		System.out.println(ar1.length);
		System.out.println(ar1[0].length);
		System.out.println(ar1[1].length);
		System.out.println(ar1[2].length);
		for(int i = 0; i<ar1.length;i++) {// 전체출력
			for(int j = 0; j<ar1[i].length;j++) {
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
		
		int[] arrA= {1,2,3};
		System.out.println(arrA);
		
		int[][] arr = {{1,2},{1,2,3},{1,2,3,4}};
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]); // 1차원 배열의 주소값을 가져옴
		}
		
		
		// arr 배열에 들어있는 숫자들의 합을 구하세요
		
		int sum = 0, count = 0;
		double avg;
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				sum += arr[i][j];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		// 평균도 구해보기
		
		avg = (double)sum/count;
		System.out.println(avg);
		
		// for-each문 사용 가능
		for(int[] yosoArr : arr) {
			for(int yoso : yosoArr) {
				System.out.print(yoso+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

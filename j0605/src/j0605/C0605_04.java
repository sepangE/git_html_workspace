package j0605;

import java.util.Arrays;
import java.util.Scanner;

public class C0605_04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		C0605_04 c = new C0605_04();
		// 숫자 두개를 입력받아 그 사칙연산의 결과를 r 변수에 담아 출력
		// 출력은 main에서. 사칙연산은 각각 개별의 메서드로 만들어서
		int[] n = new int[5];
		int[] r = new int[4];
		c.input(n);
		
			apb(r,n);
			amib(r,n);
			amub(r,n);
			anb(r,n);
		
		for(int i = 0; i<r.length; i++) {
			System.out.println(r[i]);
		}
		
	}//main
	void input (int []arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i+1)+"번째 숫자 : ");
			arr[i] = scan.nextInt();
		}
	}// 숫자 입력받아 저장하는 메서드
	
	static void apb(int[]arr,int[]arr1) {
		for(int i = 0; i<arr1.length; i++) {
			arr[0] += arr1[i];
		}
	}
	static void amib(int[]arr,int[]arr1) {
		for(int i = 0; i<arr1.length; i++) {
			arr[1] -= arr1[i];
		}
	}
	static void amub(int[]arr,int[]arr1) {
		arr[2] = 1;
		for(int i = 0; i<arr1.length; i++) {
			arr[2] *= arr1[i];
		}
	}
	static void anb(int[]arr,int[]arr1) {
		arr[3] = arr1[0];
		for(int i = 1; i<arr1.length; i++) {
			arr[3] /= arr1[i];
		}
	}
	
}

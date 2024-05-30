package j0530;

import java.util.Arrays;

public class C0530_01 {
	public static void main(String[] args) {
		
		// 배열의 복사
		int[]arr1 = new int[] {1,2,3,4,5};
		int[]arr2 = arr1; // 이 방법은 얕은복사로 주소를 복사함
		
		// 배열을 복사하려면
		// 1.
		int[] arr3 = new int [arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		// 2.
		int[]arr4 = arr1.clone();
		// 3.
		int[] arr5 = Arrays.copyOf(arr1, arr1.length);
		// 4.
		int[] arr6 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr6, 0, arr1.length);
				//      원본배열 시작점 복사배열  시작점 복사할요소 수
		arr1[0] = 10; 
		System.out.println(Arrays.toString(arr1)); 	System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));	System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));	System.out.println(Arrays.toString(arr6));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

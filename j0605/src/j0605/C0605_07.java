package j0605;

public class C0605_07 {
	public static void main(String[] args) {
		int[] arr = {3,2,1,6,5,4};
		
		// 배열의 모든 요소를 출력하는 메소드
		all(arr);
		// 배열을 작은수에서 큰수로 정렬하는 메소드
		stob(arr);
		// 배열에 있는 숫자의 합계를 구하는 메소드
		sum(arr);
	}//main
	
	static void all(int[]arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void stob(int[]arr) {
		int tmp = 0;
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}//if
			}//for-j
		}//for-i
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}// stob
	static void sum(int[]arr) {
		int s = 0;
		for(int i = 0 ; i<arr.length; i++) {
			s += arr[i];
		}
		System.out.println("arr의 총합 : "+s);
	}
}// class

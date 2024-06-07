package j0607;
import java.util.Arrays;
public class C0607_04 {
	public static void main(String[] args) {
		// arr 배열에서 짝수와 홀수를 분리해서 각각의 배열에 저장하는 메서드를 만드세요
		int[] arr = new int[] {37,92,58,46,94,29,25,58};
		int[] odd = new int[arr.length]; // 홀
		int[] even = new int[arr.length]; // 짝
		// myFunc() 라는 함수를 만들어서 해보세요 
		myFunc(arr, odd, even);  // 참조변수를 매개변수로 전달. (주소값전달)
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));
		// arr 의 최대값과 최소값을 얻는 함수를 만들어보세요 
		
		max(arr);
		//객체 생성
		Cal c = new Cal();
		
		// 짝수 홀수를 구분하여 짝수면 true 홀수면 false 리턴
		System.out.println(c.isEven(10)); // true
		System.out.println(c.isEven(11)); // false
		
		// 짝수 홀수를 구분하여 홀수면 true 짝수면 false 리턴
		System.out.println(c.isOdd(10)); //false
		System.out.println(c.isOdd(11)); // true
		// 2의 배수면 true리턴, 아니면 false 리턴
		System.out.println(c.isMulti(10)); // ture
		System.out.println(c.isMulti(11)); // false
		
		// 3의 배수면 true, 아니면 false 리턴
		System.out.println(c.isMulti(9, 3));
		System.out.println(c.isMulti(10,3));
		
		// 5의 배수면 true, 아니면 false 리턴
		System.out.println(c.isMulti(9, 5));
		System.out.println(c.isMulti(10,5));
		
		// 두 수중 큰 값을 리턴
		System.out.println(c.max(10,10));
		System.out.println(c.max(20,5));
		// 배열 내 가장 큰 값을 리턴
		int[] arr1 = {1,7,9,3,8};
		System.out.println(c.max(arr1));
		// 두 수중 작은 값을 리턴
		System.out.println(c.min(10,10));
		System.out.println(c.min(20,5));
		// 배열 내 가장 작은 값을 리턴
		int[] arr2 = {1,7,9,3,8};
		System.out.println(c.min(arr2));
		
	}// main
	// 클래스메서드 - 객체생성없이 사용할 수 있음. 
	static void myFunc(int[] a, int[] o, int[] e) {
		//              매개변수는 주소값을 복사해 온다. 
		int j=0,k=0; // 지역변수 
		for(int i = 0 ; i <a.length; i ++) {
			// 짝수이면 
			if( a[i] % 2 == 0) {
				e[j] = a[i];
				j++; 
			}else { //홀수이면 
				o[k] = a[i];
				k++;
			}
		}
	}
	static void max(int[] ar) {
		for(int i = 0; i<ar.length; i++ ) {
			for(int j = 0; j<ar.length; j++ ) {
				if(ar[i]<ar[j]) {
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}//for-j
		}//for-i
		System.out.println(ar[ar.length-1]);
	}// myFunc
}
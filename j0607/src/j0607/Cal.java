package j0607;

public class Cal {
	int n;
	
	// 짝수인지
	boolean isEven(int a) {
		if (a %2 == 0) return true;
		else return false;
	}
	// 홀수인지
	boolean isOdd(int a) {
		if(a % 2 !=0) return true;
		else return false;
	}
	// 2의 배수인지
	boolean isMulti(int a) {
		if (a %2 == 0) return true;
		else return false;
	}
	// 3의 배수인지
	boolean isMulti(int a, int b) {
		if (a %3 == 0) return true;
		if (b %3 == 0) return true;
		else return false;
	}
	// 5의 배수인지
	boolean isMulti(int a, double b) {
		if (a %5 == 0) return true;
		if (b %5 == 0) return true;
		else return false;
	}
	
	int max (int a, int b) {
		if(a > b) return a;
		else return b;
	}
	int max (int a, double b) {
		if(a > b) return a;
		else return (int)b;
	}
	int max(int[] arr) {
		int x = arr[0];
		for(int i = 0; i < arr.length; i++) {
				if(x<arr[i]) x = arr[i];
			
		}
		return x;
	}
	
	int min(int n1, int n2) {
		if(n1<n2) return n1;
		else return n2;
	}
	int min(int[]arr) {
		int n = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(n > arr[i]) n = arr[i];
		}
		return n;
	}
}

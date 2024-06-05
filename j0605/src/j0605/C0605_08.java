package j0605;

public class C0605_08 {

	public static void main(String[] args) {
		/* 메서드 오버로딩 : 하나의 클래스에 같은 이름의 메서드를 여러개 정의하는 것
		 - 메서드의 이름이 같아야함.
		 - 매개변수의 개수 또는 타입이 달라야함.
		 - 매개변수가 같고 리턴타입이 다를경우 오버로딩이 성립하지 않는다
		*/ 
	} // main
	// 1. 매개변수의 이름이 다른것은 오버로딩이 아니다. 
	int add(int x, int y ) { return x+y;}
/*  int add(int a, int b ) {return a+b;}     */
	// 2. 리턴 타입은 오버로딩의 성립 조건이 아니다. 
/*	long add(int x, int y) { return (long)(x+y); }*/
	// 1. 매개변수의 타입이 다르므로 오버로딩이 성립함.
	long add(int x, long y) { return x+y; }
	long add(long x, int y) { return x+y; }
	// 2. 매개변수는 다르지만 같은 의미의 기능을 수행하는것을 오버로딩이라고함. 
	long add(long x, long y ) { return x+y ; }
	int add(int[] x) { 
		int sum=0; 
		for(int i = 0 ; i<x.length; i++) {
			sum+=x[i];
		}
		return sum; 
	}
	
}// class
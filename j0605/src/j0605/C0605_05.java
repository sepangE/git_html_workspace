package j0605;

import java.util.Scanner;

public class C0605_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 객체생성
		Cal c = new Cal();
		
		c.num1 = 5;
		System.out.println(c.num1); // 객체변수 출력
		
		myFunc1(c.num1);	// 메서드 호출
		int r= myFunc2(c.num1);	// 메서드 호출
		System.out.println(c.num1);	// 메서드 호출 후 객체변수 출력
		System.out.println(r); // 메서드2 결과 출력
		
		// c.num1 = 5
		System.out.println("객체 c의 주소 "+c); // 객체 c의 주소
		myFunc3(c);
		System.out.println(c.num1);
		
		
		
		
		
		
		
		
		// calculate 라는 메서드 만들어서
		// addResult,subResult,mulResult,divResult의 결과값 넣어보기
		Cal d = new Cal();
		System.out.println("첫번째숫자");
		d.num1 = scan.nextInt();
		System.out.println("두번째숫자");
		d.num2 = scan.nextInt();
		calculate(d);
		calculate1(c);
		System.out.println(d.addResult);
		System.out.println(d.subResult);
		System.out.println(d.mulResult);
		System.out.println(d.divResult);
		System.out.println("d의 주소 "+ d);
	}// main
	static void calculate(Cal d) {
		System.out.println("c의 주소 : "+d);
		d.addResult = d.num1+d.num2;
		d.subResult = d.num1-d.num2;
		d.mulResult = d.num1*d.num2;
		d.divResult = (double)d.num1/d.num2;
	}
	static void calculate1(Cal c) {
		c.addResult = c.num1+c.num2;
		c.subResult = c.num1-c.num2;
		c.mulResult = c.num1*c.num2;
		c.divResult = (double)c.num1/c.num2;
	}
	static void myFunc1(int n) {
		n = 100;
		System.out.println("n "+n);
	}
	static int myFunc2(int n) {
		n = 100;
		return n;
	}
	static void myFunc3(Cal a) {
		System.out.println("객체 a의 주소"+a);
		a.num1 = 10;
		System.out.println("a.num1 "+a.num1);
	}
}// class

package j0530;

import java.util.Arrays;

public class C0530_06 {
	
	public static void main(String[] args) {
		/*
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i = 0 ; i < args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		// 숫자 두개를 args로 입력받아서 두 수의 합을 출력해보세요
//		int sum  = 0;
//		for(int i = 0 ; i < args.length; i++) {
//			sum += Integer.parseInt(args[i]);
//		}
//		System.out.println(sum);
		
		int n1,n2;
		String c="";
		
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[2]);
		c = args[1];
		System.out.println(n1+c+n2+"="+(n1*n2));
		
		System.out.println(Arrays.toString(args));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

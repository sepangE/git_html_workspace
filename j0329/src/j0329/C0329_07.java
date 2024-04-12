package j0329;

public class C0329_07 {
	public static void main(String[] args) {
		
		// 변수 a = 20
		// 출력 : 저는 20살 입니다.
		
		int a = 20;
		System.out.printf("저는 %d살 입니다. \n", a);
		
		// 변수 : name = 홍길동, age = 20;
		// 출력 : 저의 이름은 홍길동이고 나이는 20살입니다.
		// printf에서 사용 (%s : 문자열 %d : 정수  %f : 실수)
		
		String name = "홍길동";
		int age = 20;
		
		System.out.printf("저의 이름은 %s이고 나이는 %d살 입니다. \n", name, age);
		
		
		
		
		
		
//		변수를 선언하고 printf를 사용해서 
//		5 + 2 = 7
//		5 - 2 = 3
//		5 * 2 = 10
//		5 / 2 = 2.5
		
		int n1 = 5;
		int n2 = 2;
		
		System.out.printf("%d + %d = %d \n", n1,n2,n1+n2);
		System.out.printf("%d - %d = %d \n", n1,n2,n1-n2);
		System.out.printf("%d * %d = %d \n", n1,n2,n1*n2);
		System.out.printf("%d / %.1f = %.1f \n", n1,(float)n2,(float)n1/n2);
		
		int q = n1+n2;
		int w = n1-n2;
		int e = n1*n2;
		int r = n1/n2;
		
		System.out.printf("%d + %d = %d \n", n1,n2,q);
		System.out.printf("%d - %d = %d \n", n1,n2,w);
		System.out.printf("%d * %d = %d \n", n1,n2,e);
		System.out.printf("%d / %d = %.1f \n", n1,n2,(double)r);
		
		
		// 구구단 2단 출력
		
		int n= 2;
		
		System.out.printf("%d * %d = %d \n", n,1,n*1);
		System.out.printf("%d * %d = %d \n", n,n,n*n);
		System.out.printf("%d * %d = %d \n", n,3,n*3);
		System.out.printf("%d * %d = %d \n", n,4,n*4);
		System.out.printf("%d * %d = %d \n", n,5,n*5);
		System.out.printf("%d * %d = %d \n", n,6,n*6);
		System.out.printf("%d * %d = %d \n", n,7,n*7);
		System.out.printf("%d * %d = %d \n", n,8,n*8);
		System.out.printf("%d * %d = %d \n", n,9,n*9);
		
		double n3=2;
		System.out.printf("%d + %.1f = %.0f \n", n1,n3,n1+n3);
		System.out.printf("%d - %.1f = %.0f \n", n1,n3,n1-n3);
		System.out.printf("%d * %.1f = %.0f \n", n1,n3,n1*n3);
		System.out.printf("%d / %.1f = %.0f \n", n1,n3,n1/n3);
		
	}

}

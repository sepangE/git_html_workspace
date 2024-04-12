package j0329;

public class C0329_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// printf
		
		System.out.print("줄바꿈 없는 출력");
		System.out.println("줄바꿈 있는 출력");
		
		// 실수의 자리수 조절이 불가능
		System.out.println(5/3);
		System.out.println(5.0/3);
		System.out.println(5/3.0);
		
		// printf 를 사용하면 출력형식 지정 가능
		// 정수형 : %d, 실수 : %f, 문자열 : %s
		System.out.println(10);
		System.out.printf("%d \n",10);
		System.out.printf("%.10f \n", 5.0/3);
		
		// \n 줄바꿈 \t 들여쓰기(tab만큼)
		
		
		float f = 100.123456789f;
		System.out.println(f);
		System.out.printf("%3f \n" , f);
		
		System.out.printf("%8d\n", 123);
		System.out.printf("%-8d\n", 123);
		System.out.printf("%08d\n",123);
		
		double pi = 3.14159265;
		System.out.printf("%10.2f\n",pi);
		System.out.printf("%-10.2f\n",pi);
		System.out.printf("%010.2f\n",pi);
		
		

	}

}

package j0520;

public class C0520_07 {
	public static void main(String[] args) {
		// 출력
		
		System.out.print("줄바꿈이 없는 출력 ");
		System.out.print("\n");
		System.out.println("줄바꿈이 포함된 출력");
		System.out.println("다음문장");
		
		// 실수의 자리수 조절 불가능
		System.out.println(5/3);
		System.out.println(5.0/3.0);
		//10진수로만 해야 출력이 됨
		System.out.println(0*100);
		// printf(를 ) 사용하면 출력 형식 지정가능(소수점 자리까지)
		// %f:실수, %d : 정수 %s = 문자열 , %x : 16진수, $c:  문자
		
//		System.out.printf("%.2", 5,0/3.0);
		System.out.printf("print와 같습니다");
		System.out.printf("10진수 : %d \n", 0*100);
		System.out.printf("16진수 : %x \n" , 5,0/3.0);
		//println은 출력 후 enter 키 포함 (즉 줄바꿈포함)
		//print, printf 는 포함되어있지 않아 줄바꿈 하고자 할때 \n 사용
		// \t 를 사용하면 tab키만큼 공백이 출력됨.
		System.out.println("안녕\t하세요\n반갑습니다\n");
		
		String name = "홍길동";
		int age = 27;
		
		System.out.println("이름 : 홍길동, 나이 : 27세");
		System.out.println("이름 :"+"홍길동, 나이 : "+27+"세");
		System.out.println("이름 :"+name+", 나이 : "+age+"세");
		
		System.out.printf("이름 : %s, 나이 : %d세\n", name, age);
		
		// %f 실수형. 숫자로 소수점 이하 자리수를 정할 수 있음
		System.out.printf("%.3f \n",10.12345);
		System.out.printf("%d \n", 1000);
		System.out.printf("16진수 : %x \n",1000);
		System.out.printf("8진수 : %o \n", 1000);
		// 16진수 8진수 등 접두사를 붙이고 싶을경우 #을 사용함
		System.out.printf("16진수 : %#x \n",1000);
		System.out.printf("8진수 : %#o \n", 1000);
		
		float f= 100.123456789f;
		System.out.printf("%f \n",f); // 소수점 6자리 출력
		
		int num=123;
		System.out.printf("[%7d] \n", num);	// 7 칸 오른쪽정렬
		System.out.printf("[%-7d] \n", num);	// 7 칸 왼쪽정렬
		System.out.printf("[%07d] \n", num);	// 7칸 빈공백은 0을 채워서
		
		double pi = 3.14159265;
		System.out.printf("[%7.2f] \n",pi); // 총 7칸 소수점이하 2칸 (소수점포함)
		System.out.printf("[%07.2f] \n",pi); // 총 7칸 소수점 이하 2칸 빈공백 0으로
		
		pi = 3.14;
		System.out.printf("[%7.5f] \n",pi); // 총 7칸 소수점이하 5칸
		
		String str = "https://www.google.com"; //총 22글자
		
		System.out.printf("[%s] \n", str);
		System.out.printf("[%30s] \n", str);
		System.out.printf("[%-30s] \n", str);
		System.out.printf("[%.10s] \n", str);
		
		// 변수 num1 은 20 num2 는 7을 선언 한 후, 두 수를 나눈 값을 
		// 소수점 4ㅈㅏ리까지 출력
		
		int num1 = 20, num2 = 7;
		
		double num3 = (double)num1/num2;
		System.out.printf("[%.4f] \n", num3);
		
		// 변수 n1 은 11.567 n2는 29 로 선언 후 두 수의 합을
		// n1 + n2 = 40.6로 출력해보세요
		
		double n1 = 11.567, n2 = 29;
		double n3 = n1+n2;
		System.out.printf("n1 + n2 = "+"%3.1f \n",n3);
		
		// 변수 kor 100 eng 100 math 100 이라고 선언 후
				// 다음과 같이 출력해보세요
				// 출력 : [합계 : 299, 평균 : 99.67]
		int kor = 100;
		int eng = 100;
		double math = 99;
		int total = kor+eng+(int)math;
		double avg = (double)total/3;
	//	System.out.printf("[합계 : "+total+", 평균 : "+"%.2f]",avg);
		System.out.printf("[합계 : %d, 평균 : %.2f] \n", total,avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

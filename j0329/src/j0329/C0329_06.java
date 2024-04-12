package j0329;

public class C0329_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 선언
		// 변수명 num1 값 10, 변수명 num2 값 3
		// 두 수를 나눠서 소수점 2자리 까지 출력하세요
		
				
		double num1 = 10, num2 = 3;
		System.out.printf("%.2f \n",num1/num2);
		
		// 변수 n1 : 3.14, n2 : 5
		// 출력 [n1+n2의 결과값 : 8.14]
		
		double n1 = 3.14;
		int n2 = 5;
		double r = n1+n2;
		System.out.println(n1+n2);
		System.out.printf("[n1+n2의 결과값 : %.2f] \n", n1+n2 );
		//System.out.printf("n1+n2의 결과값 = \n","%.2f\n",n1+n2);
	
		
		// 변수 : kor :100, eng : 100, math : 99
		// 합계와 평균을 출력하세요 평균은 소수점 2자리까지
		
		int kor = 100, eng = 100, math =99;
		// double kor = 100, eng = 100, math =99;
		int total = kor+eng+math;
		// double avg = (kor+eng+math)/3.0;
		double avg = total/3.0;
		
		System.out.printf("합계 : %d 평균 : %.2f \n", total, avg);
		
		//System.out.printf("%.0f\n", kor+eng+math);
		//System.out.printf("%.2f\n", (kor+eng+math) /3);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

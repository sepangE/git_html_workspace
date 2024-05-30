package j0527;

import java.util.Scanner;

public class C0527_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 반복문 - for, while, do-while
		for(초기식;조건식;증감식){
			조건식이 참일동안 실행되는 코드;
		}
		초기식 > 조건식(참) > 실행코드 > 중괄호끝
		증감식 > 조건식(참) > 실행코드 > 중괄호끝
		증감식 > 조건식(거짓) > for 종료
		
		while(조건식){
			조건식이 참일동안 반복적으로 실행되는 코드;
			증감식; 
		}
		조건식(참) > 실행코드 (증감식이 보통 내부에 있음) > 중괄호끝
		조건식(거짓) > while 종료
		
		초기식;
		do{
			조건식이 참인동안 반복적으로 실행되는 코드(최초1회는 무조건실행)
			증감식;
		} while(조건식); // 세미콜론은 필수
		실행코드 (증감식은 보통 내부에 있음) > 중괄호끝
		조건식(참) > 실행구문 (증감식)> 중괄호끝
		조건식(거짓) > do-while 종료 
		*/
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("for문이 %d번째 반복중입니다. \n",i+1);
		}
		//System.out.printf("for문이 종료된 후 i값은 : %d \n",i);
		// i는 for문 안에서만 사용하는 변수이므로 출력 불가능
		int k = 0; //초기식
		while(k<5) {
			System.out.printf("while문이 %d번째 반복중 \n",k+1);
			k++; //증감식, 생략하게되면 항상 5보다 작기때문에 무한루프
		}
		System.out.printf("while문이 종료된 후 k 값은 %d \n",k);
		int m= 0; //초기식
		do {
			System.out.printf("do-while문이 %d번째 반복중 \n",m+1);
			m++; // 증감식
		}while(m<5);//조건식 반드시 ;로 끝나야함
		System.out.printf("do-while문이 종료된 후 n 값 : %d \n",m);
		
		int p = 7; //초기식
		while(p<5) { // 조건식 (조건을 만족하지 않아 while문 실행x)
			System.out.println("p : "+p);
			p++; // 증감식
		}
		int q = 7; //초기식
		do {
			System.out.println("q : "+q);	
			q++; // 증감식
		} while(q<5); // 조건식 (조건을 만족하지 않아 do-while 종료)
		
		// 1~10 까지의 합
		int sum = 0;
		for(int i = 1; i<11; i++) {
			//System.out.println(i);
			sum = sum+i;
		}
		System.out.println("1~10까지의 합 : "+sum);
		int j = 1;
		sum = 0;
		while(j<11) {
			//System.out.println(j);
			sum+=j;
			j++;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		// 1~100까지 홀수의 합
		int sum100 = 0;
		for(int i = 0; i<=100; i++) {
			if(i % 2 != 0) {
				sum100 += i;
			}
		}
		System.out.println(sum100);
		// 증감식을 사용해서
		sum100 = 0;
		for(int i = 1; i<=100; i+=2) {
			//System.out.println(i);
			sum100 += i;
		}
		System.out.println(sum100);
		
		// 숫자 두개를 입력받아 n1부터 n2까지 합을 구해보세요
		//Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int n1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int n2 = scan.nextInt();
		int sum1=0;
		// n1은 작은값 n2는 큰값이 들어가도록 해야함
		int temp=0; // 임의의 변수를 만들ㅁ
		if(n2<n1) {
			//n1과 n2의 값을 서로 바꿔주어야함
			temp = n1; // temp에 n1의 값을 넣어둠
			n1 = n2; // n1에는 n2의 값이 들어감
			n2 = temp; // n1에는 n2의 값이 들어가있으므로 임시로 넣어준 temp 값을 n2에 넣어줌
		}
		for(int i = n1; i<=n2;i++) {
			sum1 += i;
		}
		System.out.println(n1+"부터 "+n2+"까지의 총 합은 : "+sum1);
		
		
		
		//입력받은 모든 수를 더하기
		//입력 : 1 2 3 4 5 0 > 출력 15
		//입력 : 1 3 5 0 > 출력 9
		
		// if사용
		
		
		// if문 없이
		int a = 1;
		int sum2 = 0;
		while(a != 0) {
			System.out.println("입력받은 모든 수를 더하세요 (종료:0)");
			a = scan.nextInt();
			sum2 += a;
		}
		System.out.println("입력받은 숫자들의 합은 "+sum2);
		
		
		
		
		
		
		
		
		
		
		
	}
}

package j0528;

import java.util.Arrays;

public class C0528_01 {
	public static void main(String[] args) {
		
		// 변수는 한개의 데이터만 저장 할 수 있는 공간이다.
		// 5명의 학생의 성적을 저장해야한다면. 변수는 5개를 만들어야함
		int score1 = 99;
		int score2 = 100;
		int score3 = 95;
		int score4 = 98;
		int score5 = 92;
		// 만약.. 300 명의 학생이라면 ?? 변수를 300개 만드는것은 사실상 어려운 일이다.
		// 같은 형태의 변수들을 묶어서 하나의 변수로 저장하는 것이 효율적이다.
		//  > 배열을 사용한다.
		//배열을 같은 타입의 변수들로 이루어진 유한한 집합으로 정의된다.
		int[] score = {99,100,95,98,92};
		/*
		배열을 구성하는 각각의 값 : 배열 요소 (element)
		 배열의 위치를 가리키는 숫자: 인덱스 (index)
	     자바에서 인덱스는 언제나 0부터 시작하며 , 0과 양수 값만 가질 수 있음.
	     배열은 같은타입의 데이터만 저장할 수 있음. int배열은 int만저장가능
	     한번생성된 배열은 길이를 늘리거나 줄일 수 없음 .
	     1. 배열 선언
	     int[] a1;   - java에서 일반적으로 사용하는 방법
	     int a2[];
	     2. 배열 생성
	     new 키워드를 사용해서 실제 배열로 생성
	     배열이름 = new 타입[배열길이];
	     타입[] 배열이름 = new 타입[배열길이];
		*/
		
		int[] grade1 = new int[3];   // 길이가 3인 int형 배열의 선언 및 생성
		int[] grade2 = new int[3];   // 길이가 3인 int형 배열의 선언 및 생성
		
		grade1[0] = 85; // 인덱스를 사용한 배열의 초기화
		grade1[1] = 90;
		grade1[2] = 100;
		
		//grade1[3] = 99;// 배열의 길이를 초과하는 값은 넣을 수 없다
		// ArrayIndexOutOfBoundsException : 배열의 범위를 초과했다는 오류
		
		
		
		for(int i = 0; i< grade1.length; i++) {
			System.out.println(grade1[i]);
		}
		
		
		int number;
		//System.out.println(number); - 변수의 경우 값을 초기화하지 않으면 값을 출력할 수 없음
		
		// 배열의 경우 자동적으로 값이 초기화되어 출력할 수 있다
		for(int i = 0; i< grade2.length; i++) {
			System.out.println(grade2[i]);
		}
		
		char[] ch = new char[3];
		System.out.println("char 초기값 : "+ch[0]);
		// 자동초기화 값
		// boolean : false, 정수형 : 0, 실수형 : 0.0, 문자열 : null, 문자 : ' ' 
		
		/*
		배열의 초기화. 변수와 마찬가지로 선언과 동시에 초기화 할 수 있다.
		1. 타입[] 배열이름 = {요소1,요소2,요소3,....요소n};
		2. 타입[] 배열이름 = new 타입[]{요소1,요소2,요소3,....요소n};
		*/
		int[] scoreA = {70,90,80,};
		int[] scoreB = new int[] {70,90,80};
		int[] scoreC;
		// scoreC = {70,90,80}; 이 방법은 사용 할 수 없음
		int[] scoreD;
		scoreD = new int[]{70,90,80}; // 이미 선언된 배열은 이 방법으로만 초기화 가능
		
		// 길이가 5인 int형 배열을 선언과 동시에 초기화
		int[] g = {88,93,78,90,65};
		// g 배열에 있는 숫자들의 합을 구해보세요
		int sum=0 ;
		for(int i = 0;i<g.length;i++) {
			sum += g[i];
		}
		System.out.println(sum);
		// 평균은?
		double avg; 
		avg= sum/5.0;
		System.out.println(avg);
		
		// sum/(double)g.length; 이 방법도 있음
		
		
		// 정수 50개를 담는 배열을 만들어서 1~50까지의 숫자를 차례로 넣어주세요
		int[] n50 = new int[50];
		for(int i = 0; i<n50.length;i++) {
			n50[i] = i+1;
		}
		System.out.println(Arrays.toString(n50));
		
		// 정수 10개를 담는 배열을 만들어서 1~45 사이의 랜덤한 숫자를 넣어주세요
		int[] n10 = new int[10];
		for(int i = 0 ; i<n10.length; i++) {
			n10[i] = (int)(Math.random()*45)+1;
		}
		System.out.println(Arrays.toString(n10));
		// 정석적인 배열 안의 값 확인하는법
		for(int i = 0; i<n10.length;i++) {
			System.out.print(n10[i]+"\t");
		}
		
		
		
		
	}
}

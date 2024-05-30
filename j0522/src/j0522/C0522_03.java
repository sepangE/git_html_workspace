package j0522;

import java.util.Scanner;

public class C0522_03 {
	public static void main(String[] args) {
		
		/*
		변수 : 이름, 국, 영, 총점, 평균 
		
		 이름, 국어, 영어 점수를 입력받아 아래와 같이 출력하세요
		 출력
		 --------------------------------
		 이름	국어		영어		총점		평균
		 --------------------------------
		 홍길동   100   90    190   95.00
		*/
		// 입력은 이름, 국어, 영어 점수를 받는데 모두 문자열로 받는다.
		Scanner scan= new Scanner(System.in);
		
		String name, kor,eng;
		int total;
		double avg;
		System.out.println("이름을 입력해 주세요");
		name = scan.nextLine();
		System.out.println("국어점수를 입력해 주세요");
		kor = scan.nextLine();
		System.out.println("영어점수를 입력해 주세요");
		eng = scan.nextLine();
		total = Integer.parseInt(kor)+Integer.parseInt(eng);
		avg = (double)total/2;
		System.out.println("-------------------------------------");
		System.out.println("이름\t국어\t영어\t총점\t평균");
		System.out.println("-------------------------------------");
		System.out.printf("%s\t%s\t%s\t%d\t%.2f",name,kor,eng,total,avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

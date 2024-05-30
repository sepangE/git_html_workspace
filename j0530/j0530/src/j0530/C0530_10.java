package j0530;

import java.util.Scanner;

public class C0530_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 필요한 배열 :
		// String 이름. 
		// double  - 평균.
		// kor, eng, math , total > int   score 변수로 묶어서 사용
				String[] name = {"홍길동", "유관순", "이순신"};
				double[] avg = new double[3];
				
		//int[][] scores = new int[10][4]; // kor, eng, math, total 
		// 행 : 서로다른 학생들 
		// 열 : 점수들
				int[][] scores = { {100,100,100,300} ,
						{90, 90, 90, 270},
						{100, 90, 100, 290}		} ;
				
		// 홍길동의 국어점수는 100입니다.
		// 유관순의 총점은 270입니다 
				
		// 세명의 학생의 평균을 avg배열에 넣어보세요 
				
		System.out.println(name[0]+"의 국어점수는 "+scores[0][0]+"점 입니다.");		
		System.out.println(name[1]+"의 총점은 "+scores[1][3]+"점 입니다.");		
		
		for(int i = 0; i< scores.length; i++) {
			avg[i] = (double)scores[i][3]/3;
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i< name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],scores[i][0],scores[i][1],scores[i][2],scores[i][3],avg[i]);
		}
				
		// 등수매기기 1차원 버전
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		int[][] score = new int[2][4];
		int total = 0;
		// 점수를 입력받아 배열을 채워보세요
		String[] title = {"국어","영어","수학","총점"};
		for(int i = 0; i< score.length; i++) {
			total = 0;
			System.out.println((i+1)+"번째 학생의");
			for (int j = 0; j <score[i].length-1; j++) {
				System.out.println(title[j]+"점수를 입력해주세요 : ");
				score[i][j] = scan.nextInt();
				total += score[i][j];
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

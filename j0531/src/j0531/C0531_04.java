package j0531;

import java.util.Scanner;

public class C0531_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 성적입력 - 출력
		int num = 10;
		String[] name = new String[num];
		int[][] score = new int [num][4]; // 국 영 수 총점
		double[] avg = new double[num];
		int count = 0;
		int total = 0;
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		
		while(true) {
			for (int i = count; i< num; i++) {
				System.out.println((i+1)+"번째 학생의 이름을 입력해주세요 (0. 프로그램 종료)");
				name[i] = scan.next();
				if(name[i].equals("0")) break;
					for(int j = 0; j<score[i].length-1; j++) {
					System.out.println(title[j+1]+"점수를 입력해주세요");
					score[i][j] = scan.nextInt();
					total += score[i][j];
					}
					score[i][3] = total;
					avg[i] = (double)total/3;
					count++;
			}
			
			
			//출력부
			System.out.println("---------------------------------------------------------");
			System.out.println("성적 출력");
			for(int i = 0; i<title.length; i++) {
				System.out.printf("%s\t",title[i]);
			}
			System.out.println();
			System.out.println("---------------------------------------------------------");
			for(int i = 0; i<count; i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}// while true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

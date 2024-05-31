package j0531;

import java.util.Scanner;
public class C0531_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 출력 > 입력 > 검색 > 수정 > 등수 순으로 하시는게 편합니다. 
		// 변수, 배열
		int num = 10;
		int[] sno = new int[num];
		String[] name = new String[num]; // 학생의 이름을 저장할 배열
		int[][] score = new int[num][4];
		double[] avg = new double[num]; // 평균을 저장할 배열
		int[] rank = new int[num]; // 등수를 저장할 배열
		int count = 0 ; // 몇번째 학생이 입력되고있는지 세보기 위한 변수
		int sum = 0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"}; 
		String sname ="";
		int sNo = 0, stNo = 0, no = 0, st = 0;
		int cnt = 0, rcnt = 1;
		
		while(true) {
			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			int input = scan.nextInt();
			
			switch(input) {
			case 1 :
				System.out.println("성적 입력을 선택하셨습니다.");
				for(int i = 0; i< num; i++) {
					System.out.println((count+1)+"번째 학생의 이름을 입력해주세요 0.이전화면");
					name[i] = scan.next();
					sum = 0;
					if(name[i].equals("0")) break;
					for(int j = 0; j< score[i].length-1; j++) {
						System.out.println(title[j+2]+"성적을 입력해주세요");
						score[i][j] = scan.nextInt();
						sum += score[i][j];
					}
					score[i][3] = sum;
					avg[i] = (double)sum/3;
					sno[i] = i+1;
					count++;
				}
				break;
			case 2 : 
				System.out.println("성적 출력을 선택하셨습니다.");
				System.out.println("---------------------------------------------------------");
				for(int i = 0; i< title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				for(int i = 0; i< count; i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",sno[i],name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i],rank[i]);
				}
				break;
			case 3 :
				System.out.println("성적 수정을 선택하셨습니다.");
				System.out.println("수정할 학생의 이름을 입력해주세요 0.이전화면");
				sname = scan.next();
				if(sname.equals("0")) break;
				
				for(int i = 0; i< title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				cnt = 0;
				for(int i = 0; i< count; i++) {
					if(name[i].contains(sname)) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sno[i],name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
					cnt++;
					stNo = i;
					}
				}
				if(cnt == 0) {
					System.out.println("존재하지 않는 학생입니다.");
				}else if(cnt>1) {
					System.out.println("어느 학생의 성적을 수정하시겠습니까?");
					no = scan.nextInt();
					stNo = (no-1);
				}
				System.out.println(name[stNo]+" 학생을 선택하셨습니다.");
				System.out.println("1. 국어 2. 영어 3. 수학 0. 이전화면");
				st = scan.nextInt();
				if(st == 0) break;
				if(st == 1) {
					System.out.println(name[stNo]+"학생의 현재 국어점수 : "+score[stNo][0]);
					System.out.println("수정할 점수를 입력해주세요");
					score[stNo][0] = scan.nextInt();
					sum = score[stNo][0]+score[stNo][1]+score[stNo][2];
					avg[stNo] = (double)sum/3;
				}
				if(st == 2) {
					System.out.println(name[stNo]+"학생의 현재 영어점수 : "+score[stNo][0]);
					System.out.println("수정할 점수를 입력해주세요");
					score[stNo][1] = scan.nextInt();
					sum = score[stNo][0]+score[stNo][1]+score[stNo][2];
					avg[stNo] = (double)sum/3;
				}
				if(st == 3) {
					System.out.println(name[stNo]+"학생의 현재 수학점수 : "+score[stNo][0]);
					System.out.println("수정할 점수를 입력해주세요");
					score[stNo][2] = scan.nextInt();
					sum = score[stNo][0]+score[stNo][1]+score[stNo][2];
					avg[stNo] = (double)sum/3;
				}
				break;
			case 4 :
				for(int i = 0; i< count; i++) {
					rcnt = 1;
					for(int j = 0; j<count; j++ ) {
						if(score[i][3] < score[j][3]) {
							rcnt++;
						}
						rank[i]=rcnt;
					}
				}
				System.out.println("등수 처리가 완료되었습니다.");
				break;
			case 5 : 
				System.out.println("성적 검색을 선택하셨습니다.");
				System.out.println("검색할 이름을 입력해주세요 0. 이전화면");
				sname = scan.next();
				if(sname.equals("0"))break;
				sNo = -1;
				for (int i = 0; i<count; i++) {
					if(name[i].equals(sname)) {
						sNo = i;
					}
				}
				if(sNo == -1) {
					System.out.println("존재하지 않는 학생입니다.");
				}else {
					System.out.println("검색한 학생의 성적은.");
					System.out.println("---------------------------------------------------------");
					for(int i = 0; i< title.length; i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sno[sNo],name[sNo],score[sNo][0],score[sNo][1],score[sNo][2],score[sNo][3],avg[sNo]);
				}
				break;
			
			
			}//switch
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} // while-true

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main

}// class
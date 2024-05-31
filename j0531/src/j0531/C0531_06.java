package j0531;

import java.util.Scanner;

public class C0531_06 {
	public static void main(String[] args) {
		// 학생 성적 수정 - contains
		int[] sno = {1,2,3};
		Scanner scan = new Scanner(System.in);
		String[] name = {"강백호", "서태웅", "강치수"};
		int[][] score = { {40,50,70,160},{10,20,30,60},{90,100,95,285}};
		double[] avg = { 53.33, 20.00, 95.00};
		String[] title = {"번호","이름","국어","영어","수학","총점","평균"};
		String sname = "";
		int stu_no = -1;
		int cnt = 0; // 검색된 학생의 수
		System.out.println("수정하고싶은 학생의 이름을 입력해주세요");
		sname = scan.next();
		
		for(int i = 0; i<title.length; i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
		for(int i = 0; i< name.length; i++) {
			if(name[i].contains(sname)) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sno[i],name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
				cnt++; // 검색된 학생의 수만큼 cnt 증가
				stu_no = i;
			}
		}
		if(cnt == 0) {
			System.out.println("존재하지 않는 학생입니다.");
		}else if(cnt>1) {
			System.out.println("몇번 학생의 성적을 수정하시겠습니까?");
			int no = scan.nextInt();
			stu_no = (no-1); // 인덱스는 0부터 시작하기때문
		}
		System.out.println(name[stu_no]+"학생을 선택하셨습니다");
		System.out.println("1.국어 2.영어 3.수학 원하는 과목 선택");
		int subject = scan.nextInt();
		if(subject == 1) {
			System.out.println(name[stu_no]+"학생의 현재 국어점수 : "+score[stu_no][0]);
			System.out.println("수정할 점수를 입력해주세요");
			score[stu_no][0] = scan.nextInt();
			score[stu_no][3] = score[stu_no][0]+score[stu_no][1]+score[stu_no][2];
			avg[stu_no] = score[stu_no][3]/3.0;
		}
		
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sno[stu_no],name[stu_no],score[stu_no][0],score[stu_no][1],score[stu_no][2],score[stu_no][3],avg[stu_no]);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

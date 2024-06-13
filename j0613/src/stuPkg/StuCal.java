package stuPkg;

import java.util.Scanner;

public class StuCal {
	Scanner scan = new Scanner(System.in);
	Student[] stu = new Student[10];
	String name;
	String sName;
	int kor,eng,math,rank;
	int count;
	double avg;
	int choice; 
	
	
	
	int screenPrint() {
		System.out.println("-------------------- ");
		System.out.println(" [ 성적처리 프로그램 ]");
		System.out.println(" 1. 성적 입력 ");
		System.out.println(" 2. 성적 출력 ");
		System.out.println(" 3. 성적 수정 ");
		System.out.println(" 4. 등수 처리 ");
		System.out.println(" 5. 학생 성적 검색 ");
		System.out.println(" 0. 프로그램 종료 ");
		System.out.println("-------------------- ");
		System.out.println("원하는 번호를 입력하세요 ");
		choice = scan.nextInt();
		return choice; 
	} // screenPrint
	void scoreInput() {
		System.out.println("학생정보 입력");
		System.out.println("이름을 입력해주세요 0.이전화면");
		name = scan.next();
		System.out.println("국어 점수 입력");
		kor = scan.nextInt();
		System.out.println("영어 점수 입력");
		eng = scan.nextInt();
		System.out.println("수학 점수 입력");
		math = scan.nextInt();
		
		stu[count] = new Student(name,kor,eng,math);
		count++;
	} // scoreInput
	void scorePrint() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("--------------------------------------------------------------");
		for(int i = 0; i < count; i++) {
			stu[i].printStuInfo();
		}
	}
	void scoreModify() {
		int no = -1;
		int k = 0;
		System.out.println("검색할 이름 입력 0.이전화면");
		sName = scan.next();
		if(sName.equals("0")) return;
		for(int i = 0; i < count; i++) {
			if(stu[i].name.equals(sName)) {
				no = i; k = 1;
			}
		} //for
		if (k == 0) {
			System.out.println("존재하지 않는 학생입니다.");
			return;
		}
		System.out.println(stu[no].name+"님의 성적을 수정합니다");
		System.out.println("1.국어 2.영어 3.수학 0.이전화면");
		choice = scan.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("수정할 국어점수 입력");
			kor = scan.nextInt();
			stu[no].kor = kor;
			break;
		case 2 :
			System.out.println("수정할 영어점수 입력");
			eng = scan.nextInt();
			stu[no].eng = eng;
			break;
		case 3 :
			System.out.println("수정할 수학점수 입력");
			math = scan.nextInt();
			stu[no].math = math;
			break;
		case 0 :
			break;
		} // switch
		stu[no].reTotal();
		stu[no].reAvg();
	}// scoreModify
	void scoreRank() {
		for(int i = 0; i< count; i++) {
			rank = 1;
			for(int j = 0; j<count; j++) {
				if(stu[i].total<stu[j].total) {
					rank++;
				}
			}//for- j
			stu[i].rank = rank; 
		}//for-i
		System.out.println("등수처리 완료");
	}// scoreRank
	void searchPrint() {
		int k = 0;
		System.out.println("검색할 학생의 이름 입력");
		sName = scan.next();
		for(int i = 0; i< count; i++) {
			if(stu[i].name.equals(sName)) {
				stu[i].printStuInfo();
				k = 1;
			}
		}// for
		if (k == 0) {
			System.out.println("존재하지 않는 학생입니다.");
			return;
		}
	}// searchPrint
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
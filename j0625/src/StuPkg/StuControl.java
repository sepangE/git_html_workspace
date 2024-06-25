package StuPkg;
import java.util.*;
public class StuControl {
	Scanner scan = new Scanner(System.in);
	List<Student> list = new ArrayList<Student>();
	int screenPrint() {
		System.out.println("-------------------- ");
		System.out.println(" [ 성적처리 프로그램 ]");
		System.out.println(" 1. 성적 입력 ");
		System.out.println(" 2. 성적 출력 ");
		System.out.println(" 3. 성적 수정 ");
		System.out.println(" 4. 학생 삭제 ");
		System.out.println(" 5. 등수 처리 ");
		System.out.println(" 6. 학생 성적 검색 ");
		System.out.println(" 0. 프로그램 종료 ");
		System.out.println("-------------------- ");
		System.out.println("원하는 번호를 입력하세요 ");
		int choice = scan.nextInt();
		return choice;
	}
	// 학생입력
	int scoreInput(int stuCnt) {
		while(true) {
			System.out.println();
			System.out.println("[학생 성적 입력]");
			System.out.printf("%d번째 학생의 이름을 입력해주세요 (0.이전)\n",stuCnt);
			String name = scan.next();
			if(name.equals("0")) break; // while문 종료
			System.out.println("국어점수 : ");
			int kor = scan.nextInt();
			System.out.println("영어점수 : ");
			int eng = scan.nextInt();
			System.out.println("수학점수 : ");
			int math = scan.nextInt();
			list.add(new Student(name,kor,eng,math));
			System.out.printf("%d번째 학생의 정보가 저장됨\n",stuCnt);
			System.out.println();
			stuCnt++;			
		}
		return stuCnt;
	}
	// 성적 출력
	void scorePrint() {
		System.out.println();
		System.out.println("[학생 성적 출력]");
		System.out.println("======================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	// 성적 수정
	void scoreModify() {
		int a = 0;
		int no = -1;
		System.out.println();
		System.out.println("[학생 성적 수정]");
		System.out.println("수정할 학생의 이름 입력 (0.이전화면)");
		String name = scan.next();
		if(name.equals("0"))return;
		System.out.println("======================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================================");
		for(int i = 0; i < list.size(); i ++) {
			// i번재 리스트에 있는 이름이 내가 검색한 이름과 같다면
			if(list.get(i).getName().equals(name)) {
			System.out.println(list.get(i));
			a = 1;
			no = i; 
			}//if
		}//for
		if (a==1) {
			System.out.println(name+"학생 성적 수정함");
			System.out.println("[수정 과목 선택]");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 ://국어 수정
				System.out.println("국어 수정");
				System.out.println("현재 국어점수 : "+list.get(no).getKor());
				System.out.println("수정할 점수 입력");
				int msk = scan.nextInt();
				list.get(no).setKor(msk);
				System.out.println("국어점수 수정됨");
				break;
			case 2 : // 영어
				System.out.println("영어 수정");
				System.out.println("현재 국어점수 : "+list.get(no).getEng());
				System.out.println("수정할 점수 입력");
				int mse = scan.nextInt();
				list.get(no).setEng(mse);
				System.out.println("영어점수 수정됨");
				break;
			case 3 : //수학
				System.out.println("수학 수정");
				System.out.println("현재 국어점수 : "+list.get(no).getMath());
				System.out.println("수정할 점수 입력");
				int msm = scan.nextInt();
				list.get(no).setMath(msm);
				System.out.println("국어점수 수정됨");
				break;
			}// switch
			// 평균 총점 수정
			list.get(no).setTotal(list.get(no).getKor()+list.get(no).getEng()+list.get(no).getMath());
			list.get(no).setAvg(list.get(no).getTotal()/3.0);
		}// if
		if (a == 0)System.out.println("존재하지 않는 학생임");
	}//scoreModify
	// 학생 정보 삭제
	void scoreDelete() {
		int a = 0;
		int no = -1;
		System.out.println();
		System.out.println("[학생 정보 삭제]");
		System.out.println("삭제할 학생의 이름 입력 (0.이전화면)");
		String name = scan.next();
		if(name.equals("0"))return;
		System.out.println("======================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================================");
		for(int i = 0; i < list.size(); i ++) {
			// i번재 리스트에 있는 이름이 내가 검색한 이름과 같다면
			if(list.get(i).getName().equals(name)) {
			System.out.println(list.get(i));
			a = 1;
			no = i;
			}//if
		}//for
		System.out.println("진짜로 삭제함? 1:ㅇㅇ 2:ㄴㄴ");
		int choice = scan.nextInt();
		if(choice == 1) {
			list.remove(no);
			System.out.println(name+"학생의 정보 삭제 완료됨");
		}else if(choice == 2){
			System.out.println("삭제 취소함");
			return;
		}else System.out.println("잘못입력함"); 
		if (a == 0)System.out.println("존재하지 않는 학생임");
	}
	// 랭크설정
	void scoreRank() {
		System.out.println();
		System.out.println("[학생 성적 등수 처리]");
		System.out.println("======================================================================");
		for(int i = 0; i < list.size(); i++) {
			int rank = 1;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).getAvg()<list.get(j).getAvg()) {
					rank++;
				}//if
			}//for - j
			list.get(i).setRank(rank);
		}// for - i
		System.out.println("등수처리 완료");
	}// scoreRank
	// 성적 검색출력
	void searchPrint() {
		int a = 0;
		System.out.println();
		System.out.println("[학생 성적 검색]");
		System.out.println("검색할 학생의 이름 입력 (0.이전화면)");
		String name = scan.next();
		if(name.equals("0"))return;
		System.out.println("======================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================================");
		for(int i = 0; i < list.size(); i ++) {
			// i번재 리스트에 있는 이름이 내가 검색한 이름과 같다면
			//if(list.get(i).getName().equals(name)) {
			// i번재 리스트에 있는 이름이 내가 검색한 이름을 포함한다면
			if(list.get(i).getName().contains(name)) {
			System.out.println(list.get(i));
			a = 1;
			}//if
		}//for
		if (a == 0)System.out.println("존재하지 않는 학생임");
	}//searchPrint
	
}// class

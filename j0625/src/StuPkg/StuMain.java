package StuPkg;
import java.util.*;
public class StuMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuControl sc = new StuControl();
		int stuCnt = 1;
		loop: while(true) {
			int choice = sc.screenPrint();
			switch(choice) {
			case 1: // 학생입력
				stuCnt = sc.scoreInput(stuCnt);
				break;
			case 2 : // 성적 출력
				sc.scorePrint();
				break;
			case 3 : // 성적 수정
				sc.scoreModify();
				break;
			case 4 : // 학생 정보 삭제
				sc.scoreDelete();
				break;
			case 5 : // 랭크설정
				sc.scoreRank();
				break;
			case 6 : // 성적 검색해서 보기
				sc.searchPrint();
				break;
			case 0 :
				System.out.println("프로그램 종료");
				break loop;
			}
		}
	}

}

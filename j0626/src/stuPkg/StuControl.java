package stuPkg;
import java.util.*;
public class StuControl {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	// 화면 출력
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
	public void scoreInput() {
		System.out.println("[성적 입력]");
		System.out.println("이름 입력 (0. 종료)");
		String name = scan.next();
		if(name.equals("0")) return;
		System.out.println("국어점수 입력");
		int kor = scan.nextInt();
		System.out.println("영어점수 입력");
		int eng = scan.nextInt();
		System.out.println("수학점수 입력");
		int math = scan.nextInt();
		list.add(new Student(name,kor,eng,math));
		System.out.println("성적입력 완료");
	} // scoreInput
	
	public void scorePrint() {
		System.out.println("[성적 출력]");
		System.out.println("-------------------------------------------------------------- ");
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------- ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	} // scorePrint
	
	public void scoreModify() {
		String sName ="";
		int a = 0;
		int no = -1;
		System.out.println("[성적 수정]");
		System.out.println("수정할 학생 이름 입력 (0. 이전화면)");
		sName = scan.next();
		if(sName.equals("0")) return;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(sName)) {
				System.out.println(sName+"의 성적");
				System.out.println("국어 : "+list.get(i).getKor());
				System.out.println("영어 : "+list.get(i).getEng());
				System.out.println("수학 : "+list.get(i).getMath());
				no = i; a = 1;
			}//if
		} // for
		System.out.println("수정할 과목 선택");
		System.out.println("1. 국어 2. 영어 3. 수학");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("[국어 성적 수정]");
			System.out.println("수정할 점수 입력");
			int scorek = scan.nextInt();
			list.get(no).setKor(scorek);
			break;
		case 2:
			System.out.println("[국어 성적 수정]");
			System.out.println("수정할 점수 입력");
			int scoree = scan.nextInt();
			list.get(no).setEng(scoree);
			break;
		case 3:
			System.out.println("[국어 성적 수정]");
			System.out.println("수정할 점수 입력");
			int scorem = scan.nextInt();
			list.get(no).setMath(scorem);
			break;
		}//switch
		list.get(no).setTotal(list.get(no).getKor()+list.get(no).getEng()+list.get(no).getMath());
		list.get(no).setAvg(list.get(no).getTotal()/3.0);
		if(a==0) System.out.println("존재하지 않는 학생");
		System.out.println("수정완료");
	} // scoreModify
	
	public void scoreDelete() {
		int no = -1;
		int a = 0;			
		System.out.println("[학생 정보 삭제]");
		System.out.println("삭제할 학생 이름 입력");
		String sName = scan.next();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(sName)) {
				System.out.println(list.get(i));
				no = i;
			}//if
		}//for
		if(no != -1) {
			System.out.println(sName+"의 정보를 삭제하시겠습니까?");
			System.out.println("1. 예, 2. 아니오");
			int choice = scan.nextInt();
			switch(choice){
			case 1 :
				list.remove(list.get(no));
				System.out.println("정보 삭제 완료.");
				break;
			case 2 :
				System.out.println("정보 삭제를 취소합니다.");
				break;
			}//switch
		}
		else System.out.println("존재하지 않는 학생");
	}// scoreDelete
	
	public void scoreRank() {
		for(int i = 0; i < list.size(); i++) {
			int rank = 1;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).getAvg()<list.get(j).getAvg()) {
					rank++;
				}//if
			}//for-j
			list.get(i).setRank(rank);
		}//for-i
		System.out.println("등수처리 완료");
	}// scoreRank
	
	public void searchPrint() {
		int a = 0;
		System.out.println("[학생 성적 검색]");
		String sName ="";
		System.out.println("검색할 학생 이름 입력 (0. 이전화면)");
		sName = scan.next();
		if(sName.equals("0")) return;
		System.out.println("-------------------------------------------------------------- ");
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------- ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(sName)) {
				System.out.println(list.get(i));
				a = 1;
				return;
			}//if
		}//for
		if(a==0);System.out.println("존재하지 않는 학생");
	}// searchPrint
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
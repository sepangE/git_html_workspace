package j0628;
import java.util.*;
public class C0628_01 {
	// 스캐너 사용을 위해 static 으로 생성
	static Scanner scan = new Scanner(System.in);
	// 전시매니져 객체 생성
	static ExhibitManager Exm = new ExhibitManager();
	public static void main(String[] args) {
		loop : while(true) {
			System.out.println("[이벤트 상품 관리 프로그램]");
			System.out.println("1. 새 이벤트 추가");
			System.out.println("2. 전체 이벤트 조회");
			System.out.println("3. 이벤트 조회");
			System.out.println("4. 이벤트 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("=====================");
			int input = scan.nextInt();
			switch(input) {
			case 1:
				insertMap(); break;
			case 2:
				selectMap(); break;
			case 3 :
				searchMenu(); break;
			case 4 :
				deleteMenu(); break;
			case 0:
				System.out.println("종료합니다"); break loop;
			}//switch
		}// while(true)
	} // main
	static void insertMap() {
		System.out.println("이벤트명 : ");
		String title = scan.next();
		System.out.println("카테고리 1.전시 2.체험 3.박람회");
		int category = scan.nextInt();
		System.out.println("개최지 1.서울 2.부산 3.제주");
		int place = scan.nextInt();
		Exm.insertExhibit(new Exhibit(title, category, place));
	}
	static void selectMap() {
		Map<Integer, Exhibit> map = Exm.selectMap();
		if(map.isEmpty()) {
			System.out.println("전시회가 없습니다.");
		}else {
			System.out.println("전시회 정보");
			System.out.println("==========================");
			for(int i : map.keySet()) {
				System.out.println(i+" : "+ map.get(i));
			}// for map
		}// if - else
	} // selectMap()
	static void searchMenu() {
		System.out.println("이벤트명 : ");
		String title = scan.next();
		Map<Integer, Exhibit> map = Exm.searchMap(title);
		if(map.isEmpty()) {
			System.out.println("검색하신 이벤트는 없음");
		}else {
			for(Integer i : map.keySet()) {
				System.out.println(i+" : "+map.get(i));
			}// for map.keySet
		}// if - else
	}// searchMenu()
	
	static void deleteMenu() {
		// 번호가 키값 키는 중복x
		System.out.println("삭제할 이벤트 번호 : ");
		int no = scan.nextInt();
		int result = Exm.deleteMap(no);
		if(result > 0) {
			System.out.println("성공적으로 삭제함");
		}else {
			System.out.println("삭제할 이벤트가 없음");
		}
	}
	
}// class

package j0626;
import java.util.*;
public class C0626_03_카페_아메리카노_라떼활용 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice;
		List<Cafe> list = new ArrayList<Cafe>();
		loop: while(true) {
			System.out.println("[주문하기]");
			System.out.println("1. 아메리카노");
			System.out.println("2. 라떼");
			System.out.println("3. 주문목록");
			System.out.println("4. 총 주문 금액");
			System.out.println("0. 프로그램 종료");
			System.out.println("===================================");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				orderAme(list);
				break;
			case 2 :
				orderLatte(list);
				break;
			case 3 :
				printOrderList(list);
				break;
			case 4 :
				int price = CalPrice(list);
				System.out.println("총 주문금액은 : "+price+"원");
				break;
			case 0 :
				System.out.println("종료합니다");
				break loop;
			}
			
		}//while
	} // main
	
	static void orderAme(List<Cafe> list) { // list 전달받음
		boolean IoH = false;			// ice인지 hot인지 저장하는 변수
		System.out.println("아메리카노 선택");
		System.out.println("1. 핫, 2. 아이스, 0. 주문취소");
		int choiceHot = scan.nextInt();					// 핫, 아이스, 주문취소 입력받음
		if(choiceHot == 0) {
			System.out.println("주문취소");
			return; // void에서 return은 메서드 종료
		}
		else if(choiceHot == 1) {
			IoH = true;
		} else if(choiceHot == 2) {
			IoH = false;
		} else System.out.println("잘못 입력하셨습니다.");
		System.out.println("샷 추가? 기본 2샷");
		System.out.println("추가할 샷 수 입력, 0. 기본");
		int choiceShot = scan.nextInt();// 샷 추가할 횟수 입력받음
		Americano a1 = new Americano(); // 아메리카노 객체생성
		a1.setHot(IoH);					// ice or hot 변경
		if(choiceShot>=1) {				// 샷추가가 있으면
			a1.addShot(choiceShot);		// 입력받은 숫자만큼 샷추가하는 메서드
		}
		list.add(a1);					// 리스트에 아메리카노 객체 추가
		System.out.println("주문완료");
	} // orderAme
	
	static void orderLatte(List<Cafe> list) {
		boolean IoH = false;
		System.out.println("카페라떼 선택");
		System.out.println("1. 핫, 2. 아이스, 0. 주문취소");
		int choiceHot = scan.nextInt();
		if(choiceHot == 0) {
			System.out.println("주문취소");
			return;
		}
		else if(choiceHot == 1) {
			IoH = true;
		} else if(choiceHot == 2) {
			IoH = false;
		} else System.out.println("잘못 입력하셨습니다.");
		System.out.println("우유 변경? 기본 우유");
		System.out.println("변경할 우유 종류 입력 0. 기본");
		String choiceMilk = scan.next();
		
		Latte l1 = new Latte();
		l1.setHot(IoH);
		if(!choiceMilk.equals("0")) {
			l1.changeMilk(choiceMilk);
		}
		list.add(l1);
		System.out.println("주문완료");
	} // orderLatte
	
	static void printOrderList(List<Cafe> list) {
		System.out.println("주문목록");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	} // printOrderList
	
	static int CalPrice(List<Cafe> list) {
		int total = 0;
		for(Cafe c : list) {
			total += c.getPrice(); 
		}
		return total;
	} // CalPrice
	
}// class

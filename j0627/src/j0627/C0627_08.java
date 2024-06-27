package j0627;
import java.util.*;
public class C0627_08 {
	// cv
	static Scanner scan = new Scanner(System.in);
	// 메서드 - main
	public static void main(String[] args) {
		Map<String, List<Food>> map = new HashMap<String, List<Food>>();
		
		loop : while(true) {
			System.out.println("이름을 알려주세요 : ");
			String name = scan.next();
			if( !map.containsKey(name) ) {
				System.out.println("신규손님이시군여 가입할래여? (y/n)");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("y")) {
					List<Food> list = new ArrayList<Food>();
					map.put(name, list);
				}else {
					System.out.println("방문 감사");
					break loop;
				}
			}// if !map.containsKey(name)
			loop2 : while(true) {
				System.out.println(" 1. 구매 ");
				System.out.println(" 2. 카트보기 ");
				System.out.println(" 3. 총액 계산하기 ");
				System.out.println(" 0. 종료");
				int choice = scan.nextInt();
				switch(choice) {
				case 0 :
					System.out.println("이용 감사합니다");
					break loop2;
				case 1 :	buyFood(map, name);		break;
				case 2 :	printCart(map, name);	break;
				case 3 : 	
					int sum = calPrice(map, name);
					System.out.println("총 금액은 : "+sum);
					break;
				}
			}
			
		}// while
	} // main
	static void buyFood(Map<String, List<Food>> map, String name) {
		loop : while(true) {
			System.out.println("1. 과자 구매");
			System.out.println("2. 음료 구매");
			System.out.println("0. 종료");
			int choice = scan.nextInt();
			boolean isSweet = true;
			boolean isachole = false;
			switch(choice) {
			case 0: break loop;
			case 1 : 
				System.out.println("과자 이름이?");
				String sName = scan.next();
				System.out.println("이 과자 가격은?");
				int sPrice = scan.nextInt();
				System.out.println("이거 단건가? (y/n)");
				String sweet = scan.next();
				if(sweet.equalsIgnoreCase("y")) {
					 isSweet = true;
				}else if(sweet.equalsIgnoreCase("n")) {
					 isSweet = false;
				}else {
					System.out.println("잘못입력함");
					break;
				}
				
				map.get(name).add(new Snack(sName,sPrice,isSweet));
				break;
			case 2 :
				System.out.println("음료 이름이?");
				String dName = scan.next();
				System.out.println("이 음료 가격은?");
				int dPrice = scan.nextInt();
				System.out.println("이거 술이야? (y/n)");
				String achole = scan.next();
				if(achole.equalsIgnoreCase("y")) {
					isachole = true;
				}else if(achole.equalsIgnoreCase("n")) {
					isachole = false;
				}else {
					System.out.println("잘못입력함");
					break;
				}
				map.get(name).add(new Drink(dName,dPrice,isachole));
				break;
			}
		}
	} // buyFood
	
	static void printCart(Map<String, List<Food>> map, String name) {
		System.out.print(name+"님의 장바구니 : ");
		for(int i = 0; i < map.get(name).size(); i++) {
			System.out.print(map.get(name).get(i).getName()+" "); 
		}	
		System.out.println();
	} // printCart
	
	static int calPrice(Map<String, List<Food>> map, String name) {
		int sum = 0;
		for(int i = 0; i < map.get(name).size(); i++) {
			sum += map.get(name).get(i).getPirce();
		}	
		return sum;
	}
	
} // class

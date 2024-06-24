package j0624;
import java.util.*;
public class Buyer {
	// 필드 : iv, cv
	String id;
	String name;
	int money = 10000000;
	int point = 0;
	// 객체배열 Product, Product를 상속받은 객체를 담을 수 있는 배열
	// 총 10칸
//	int count;
	List<Product> cart = new ArrayList<Product>();
	//Product[] cart = new Product[10];
	// 생성자
	Buyer () {}
	Buyer (String id, String name){
		this.id = id; this.name = name;
	}
	// 메서드 : 리턴타입 메서드명(매개변수들..){}
	// 모든 메서드들은 return을 만나면 메서드 종료
	int buy(Product p) {
		// 상품의 금액이 현재 잔액보다 큰 경우
		if(money < p.getPrice()) {
			System.out.println("[알림]잔액이 부족합니다.");
			return 0; // 구매실패
		}
		money -= p.getPrice();
		point += p.getPoint();
		cart.add(p); // 구매한 물건을 cart에 담는다
//		count++; // 배열을 사용하기때문에 count변수를 사용해서 배열위치조정
		return 1; // 구매성공
	}
	
	
	
}

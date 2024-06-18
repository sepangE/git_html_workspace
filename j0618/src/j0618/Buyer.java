package j0618;

public class Buyer {
	//멤버변수, 객체변수 - iv
	String name; 	// 구매자이름
	int money;		// 보유금액(만원단위)
	int bonusPoint; // 보너스포인트
	Product[] cart = new Product[10];
	// Product를 담을 수 있는 객체배열
	int count; // 구매한 물건의 개수
	//생성자
	Buyer(){} // 기본생성자
	Buyer(String name, int money, int bonus){
		this.name = name;
		this.money = money;
		bonusPoint = bonus;
	}
	
	public void buy(Product p) {
		this.money -= p.pirce;
		this.bonusPoint  += p.bonuspoint;
		cart[count] = p;
		count++;
		
	}
	public void checkCart() {
		System.out.println("==============================");
		for(int i = 0; i < count; i++) {
			System.out.println(cart[i].productName);
		}
		System.out.println("==============================");
	}
	
	
	
	
	
	
	
	
}

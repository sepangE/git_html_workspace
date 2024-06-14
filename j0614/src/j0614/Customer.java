package j0614;

public class Customer {
	
	int money = 50000;
	
	void buyCoffee(Coffee c) {
		if(money < c.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= c.price;
		System.out.println(c+"를 구매하셨습니다.");
	}
	
	/*
	// 메서드 오버로딩 - 같은이름의 메서드 : 매개변수가 다름
	void buyCoffee(Americano a) {
		money -= a.price;
	}
	// 메서드 오버로딩
	void buyCoffee(CaffeLatte c) {
		money -= c.price;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

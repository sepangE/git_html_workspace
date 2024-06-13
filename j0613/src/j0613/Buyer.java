package j0613;

import java.util.Scanner;

public class Buyer {
	Scanner scan = new Scanner(System.in);
	Product[] cart = new Product[10];
	int myMoney;
	int myBonusPoint;
	int cnt;
	
	Buyer(){}
	Buyer(int myMoney, int myBonusPoint){
		this.myMoney = myMoney;
		this.myBonusPoint = myBonusPoint;
	}
	void buy(Product p) {
		System.out.println(p.productName+" 구매");
		this.myMoney -= p.price;
		this.myBonusPoint += p.bonusPoint;
		cart[cnt] = p;
		cnt++;
		
	}
	void printInfo() {
		System.out.println("현재 잔액 : "+this.myMoney);
		System.out.println("현재 포인트 : "+this.myBonusPoint);
	}
	int addMoney() {
		int money = scan.nextInt();
		return myMoney = myMoney+money;
	}
	void checkCart() {
		System.out.println("구매한 내역");
		for(int i = 0; i<cnt; i++) {
			System.out.println(cart[i].productName);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	void buyTv(Tv tv) {
		this.myMoney -= tv.price;
		this.myBonusPoint += tv.bonusPoint;
	}
	void buyTablet(Tablet tb) {
		this.myMoney -= tb.price;
		this.myBonusPoint += tb.bonusPoint;
	}
	void buyPc(Pc pc) {
		this.myMoney -= pc.price;
		this.myBonusPoint += pc.bonusPoint;
	}
*/
}

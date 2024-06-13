package j0613;

public class Shop {

	public static void main(String[] args) {
		// 구매자는 1000만원에 포인트 0
		Buyer b1 = new Buyer(1000,0);
		
		
		
		Tv tv = new Tv(); // 기본생성자로 만들어진 객체
		Tablet tb = new Tablet();
		Pc pc = new Pc();
		
		Product p1= new Tv();
		Product p2= new Tablet();
		Product p3= new Pc();
		
		b1.buy(tv);
		b1.printInfo();
		
		b1.buy(tb);
		b1.printInfo();
		
		b1.buy(pc);
		b1.printInfo();
		
		
	/*	// 테레비를 구매하는 메서드를 만들어보기
		// void buyTv
		b1.buyTv(tv);
		b1.printInfo(); //현재 잔액 : 800 현재 포인트 : 20
		// 태블릿을 구매하는 메서드
		b1.buyTablet(tb);
		b1.printInfo();
		//현재 잔액 : 700 현재 포인트 : 30
		// Pc 구매
		b1.buyPc(pc);
		b1.printInfo();
		//현재 잔액 : 550 현재 포인트 : 45
	*/	
		
		
		
		
		
		
	} // main

} // class

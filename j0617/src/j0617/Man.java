package j0617;

public class Man {
	
//	 버스요금 1000원 ㅈㅣ하철요금 1500원* Man - iv:  name, money
//    - method: takeBus, takeSubway
//                  showInfo
//                    :00님 잔액 00원입니다
	final int bpay = 1000;
	static final int spay = 1500;
	String name;
	int money;
	
	
	Man(){}
	Man(String name, int money){
		this.name = name;
		this.money = money;
	}
	void takeTrans(Trans t) {
		// 다형성으로 인해 t는 버스, 서브웨이도 될 수 있음
		int m = 0;
		if(t instanceof Bus) m = 1000;
		else if(t instanceof Subway) m = 1000;
		
		t.take(m);
		money -= m;
	}
	void showInfo() {
		System.out.println(this.name+"님 잔액 "+this.money+"원 입니다");
	}
	/*
	void takeBus(Bus bus) {
		// 버스에 대한 정보를 매개변수로 받아온다 bus는 객체
		// 버스라는 클래스에 1000 지불할거임
		bus.take();
		money -= 1000;
	}
	void takeSubway(Subway subway) {
		subway.take();
		money -= 1500;
	}
	void showInfo() {
		System.out.println(this.name+"님 잔액 "+this.money+"원 입니다");
	}
	
	*/
	
	
	
	
	
	
	
	
	
}

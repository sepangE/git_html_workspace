package j0617;

public class C0617_02 {
	public static void main(String[] args) {
		Man hong = new Man("홍길동", 10000);
		Man kang = new Man("강백호", 5000);
		Bus bus101 = new Bus(101); // 101번 버스
		Subway line2 = new Subway(2); // 2호선
		
		// take Trans는 매개변수가 Trans 클래스
		// 다형성때문에 자손의 객체 사용가능
		hong.takeTrans(line2);
		hong.takeTrans(bus101);
		hong.takeTrans(line2);
		hong.showInfo();
		
		kang.takeTrans(bus101);
		kang.takeTrans(line2);
		kang.takeTrans(bus101);
		kang.showInfo();
		
		bus101.showInfo();
		line2.showInfo();
		
		/*
		hong.(bus101); // 101버스를 타는 홍길동
		kang.takeSubway(line2);
		hong.showInfo();
		kang.showInfo();
		bus101.showInfo();
		line2.showInfo();
		*/
	}
}

package j0607;

public class C0607_03 {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.id = "사장";
		m1.name = "홍길동";
		m1.age = 40;
		
		m1.printAtt();
		Member m2 = new Member("부장","강백호",35, m1);
		
		m2.printAtt();
		
		m2.changeName("서태웅");
		m2.printAtt();
		
		Member m3 = new Member("과장","채수연",32,m2);
		// m3의 매니저를 m1으로 바꾸는 메서드
		System.out.println(m3.manager.name);
		m3.changeManager(m1);
		System.out.println(m3.manager.name);
		
		// m3의 정보를 복사하는 생성자를 만들어보세요
		Member m4 = new Member(m3);
		m4.printAtt();
		
		///////////////////////////////////////////////////////
		
		
	//	Circle이라는 클래스 만들기
		// 메서드 :
		//1. area : 넓이를 구함 3.14*반지름*반지름
		//2. size : 둘레의 길이를 구함 2*3.14*반지름
		//3. 반지름을 1 증가하는 메서드
		double result = 0;
		Circle c = new Circle();
		c.r = 10;
		result = c.area();
		System.out.println(result);
		result = c.area(3);
		System.out.println(result);
		result = c.area(5.5);
		System.out.println(result);
		result = c.size();
		System.out.println(result);
		result = c.size(4);
		System.out.println(result);
		result = c.size(9.1);
		System.out.println(result);
		Circle c1 = new Circle(3); // 3의 반지름을 가지는 원
		
		c1.plusr();
		
		
		
		
		
		
		
	}
}

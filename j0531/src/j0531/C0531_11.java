package j0531;

public class C0531_11 {

	public static void main(String[] args) {
		// 객체 선언
		Tv tv1 = new Tv(); // new를 사용하면 그때 객체 생성됨
		System.out.println(tv1); // 주소 j0531.Tv@75a1cd57
		tv1.color = "black";
		// String tv[] = [black];
		System.out.println(tv1.color); // 검은 티비
		
		Tv tv2 = new Tv();
		tv2.color = "red";
		System.out.println(tv2); // 주소가 다름을 확인 가능 j0531.Tv@515f550a
		System.out.println(tv2.color); // 빨간 티비
		
		// 자동차 객체
		// 객체 생성학ㅣ 객체는 키워드로 생성
		// 클래스명 참조변수명  new 생성자()
		// 생성자()로 만든 객체를 메모리에 넣고 위치값을 참조변수명에 저장

		Car c1 = new Car();
		// Car()로 만든 객체를 메모리에 넣고 그 위치값을 c1에 저장해라
		c1.color="red";
		c1.speed= 100;
		c1.print();
		
		Car c2 = new Car();
		c2.setColor("blue");
		c2.speed = 90;
		int c2speed = c2.getSpeed();
		System.out.println(c2speed);
		c2.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

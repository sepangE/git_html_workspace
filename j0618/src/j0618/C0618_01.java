package j0618;

public class C0618_01 {
	public static void main(String[] args) {
		// FireEngine은 자손클래스 - Car로부터상속받음
		FireEngine f1 = new FireEngine();
		f1.go();
		f1.stop();
		f1.water();
		Ambulance a1 = new Ambulance();
		a1.go();		//Car
		a1.stop();		//Car
		a1.siren();		//Ambulance
		// 다형성
		Car c1 = new FireEngine();
		c1.go();
		c1.stop();
		// c1.water() 은 사용불가 기능내포 하지만 리모컨이 없음
		Car c2 = new Ambulance();
		c2.go();
		c2.stop();
		// c2.siren() 은 사용불가 조상의 참조변수로는 사용 불가능
		Car c3;	// 자동차 객체 선언
		c3 = c1; // 조상의 참조변수 = 자손의 참조변수(Car c1 = new FireEngine)
		// c3.water() 사용불가
		FireEngine f2; // 소방차 객체 선언
		f2 = (FireEngine)c3; // 자손타입으로 형변환
		System.out.println("f2 : ");
		f2.water();	// 자손의 기능 사용가능
		((FireEngine)c3).water(); // 형변환을 통해 리모컨 교체
		
		Ambulance a2;
		FireEngine f3;	// Car c3 = new FireEngine();
		if(c3 instanceof FireEngine) {
			System.out.println("c3은 FireEngine으로 형변환 가능합니다");
			f3 = (FireEngine)c3;
			f3.water();
		}
		if(c3 instanceof Ambulance) {
			System.out.println("c3은 Ambulance로 형변환 가능합니다");
			a2 = (Ambulance)c3;
			a2.siren();
		}
		// 모든 객체의 조상 Object
		Object o1;
		o1 = f1;
		o1 = a1;
		
		// j0618.Ambulance@626b2d4a 객체의 주소
		System.out.println(o1.toString());	// toString()은 객체의 주소
		System.out.println(o1);			  	// 생략해도 같은값 출력
		
		// toString 메서드 오버라이딩 해서 수정하면
		// 변수명 출력시 주소값이 아닌 의미있는 값들을 출력할 수 있다
		System.out.println(a1);	//구급차 색 : null, 문 : 0
		System.out.println(f1); //구급차 색 : null, 문 : 0
		
		
		
	}
}

package j0605;

public class C0605_02 {
	public static void main(String[] args) {
		// 1. 객체를 선언 및 생성
		Person hong = new Person();
		// 클래스명 참조변수명 = new 생성자();
		// 객체값 초기화
		hong.name = "홍길동";
		hong.age = 22;
		hong.height = 179;
		hong.weight = 70;
		// 인스턴스 메서드 호출
		hong.printAtt(); 	// 객체의 정보를 출력해주는 메서드
		hong.gainWeight(); 	// 1키로 증가 메서드 호출
		hong.printAtt();	// 1키로 증가했음을 확인할 수 있음
		
		// 매개변수로 숫자를 전달받아 그 숫자만큼 키가 커지는 메서드를 만들어보세요
		
		hong.printAtt();
		hong.gainHeight(4.3);
		hong.printAtt();
		
		// 리턴타입 int로 매개변수로 1을 전달받아 내년의 나이를 출력해보세요(객체나이 변하지 않음)
		
		hong.printAtt();
		int ny = hong.nextYear(1);
		System.out.println(hong.name+"의 현재 나이 : "+hong.age);
		System.out.println(hong.name+"의 1년 후 나이 : "+ny);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

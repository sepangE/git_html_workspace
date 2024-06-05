package j0605;

public class C0605_10 {
	public static void main(String[] args) {
		int n=1;
		String str = new String("문자열");
		Person1 p = new Person1("홍길동",22);
		// 연산자 new에 의해서 Person클래스의 인스턴스(객체)가 생성됨
		// Person() 이 호출되어서 수행되는것
		// 연산자 new의 결과로 생성된 Person인스턴스의 주소가 반환되어
		// 참조변수 p에 저장됨
		p.printAtt();
		
		Person1 p1 = new Person1();
		p1.name = "유관순";
		p1.age = 20;
		p1.printAtt();
		
		Person1 p2 = new Person1("짱구");
		p2.printAtt();
		
		Person1 p3 = new Person1("철수",5,120,40);
		p3.printAtt();
		
		// Member 클래스 만들기
		
		Member m1 = new Member(); // 객체 선언하고 생성
		// 객체를 초기화
		m1.id = "ccc";
		m1.name = "강백호";
		m1.pwd ="3333";
		m1.email = "kang@aa.com";
		m1.printAtt();
		// 객체를 선언하고 생성함과 동시에 초기화
		Member m2 = new Member("aaa","1111");
		Member m3 = new Member("bbb","홍길동","1234","hong@aa.com");
		// + 출력하는 메서드 한개 만들기
		//[야이디 : bbb 이름 : 홍길동 비밀번호 : 1234 이메일 : hong@aa.com]
		m2.printAtt();
		m3.printAtt();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

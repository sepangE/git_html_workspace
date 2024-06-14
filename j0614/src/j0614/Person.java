package j0614;
// 기본패키지 부모클래스 Person
public class Person {
// 얘는 다른 패키지라 Person 클래스의 public이나 protected만 접근가능
/*
 public - 접근제한 없음. 어느클래스나 접근가능
 protected - 같은패키지내 + 
  			다른 패키지라도 상속관계에 있으면 접근가능
 (default) - 같은 패키지내에서만 접근가능
 private - 같은 클래스 내에서만 접근가능

 정보은닉(data hiding) - 굳이 알 필요 없는 정보는 숨겨야한다
 접근제어자를 사용하면 직접적접근을 허용하지 않아 정보은닉을 구체화 할 수 있음
 */
	// 멤버변수 (iv,cv)
	public String name;			//어디서나 접근
	protected double height; 	// 같은패키지+상속 접근
	double weight;				// 같은패키지만 접근
	private int age;			// 같은 클래스(Person)만 접근
	// 2. 생성자
	public Person() {} // 기본생성자
	// default type의 생성자로 매개변수가 3개 존재함
	Person(String name, int age, double height){
		this(name,age,height,0); // this()는 생성자 호출
		// 매개변수가 4개인 생성자 호출
	}
	// protected 생성자로 매개변수 4개 존재함
	protected Person(String name, int age, double height,double weight) {
		this.name = name; this.age = age; this.height = height; this.weight = weight;
		// this는 객체멤버변수를 가리킬때 사용함
		// name은 매개변수이자 지역변수
		// this.name 은 객체멤버 iv 가리킴
	}
	// 3. 메서드
	public void printName() { // 제한없음 그냥 호출가능
		System.out.println("public method"+name);
	}
	protected void printHeight() { // 같은패키지+상속관계에 있는 클래스만 호출가능
		System.out.println("protected method"+height);
	}
	 void printweight() { // 같은패키지내에서만 호출 가능한 메서드
		System.out.println("protected method"+weight);
	}
	private void printAge() { // 같은 클래스 내에서만 호출이 가능한 메서드
		System.out.println("private method"+age);
	}
	public void printAll() { // 전체출력 : 메서드 전부 호출하기
		// 같은 클래스 내 클래스명.메서드명에서 클래스명 생략가능
		printName(); printHeight(); printweight(); printAge();
		// 같은 클래스에 존재하는 메서드이기때문에 private메서드 printAge() 호출가능
	}
	
	
	
	
	
}

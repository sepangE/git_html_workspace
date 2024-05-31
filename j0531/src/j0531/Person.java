package j0531;

public class Person {
	// 이름, 나이, 키, 몸무게 속성을 가진 클래스를 만들어보세요
	String name ;
	int age;
	double heigth;
	double weight;
	// print()라는 메서드는 이름, 나이, 키, 몸무게를 출력해줍니다.
	void print() {
		System.out.printf("이름: %s 나이 : %d 키 : %.2f 몸무게 : %.2f \n",
						this.name,this.age,this.heigth,this.weight);
	}
	// newYear()라는 메서드는 내년의 나이를 반환해 줍니다.
	int newYear() {
		int oneyear=1; // 지역변수. 초기화를 해줘야 사용할 수 있음
		return this.age+oneyear;
	}
	// 가능하다면 메서드도 만들어보세요
	
}

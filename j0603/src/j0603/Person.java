package j0603;

public class Person {
	//		1. generation()어린이(10살미만), 청소년(20살미만), 성인 을 리턴해주는 함수
	//		2. nextAge() 내년에 몇살인지 리턴해주는 함수
	//		3. print() "이름님 00살"이라고 출력해주는 함수
	//		4. 10yrAge(나이) 매개변수로 받아서 10년후 나이를 리턴
		
		
	String name;
	int age;
	String gen() {
		if (age<10) return "어린이";
		else if(age<20)return"청소년";
		else return "성인";
	}
	
	int nextAge() {
		return age+1;
	}
	
	void print() {
		System.out.printf("%s님은 %d살\n",name,age);
	}
	
	int ageNyr (int age) {
		return this.age+age;
	}
	
	
}

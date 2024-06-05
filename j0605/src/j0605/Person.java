package j0605;

public class Person {
	// 인스턴스 변수
	String name;
	int age;
	double height;
	double weight;
	
	// 인스턴스 메서드
	void printAtt() {
		System.out.printf("이름 %s 나이 : %d 키 :%.1f 몸무게 %2.0f\n",name,age,height,weight);
	}
	void gainWeight() {
		weight = weight+1;
		// weight++;
	}
	
	void gainHeight(double h) {
		height = height+h;
	}
	
	int nextYear(int a) {
		return age+a;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

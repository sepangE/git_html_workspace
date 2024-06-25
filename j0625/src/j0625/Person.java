package j0625;

public class Person implements Comparable<Person> {
	//필드
	private String name;
	private int age;
	// 생성자
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	// 메서드
	@Override
	public int compareTo(Person o) {
		if(age == o.age) return 0;
		else if(age > o.age) return 1;
		else return -1;
	}

	public String toString() {
		return "이름 : "+name+", 나이 : "+age+"세";
	}
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

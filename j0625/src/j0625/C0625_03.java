package j0625;
import java.util.*;
public class C0625_03 {
	public static void main(String[] args) {
		
		// people 리스트를 만들어서
		// 짱구 5세, 봉미선 29세, 강백호 18세 북산고
		// 채치수 19세 북산고, 신형만 35세 떡잎상사
		// 채성아 22세 떡잎유치원 을 리스트에 넣어주세요

		
		/*List<Person> people = new ArrayList<Person>();
		people.add(new Person("짱구",5));
		people.add(new Person("봉미선",29));
		people.add(new Student("강백호",18,"북산고"));
		people.add(new Student("채치수",19,"북산고"));
		people.add(new Worker("신형만",35,"떡잎상사"));
		people.add(new Worker("채성아",22,"떡잎유치원"));
		// for문 써서 전체 출력하기
		for(Person p : people) {
			System.out.println(p);
		}*/
		
	/*	List<Person> people = new ArrayList<Person>();
		addP(people);
		printP(people);*/
		
		List<Person> people;
		people = addP();
		printP(people);
		
	}// main
	
	static void addP(List<Person> p) {
		p.add(new Person("짱구",5));
		p.add(new Person("봉미선",29));
		p.add(new Student("강백호",18,"북산고"));
		p.add(new Student("채치수",19,"북산고"));
		p.add(new Worker("신형만",35,"떡잎상사"));
		p.add(new Worker("채성아",22,"떡잎유치원"));
	}
	
	static List<Person> addP() {
		List<Person> p = new ArrayList<Person>();
		p.add(new Person("짱구",5));
		p.add(new Person("봉미선",29));
		p.add(new Student("강백호",18,"북산고"));
		p.add(new Student("채치수",19,"북산고"));
		p.add(new Worker("신형만",35,"떡잎상사"));
		p.add(new Worker("채성아",22,"떡잎유치원"));
		return p;
	}
	
	static void printP(List<Person> p) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	
	
	
}// class

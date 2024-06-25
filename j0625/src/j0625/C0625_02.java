package j0625;
import java.util.*;
public class C0625_02 {
	public static void main(String[] args) {
		// integer 객체만 담을 수 있는 리스트
		List<Integer> n = new ArrayList<Integer>();
		// list n 에 숫자 추가
		n.add(1);		n.add(2);		n.add(3);
		System.out.println(n); // [1, 2, 3]
		// 리스트의 모든 요소를 삭제
		n.clear(); System.out.println(n); // []
		
		//1-45 사이의 랜덤한 숫자 10개 를 리스트에 채워보기
		
		for(int i = 0; i < 10; i++) {
			int rNum = (int)(Math.random()*45)+1;
			n.add(rNum);
		}
		System.out.println(n);
		
		// 25 이상의 숫자만 출력
		for(int i = 0; i < n.size(); i++) {
			if(n.get(i)>25) {
				System.out.print(n.get(i)+" ");
			}
		}
		System.out.println();
		
		System.out.println("정렬 전 : "+n);
		Collections.sort(n);
		System.out.println("정렬 후 : "+n);
		
		List<String> ns = new ArrayList<String>();
		ns.add("강백호"); ns.add("홍길동");
		ns.add("서태웅"); ns.add("유관순");
		System.out.println("정렬 전 : "+ns); // [강백호, 홍길동, 서태웅, 유관순]
		// 문자열은 사전순으로 정렬해줌
		Collections.sort(ns);
		System.out.println("정렬 후 : "+ns); // [강백호, 서태웅, 유관순, 홍길동]
		
		
		// people 이라는 리스트를 만들어서
		// 강백호 20세, 홍길동 30세, 서태웅 24세, 유관순 17세 를 리스트에 넣어보기
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("강백호",20));
		people.add(new Person("홍길동",30));
		people.add(new Person("서태웅",24));
		people.add(new Person("유관순",17));
		
		for(int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
			// toString의 리턴 출력
		}
		
		System.out.println(people);
	//	[이름 : 강백호, 나이 : 20세, 이름 : 홍길동, 나이 : 30세, 이름 : 서태웅, 나이 : 24세, 이름 : 유관순, 나이 : 17세]	
		Collections.sort(people);
		System.out.println(people);
	//	[이름 : 유관순, 나이 : 17세, 이름 : 강백호, 나이 : 20세, 이름 : 서태웅, 나이 : 24세, 이름 : 홍길동, 나이 : 30세]

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

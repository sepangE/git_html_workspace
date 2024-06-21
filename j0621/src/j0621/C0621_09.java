package j0621;
import java.util.*;
public class C0621_09 {
	public static void main(String[] args) {
		List<Dog> dog = new ArrayList<Dog>();
		List<Cat> cat = new ArrayList<Cat>();
		
		
		dog.add (new Dog("뽀삐",10,"포메"));
		dog.add (new Dog("쿠키",3,"장모치와와"));
		for(Dog d : dog) {
			System.out.println(d);
		}
		
		cat.add(new Cat("춘식이",2,"삼색"));
		cat.add(new Cat("순덕이",1,"갈색"));
		cat.add(new Cat("춘삼",5,"검은색"));
		
		for(Cat c : cat) {
			System.out.println(c);
		}
		// Animal을 상속받는 객체라면 다 담을 수 있음
		List<Animal> ani = new ArrayList<Animal>();
		ani.addAll(dog);
		ani.addAll(cat);
		for(Animal an : ani) {
			System.out.println(an);
		}
		// 동물들의 이름만 줄바꿈 없이 출력
		for(Animal an : ani) {
			System.out.print(an.getName()+" ");
		}
		System.out.println();
		for(int i = 0; i < ani.size(); i++) {
			System.out.print(ani.get(i).getName()+" ");
		}
		System.out.println();
		
		// 4살 이하의 동물의 정보만 출력
		System.out.println("4살 이하");
		for(Animal an : ani) {
			if(an.getAge()<4) {
				System.out.println(an);
			}
		}
		
		// 이름이 3글자 이상인 동물의 정보만 출력
		System.out.println("이름 3글자 이상");
		for(Animal an : ani) {
			if(an.getName().length()>=3) {
				System.out.println(an);
			}
		}
		
		List<Number> num = new ArrayList<Number>();
		
		//1~100 사이의 짝수만 num 리스트에 넣기
		
		for(int i = 1; i <= 100; i++) {
			if(i%2==0) {
				num.add(i);
			}
		}
		// 출력은 5의 배수만
		for(Number n : num) {
			if((Integer)n%5==0) {
				System.out.println(n);
			}
		}
		
		
		
		
		
		
		
		
		
	}// main
}// class

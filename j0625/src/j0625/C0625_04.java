package j0625;
import java.util.*;
public class C0625_04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		List<Animal> ani = new ArrayList<Animal>();
		ani.add(new Dog("초코",3,"포메라니안"));
		ani.add(new Dog("만두",2,"말티즈"));
		ani.add(new Cat("삼식",1,"러시안블루"));
		ani.add(new Cat("춘식이",5,"갈색"));
		ani.add(new Cat("나비",3,"삼색"));
		for(Animal a : ani) {
			System.out.println(a);
		}*/
		List<Animal> ani = addAnimal();
		printAnimal(ani);
	}// main
	static List<Animal> addAnimal(){
		List<Animal> a = new ArrayList<Animal>();
		/*a.add(new Dog("초코",3,"포메라니안"));
		a.add(new Dog("만두",2,"말티즈"));
		a.add(new Cat("삼식",1,"러시안블루"));
		a.add(new Cat("춘식이",5,"갈색"));
		a.add(new Cat("나비",3,"삼색"));*/
		// 아래와 같이 무한히 입력을 받아 입력한 글자가 0일때 무한루프 멈춤
		// d 뿌꾸 5 말티즈
		// d 순심이 10 리트리버
		// c 초코 2 검정
		while(true) {
			System.out.println("강아지면 d 고양이면 c (종료 : 0)");
			System.out.println("이름 : 나이 : 견종or색 : ");
			System.out.println("띄어쓰기로 구분 ");
			String an = scan.nextLine();
			String[] anim = an.split(" ");
			if(anim[0].equals("d")) {
				a.add(new Dog(anim[1],(Integer.parseInt(anim[2])),anim[3]));
			}
			else if(anim[0].equals("c")) {
				a.add(new Cat(anim[1],(Integer.parseInt(anim[2])),anim[3]));
			}
			else if(anim[0].equals("0")) {
				break;
			}
			else { 
				System.out.println("잘못입력함");
			}
		}// while
		return a;
		
	}
	static void printAnimal(List<Animal> a) {
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
	
}// class

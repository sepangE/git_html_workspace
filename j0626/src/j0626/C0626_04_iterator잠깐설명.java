package j0626;
import java.util.*;
public class C0626_04_iterator잠깐설명 {
	public static void main(String[] args) {
		/* iterator : ArrayList, Hashset등의 컬렉션을 반복할때
		 			  사용할 수 있는 객체.
		 			  반복의 기술용어이기 때문에 반복자 라고 한다
		   컬렉션 : list, set, map
		   1. 컬렉션에서 요소를 제어하는 기능
		   2. next(), previous() 를 사용해서 앞뒤로 이동함
		   3. hasNext() 를 사용해 뒤에 요소가 있는지를 확인
		   4. remove() 마지막 요소를 현재 컬렉션에서 제거하는 기능
		*/
		
		List list = new ArrayList();
		list.add("111");
	//	list.add(222);
		list.add("333");
	//	list.add(444);
		list.add("555");
		list.add("111");
		
		System.out.println("----------------------------------");
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------------");
		for(Object o : list) { // 간단for문은 저장된 요소가 섞여있을경우 Object로만 가져올 수 있다
			System.out.println(o);
		}
		System.out.println("----------------------------------");
		//String str = "helloworld";	str.subSequence(0, 5);
		List<String> list1 = new ArrayList<String>();
		list1.add("111"); list1.add("333"); list1.add("555"); list1.add("111");
		for(String i : list1) {
			System.out.println(i.substring(0,2));
		}
		System.out.println("----------------------------------");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			// while 은 it.hasNext() 결과가 참일 동안만 동작
			System.out.println(it.next());
		}
		System.out.println("----------------------------------");
		// 위의 while문에서 이미 hasnext()로 끝까지 가버렸기 때문에 
		// 다시 it.hasNext()로 while문 쓰려면 
		// it = list.iterator() 로 새로 만들어서 다시 while 돌려줘야함
		it = list.iterator();
		while(it.hasNext()) {
			// while 은 it.hasNext() 결과가 참일 동안만 동작
			System.out.println(it.next());
		}
		System.out.println("----------------------------------");
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("벤츠"); cars.add("페라리");
		cars.add("람보르기니"); cars.add("롤스로이스");
		// 정규 for문으로 출력
		for(int i = 0; i < cars.size(); i ++) {
			System.out.print(cars.get(i)+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		// 간단for문으로 출력
		for(String s : cars) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		// iterator를 사용해서 출력
		Iterator ca = cars.iterator();
		while(ca.hasNext()) {
			System.out.print(ca.next()+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		
		
	}
}

package j0626;
import java.util.*;
public class C0626_02 {
	public static void main(String[] args) {
		
		List<Cafe> list = new ArrayList<Cafe>();
		Americano a1 = new Americano();
		Latte l1 = new Latte();
		list.add(a1);
		list.add(l1);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===================================");
		a1.addShot(3);
		l1.changeMilk("두유");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===================================");
		list.add(new Americano());
		list.add(new Latte());
		list.add(new Cafe());
		for(Cafe c : list) {
			System.out.print(c.getName()+" ");
		}
		System.out.println();
		// 리스트에 담긴 커피의 가격의 총 합
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice();
		}
		System.out.println("커피 "+list.size()+"잔의 총 가격 : "+sum);
		
	} // main
}// class

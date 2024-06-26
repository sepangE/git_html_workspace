package j0626;
import java.util.*;
public class C0626_01 {
	public static void main(String[] args) {
		
		Book b1 = new Book("Java",10000);
		System.out.println(b1);
		Book n1 = new Novel("해리포터1",15000,"판타지");
		//Novel n1 = new Novel("해리포터1",15000,"판타지");
		System.out.println(n1);
		Book c1 = new Comics("슬램덩크",8000,1);
		//Comics c1 = new Comics("슬램덩크",8000,1);
		System.out.println(c1);
		System.out.println("===================================================");
		
		Book[] bs = new Book[3];
		bs[0] = b1;
		bs[1] = n1;
		bs[2] = c1;
		
		for(int i = 0 ; i < bs.length; i++) {
			System.out.println(bs[i]);
		}
		System.out.println("===================================================");
		
		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(n1);
		list.add(c1);
		list.add(new Book("CSS",20000));
		list.add(new Novel("해리포터 죽음의 성물",15000,"판타지"));
		list.add(new Comics("원피스",8000,20));
		for(Book b : list) {
			System.out.println(b);
		}
		System.out.println("===================================================");
		// 리스트에서 책의 제목들만 출력해보기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}
		System.out.println("===================================================");
		// 책의 가격 출력
		int sum  = 0;
		for(Book b : list) {
			sum+=b.getPrice();
		}
		System.out.println("총 가격 : "+sum+"원");
		
		
	}
}

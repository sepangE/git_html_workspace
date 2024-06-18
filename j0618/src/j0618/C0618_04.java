package j0618;
public class C0618_04 {
	public static void main(String[] args) {
		/*
		1. 페이지 인터페이스 생성
      		read()
		2. 페이지 인터페이스를 상속하여 책(Book) 클래스 생성
     	전체 페이지 번호, 현재 페이지 번호 속성을 정의
      	totalPageNum    ,  currentPageNum
     	page(), next(), prev() 메서드 정의
		 */
		/*
		Book b = new Book(300);
		b.read();
		
		for(int i = 0; i < 99; i++) {
			b.next();
		}
		for(int i = 0; i < 37; i++) {
			b.prev();
		}
		b.page();
		System.out.println(b);
		*/
		Novel n = new Novel("해리포터 불의 잔", "문학수첩", "판타지", "J.K 롤링", 268);
		n.read();
		for(int i = 0; i < 187; i++) {
			n.next();
		}
		n.searcth("불의 잔");
		System.out.println(n);
		
		Comics c = new Comics("슬램덩크 1", "대원", "이노우에타케히코", "이노우에타케히코", 12, 304); 
		c.read();
		for(int i = 0; i < 237; i++) {
			c.next();
		}
		System.out.println(c);
		
		Magazine m = new Magazine("좋은생각", "좋은생각", "좋은생각 편집부", "교양", 122);
		m.read();
		for(int i = 0; i < 76; i++) {
			m.next();
		}
		System.out.println(m);
		m.QRCapture();
		
		// 배열 선연			배열 생성
		Book[] books = new Book[5];
		// 다형성으로 만들어서
		books[0] = n; // 소설을 담을 수 있다
		books[1] = c; // 만화책을 담을 수 있다
		books[2] = m; // 잡지를 담을 수 있다
		books[3] = new Comics("슬램덩크 8", "대원", "이노우에타케히코", "이노우에타케히코", 12, 299); 
		books[4] = new Novel("해리포터 마법사의 돌", "문학수첩", "판타지", "J.K 롤링", 268);
		
		
		
		
		
		
		
	}
	
}

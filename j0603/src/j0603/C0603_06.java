package j0603;

public class C0603_06 {

	public static void main(String[] args) {
		// 객체 선언 및 생성
		Card c1 = new Card();
		c1.kind = "heart"; // 인스턴스변수iv의 경우 객체명 인스턴스변수명
		c1.number = 3;
		// Diamond3 의 객체생성
		Card c2 = new Card();
		c2.kind =  "Diamond";
		c1.number = 5;
		// Clover5 객체생성
		Card c3 = new Card();
		c3.kind = "Clover";
		c1.number = 5;
		
		// Spade10 객체생성
		System.out.println("Card의 길이 : "+Card.height);
		System.out.println("Card의 너비 : "+Card.width);
		System.out.println("c1 카드 : "+c1.kind+c1+c1.number);
	
	
		// 카드는 총 52장. Spade 13, Clover 13, Heart 13, Diamond 13
		// 카드배열 52칸 을 반들어서 총 52장의 카드를 만들어보세요
		
		Card[] c52 = new Card[52];
		String[] k = {"Spade","Clover","Heart","Diamond"};
		for(int i =0; i < c52.length; i++) {
			c52[i] = new Card();	
			c52[i].number = (i%13)+1;
			c52[i].kind = k[i/13];
		}
		for(int i = 0; i< c52.length; i++) {
			System.out.println(c52[i].kind+c52[i].number);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

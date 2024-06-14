package j0614;

import java.util.Scanner;

public class C0614_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 20;
		Deck deck = new Deck();
		Card[] myCard = new Card[5];
		Card[] comCard = new Card[5];
		int choice = 0;
		loop : while(true) {
			System.out.println("===[포커게임]===");
			System.out.println("1.카드섞기");
			System.out.println("2.카드1장받기");
			System.out.println("3.카드5장받기");
			System.out.println("4.내카드보기");
			System.out.println("5.컴퓨터카드저장하기");
			System.out.println("6.카드교체하기");
			System.out.println("7.승부(컴퓨터카드와비교)");
			System.out.println("0.게임종료");
			System.out.println("=============================");
			System.out.println("번호를 선택하세요");
			choice = scan.nextInt();
			switch(choice) {
			case 1 : // 카드섞기
				deck.shuffle();
				break;
			case 2 : // 카드 1장뽑기
				Card c = deck.pick(0);
				System.out.println("뽑으신 카드는 : "+c.kind+c.number);
				break;
			case 3 : // 카드 5장뽑기 deck의 1번부터 5개
				for(int i = 0; i< myCard.length; i++) {
					myCard[i] = deck.pick(i+1);
				}
				System.out.println("카드 5장을 전달받음");
				break;
			case 4 : // 내 카드 보기 : myCard 출력
				for(int i = 0; i < myCard.length; i++) {
					System.out.print(myCard[i].kind+myCard[i].number+" ");
				}
				System.out.println();
				break;
			case 5 : // 컴퓨터카드 저장하기
				for(int i = 0; i < comCard.length; i++) {
					comCard[i] = deck.pick(i+7);
				}
				System.out.println("컴퓨터가 카드 5장 전달받음");
				break;
			case 6 : // 카드 교체하기
				for(int i = 0; i < myCard.length; i++) {
					System.out.print(i+"번 "+myCard[i].kind+myCard[i].number+", ");
				}
				System.out.println();
				System.out.println("교체할 카드 번호 입력 0~4");
				int n = scan.nextInt();
				if(n < 0 || n>4)System.out.println("잘못입력하셨습니다.");
				myCard[n] = deck.pick(cnt);
				cnt++;
				break;
			case 7 : // 상대카드 확인해서 승부하기
				System.out.println("내 카드");
				for(int i = 0; i < myCard.length; i++) {
					System.out.print(myCard[i].kind+myCard[i].number+" ");
				}
				System.out.println();
				System.out.println("상대 카드");
				for(int i = 0; i < comCard.length; i++) {
					System.out.print(comCard[i].kind+comCard[i].number+" ");
				}
				System.out.println();
				break;
			case 0 : // 게임종료
				break loop;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		// 카드객체
		Card c1 = new Card();
		System.out.println(c1.kind+c1.number);
		
		Deck deck = new Deck();
		// deck 객체 안에 c[n] 객체들이 존재함
		// c[n]의 객체는 card 객체로 kind,number의 객체멤버변수(iv)를 가지고 있음
		
		for(int i = 0; i< deck.c.length; i++) {
			System.out.println(deck.c[i].kind+deck.c[i].number);
		}
*/	
		
	}//main
}//class
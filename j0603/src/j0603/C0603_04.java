package j0603;

import java.util.Scanner;

public class C0603_04 {

	public static void main(String[] args) {
		// 책 3개정도 객체 생성
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.title = "궁금하면";
		b2.title = "1달라";
		b3.title = "2달라 두배입니다 이 이상은 안돼요";
		
		b1.price = 500;
		b2.price = 5504;
		b3.price = 5504;
		
		b1.showPrice();
		b2.showPrice();
		b3.showPrice();
		System.out.println("오케이 4딸라! 땡큐 4딸라!");
		
		/* book 객체 3개의 배열형태로 만들어 사용하기 위해서는
		   book[] bk = new book[3]; // 객체 배열선언 및 생성
		   
		   bk에는 객체 3개를 담을 배열의 주소가 할당
		   아직 객체는 만들어지지 않았기 때문에 객체를 생성해야함
		   bk[0] = new Book(); // 실제 객체 생성
		   bk[1] = new Book(); // 실제 객체 생성
		   bk[2] = new Book(); // 실제 객체 생성
		   
		   or
		   
		   Book[] b = {new Book(), new Book(), new Book()};
		*/
		
//		b1.title = "궁금하면";
//		b2.title = "1달라";
//		b3.title = "2달라 두배입니다 이 이상은 안돼요";
//		
//		b1.price = 500;
//		b2.price = 5504;
//		b3.price = 5504;
		System.out.println("객체배열 사용");
		// 객체배열 선언 및 생성
		Book[] bk = new Book[3];
		for(int i = 0; i< bk.length; i++) {
			bk[i] = new Book(); // 객체를 생성해줌
		}
		bk[0].title = "궁금하면"; bk[0].price = 500;
		bk[1].title = "1달라"; bk[1].price = 5504;
		bk[2].title = "2달라 두배입니다 이 이상은 안돼요"; bk[2].price = 5504;
		
		for(int i = 0 ; i < bk.length; i++) {
			bk[i].showPrice();
		}
		
		System.out.println("입력받아 객체값 넣기");
		Scanner scan = new Scanner(System.in);
		Book b4 = new Book();
		System.out.println("책의 제목을 입력해주세요");
		b4.title = scan.next();
		System.out.println("책의 가격을 입력해주세요");
		b4.price = scan.nextInt();
		b4.showPrice();
		
		// 5칸 객체배열을 생성해서 5개의 값을 입력받아 (총10개)
		// 5개의 책 정보를 출력해보세요
		
		// 객채베열 생성 및 선언
		Book[] b5 = new Book[5];
		
		// 객체 생성 및 값 넣기
		for(int i = 0; i< b5.length; i++) {
			b5[i] = new Book();
			System.out.println("책의 제목을 입력해주세요");
			b5[i].title = scan.next();
			System.out.println("책의 가격을 입력해주세요");
			b5[i].price = scan.nextInt();
		}
//		b5[0].title = "월요일이 오지 않게 하려면"; b5[0].price = 2100000000;
//		b5[1].title = "주말의 길이를 늘리는법"; b5[1].price = 30000000;
//		b5[2].title = "표지만 봐도 잠이 깨는 책"; b5[2].price = 123456789;
//		b5[3].title = "로또당첨 노하우"; b5[3].price = 777770;
//		b5[4].title = "효율적인 휴일 보내기"; b5[4].price = 904032;
		
		// 출력
		for(int i = 0; i < b5.length; i++) {
			b5[i].showPrice();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

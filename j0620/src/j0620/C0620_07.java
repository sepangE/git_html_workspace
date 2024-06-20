package j0620;

import java.util.Scanner;

public class C0620_07 {
	public static void main(String[] args) {
		
		//1-100사이의 랜덤숫자 발생시켜서
		// 숫자맞추기 프로그램 만들기
		// 입력값보다 랜덤숫자가 크면 크다고 힌트를 주고
		// 작으면 작다고 힌트를 주면서..
		// 만약 숫자가 아닌 다른 값이 입력되면 유효하지 않은값 이라고 출력
		// 정답을 맞출때까지 무한루프
		
		int r;
		r = (int)(Math.random()*100);
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 맞추기 프로그램");
		
		loop : while(true) {
			System.out.println("숫자를 입력해주세요");
			int in = 0;
			try {
				in = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값 입니다.");
				e.printStackTrace();
			}
			if(r == in) {
				System.out.println("정답입니다!");
				break loop;
			}
			else if(r > in) {
				System.out.println("입력한 숫자가 더 작습니다");
			}
			else if(r < in) {
				System.out.println("입력한 숫자가 더 큽니다");
			}
		}// while
		 
		
	} // main
} // class

package j0529;

import java.util.Scanner;

public class C0529_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10개중 2개의 보물찾기 프로그램 구성
		// 당첨 대신에 100억, 10억이라고 표현
		// 변수선언
		int[] box = {0,0,0,0,0,0,0,0,1,2};
		String[] ar = new String[10];
		int tmp = 0, rnum = 0, num = 0, count = 0;
		
		for(int i = 0 ; i<300; i++) {	// box 배열을 300번 섞어줌
			rnum = (int)(Math.random()*10); // 0~9 랜덤번호생성
			tmp = box[0];				// tmp에 box[0]값을 넣어줌
			box[0] = box[rnum];			// box[0]에 box[랜덤번호]값을 넣어줌 
			box[rnum] = tmp;			// box[랜덤번호]에 box[0]값 저장했던 tmp 값을 넣어줌
		}
		
		for(int i = 0; i<ar.length; i++) { // arr 배열에 값을 ?로 채워줌
			ar[i] = "?";
		}
		
		while(true) { // 무한반복문
			System.out.println("[보물찾기 프로그램]");
			for(int i = 0; i<ar.length; i++) { // 번호출력
				System.out.print(i+"\t");
			}
			System.out.println(); // 줄바꿈
			System.out.println("--------------------------------------------------------------------------------------");
			for(int i = 0; i<ar.length; i++) { // ?출력
				System.out.print(ar[i]+"\t");
			}
			System.out.println(); // 줄바꿈
			
			if(count == 2) break; // 다 찾으면 프로그램 종료
			System.out.println("숫자를 입력해주세요");
			num = scan.nextInt(); // 숫자 입력받음
			if(box[num] == 1) { // 배열의 num번째 방의 값이 1이라면
				ar[num] = "100억!"; // 입력받은 숫자의 arr배열의 자리에 들어있는 ?를 100억! 으로 바꿔줌
				count++;	// 보물 찾은 횟수 증가
			}else if(box[num]==2) { // 배열의 num번째 방의 값이 2라면
				ar[num] = "10억!"; // 입력받은 숫자의 arr배열의 자리에 들어있는 ?를 10억! 으로 바꿔줌
				count++;	// 보물 찾은 횟수 증가
			}else {
				ar[num] = "꽝!";
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//while-true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

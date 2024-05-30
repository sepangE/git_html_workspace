package j0527;

import java.util.Scanner;

public class C0527_07 {

	public static void main(String[] args) {
				// 1번을 누르면 1- 20 까지의 랜덤숫자 생성
				// 2번을 누르면 숫자 맞추기게임 총 기회는 3번
				//      3번이후에 정답을 맞추지 못하면 정답 알려주기.
				// 3번을 누르면 while 문 종료
				Scanner scan = new Scanner(System.in);
				int rand=0;
				int count = 0;
				int inputnum=0;
				int a = 0;
				num20 : while(true) {
					System.out.println(" [ 숫자맞추기 프로그램 ] ");
					System.out.println(" 1. 랜덤숫자 생성 ");
					System.out.println(" 2. 숫자맞추기 게임 ");
					System.out.println(" 3. 종료 ");
					System.out.println(" ------------------ ");
					System.out.println(" 원하는 번호를 입력하세요 >> ");
					a = scan.nextInt();
				
					switch(a) {
						case 1:
							System.out.println("랜덤 숫자를 생성합니다");
							rand =(int)(Math.random()*20)+1;
							System.out.println(rand);
							break;
						case 2:
							System.out.println("숫자맞추기 게임!");
							System.out.println("총 기회는 3번입니다");
							
							count=1;
							while(count<4){
								System.out.println("1~20 사이의 숫자를 입력해주세요!");
								inputnum = scan.nextInt();
								if(inputnum == rand) {
									System.out.println("정답입니다!");
									break ;
								}else {
									System.out.println("오답입니다");
									 if(count==3) {
											System.out.printf("기회소진! 정답은 %d 였습니다",rand);
											break ;
										}
								}
								count++;
							}
						case 3 : break num20;
						default : System.out.println("잘못입력하셨습니다");
					}//switch
						
					
					
				}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package j0531;

import java.util.Scanner;

public class C0531_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tv t = new Tv();
		int choice = 0;
		int tmpVol = 0;
		while(true) {
			System.out.println("[리모콘 프로그램]");
			System.out.println("1.전원 on/off");
			System.out.println("2. 채널 up");
			System.out.println("3. 채널 down");
			System.out.println("4. 볼륨 up");
			System.out.println("5. 볼륨 down");
			System.out.println("6. 음소거");
			System.out.println("------------------------------------------");
			System.out.println("원하시는 번호를 입력하세요 ");
			choice = scan.nextInt();
			switch(choice) {
			case 1 : // 전원버튼
				t.power();
				if(t.power) System.out.println("전원 켜짐");
				else System.out.println("전원 꺼짐");
				break;
			case 2 : // 채널업
				if(!t.power) {
					System.out.println("전원을 켜주세요");
					break;
				}
				t.channelUp();
				System.out.println("현재 채널은 : "+t.channel);
				break;
			case 3 : // 채널다운
				if(!t.power) {
					System.out.println("전원을 켜주세요");
					break;
				}
				t.channelDown();
				System.out.println("현재 채널은 : "+t.channel);
				break;
			case 4 : // 볼륨업
				if(!t.power) {
					System.out.println("전원을 켜주세요");
					break;
				}
				t.volumnUp();
				System.out.println("현재 볼륨은 : "+t.volume);
				break;
			case 5 : // 볼륨다운
				if(!t.power) {
					System.out.println("전원을 켜주세요");
					break;
				}
				t.volumnDown();
				System.out.println("현재 볼륨은 : "+t.volume);
				break;
			case 6 : // 음소거
				if(!t.power) {
					System.out.println("전원을 켜주세요");
					break;
				}
				if(t.volume !=0) {
				tmpVol = t.volume;
				t.volume = 0;
				System.out.println("음소거되었습니다.");
				break;
				}else {
					t.volume = tmpVol;
					System.out.println("음소거 해제되었습니다");
					System.out.println("현재 음량 :"+t.volume);
				}
				break;
			default :
				System.out.println("잘못입력하셨습니다");
			}
			
			
		}//while true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

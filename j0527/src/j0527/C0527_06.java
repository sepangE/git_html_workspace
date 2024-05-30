package j0527;

public class C0527_06 {
	public static void main(String[] args) {
		// 주사위 두개를 던져서 같은 수가 나오면 더블! 이라고 출력하고 종료
		// 총 몇번의 시도만에 종료가 되었는지 출력하기
		
		
		int count = 0;
		while(true) {
			int a = ((int)(Math.random()*6)+1);
			int b = ((int)(Math.random()*6)+1);
			System.out.println("첫번째 주사위 "+a);
			System.out.println("두번째 주사위 "+b);
			System.out.println("------------");
			count++;
			if(a==b) {
				System.out.println("더블!");
				break;
			}// if
		}// while
		System.out.printf("총 %d 번 시도끝에 더블!",count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

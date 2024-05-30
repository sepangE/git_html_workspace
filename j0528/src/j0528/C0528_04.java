package j0528;

import java.util.Arrays;
import java.util.Scanner;

public class C0528_04 {
	public static void main(String[] args) {
		
		// 로또 프로그램
		// 1. 배열생성
		int[] num45 = new int[45];
		
		for(int i =0; i<num45.length;i++) {
			num45[i] += i+1;
		}
		System.out.println(Arrays.toString(num45));
		// 2. 로또번호 생성 (1~45 사이의 랜덤숫자 6개)
		
		for(int i=0;i<100;i++) {
			int k = (int)(Math.random()*45); // 당첨숫자 생성
			int tmp =num45[0];
			num45[0] = num45[k];
			num45[k] = tmp;
		}
		System.out.println(Arrays.toString(num45));
		int[] rnum = new int[6]; // 당첨 숫자를 저장할 변수
		for(int i = 0; i<rnum.length;i++) {
			rnum[i] = num45[i];
		}
		System.out.println(Arrays.toString(rnum));
		
		// 3. 로또번호 입력 (사람이 입력한 로또번호 6개 1~45)
		Scanner scan = new Scanner(System.in);
		int[] irnum = new int[6]; // 입력한 숫자를 저장하는 변수
		for(int i = 0; i<6;i++) {
			System.out.println((i+1)+"번째 로또번호를 입력해주세요! (1~45사이의 숫자)");
			irnum[i] = scan.nextInt();
		}
		System.out.println("입력한 숫자는 "+Arrays.toString(irnum));
		
		// 2. 로또번호 확인 (당첨된 숫자, 번호 출력)
		System.out.println("당첨번호는 "+Arrays.toString(rnum)+" 입니다!");
		// 2. 4등(3개) 3등(4개) 2등 (5개) 1등(6개)
		int[] lnum = new int[6];
		int count = 0; // 당첨된 숫자를 세는 변수
		int grade = 0; // 등수
		for(int i = 0; i<6;i++) {
			for(int j =0;j<6;j++) {
				if(rnum[i]==irnum[j]) {
					lnum[count] = rnum[i];
					count++;
				}//if
			}//for-j
		}//for-i
		System.out.print("당첨된 번호는 :");
		for(int i = 0; i<count;i++) {
			System.out.print(lnum[i]+" ");
		}
		String[] str = {"5천원","5만원","150만원","25억"};
		switch (count) {
			case 3: 
				grade = 4; 
				System.out.printf("번호가 %d개 일치하셔서 %d등 당첨! 축하드립니다!\n",count,grade);
				System.out.printf("당첨금은 %s 입니다 축하드립니다",str[0]);
				break;
			case 4 : 
				grade = 3; 
				System.out.printf("번호가 %d개 일치하셔서 %d등 당첨! 축하드립니다!\n",count,grade);
				System.out.printf("당첨금은 %s 입니다 축하드립니다",str[1]);
				break;
			case 5 : 
				grade = 2; 
				System.out.printf("번호가 %d개 일치하셔서 %d등 당첨! 축하드립니다!\n",count,grade);
				System.out.printf("당첨금은 %s 입니다 축하드립니다",str[2]);
				break;
			case 6 : 
				grade = 1;
				System.out.printf("번호가 %d개 일치하셔서 %d등 당첨! 축하드립니다!\n",count,grade);
				System.out.printf("당첨금은 %s 입니다 축하드립니다!",str[3]);
				break;
			default : System.out.println("꽝! 다음 기회를 노려보세요");
		}
		
		
		
		// 2.	 5천원	 5만원	 150만원	  25억	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

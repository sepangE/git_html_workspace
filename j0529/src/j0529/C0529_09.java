package j0529;

import java.util.Arrays;
import java.util.Scanner;

public class C0529_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//열 크기와 행 크기를 입력받아 . 배열에  a-z까지 채워 넣으세요 97~122
		//4, 5 를 입력 받으면
		
		//  출력 :
//			a b c d e
//			f g h i j
//			k l m n o
//			p q r s t
		int apb = 97;
		char[] ch = new char[26];
		String[][] st;
		int n1,n2;
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)apb;
			apb++;
		}
		// 2차배열 자릿수 정하기
		System.out.println("행과 열의 크기를 입력해주세요");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		st = new String[n1][n2];
		
		for(int i = 0; i< st.length;i++) {
			for(int j=0; j<st[i].length; j++) {
				st[i][j] = ""+ch[i*st[i].length+j];
			}//for-j
		}//for-i
		//출력
		for(int i = 0; i< st.length;i++) {
			for(int j=0; j<st[i].length; j++) {
				System.out.printf("%2s ",st[i][j]);
			}//for-j
			System.out.println();
		}//for-i
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

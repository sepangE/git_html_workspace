package j0530;

import java.util.Arrays;

public class C0530_03 {
	public static void main(String[] args) {
		
		// 비밀번호 만들기
		// a : 97~ z : 122, A : 65 ~ Z : 90, !:33 ~ / : 47
		// 소문자 배열, 대문자 배열, 숫자배열, 특수문자 배열 만들기
		// 위의 배열들을 랜덤하게 섞기
		// 12자리 크기의 char타입의 pwd 배열 만들기
		// 4. pwd에 소문자, 대문자, 숫자, 특수문자 배열에서 2~3 사이의
		//    값을 가져와서 pwd배열에 순차적으로 넣기
		//  ex. pwd={a,b,c,F,K,0,1,!,?,(,,}
		// 5. 가져온 숫자만큼의 배열을 새롭게 만들어서 pw ={a,b,c,F,K,0,1,!,?,(}
		// 6. 랜덤하게 섞어서 출력하기.
		
		// 변수선언
		char[] a = new char[26];
		char[] A = new char[26];
		char[] n = new char[10];
		char[] s = new char[15]; 
		char[] pwd = new char[12];
		int k = 0;
		int count = 0;
		char tmp;
		
		
		// 소문자배열
		count = 97;
		for(int i = 0; i < a.length; i++) {
			a[i] = (char)count;
			count ++;
		}
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < 300; i++) {
			k = (int)(Math.random()*26);
			tmp = a[0];
			a[0] = a[k];
			a[k] = tmp;
		}
		System.out.println(Arrays.toString(a));
			
			
		
		// 대문자 배열	
		count = 65;
		for(int i = 0; i< A.length; i++) {
			A[i] = (char)count;
			count++;
		}
		System.out.println(Arrays.toString(A));
		for(int i = 0; i < 300; i++) {
			k = (int)(Math.random()*26);
			tmp = A[0];
			A[0] = A[k];
			A[k] = tmp;
		}
		System.out.println(Arrays.toString(A));
		
		// 특수문자 배열
		count = 33;
		for(int i = 0; i<s.length; i++) {
			s[i] = (char)count;
			count++;
		}
		System.out.println(Arrays.toString(s));
		
		for(int i = 0; i < 300; i++) {
			k = (int)(Math.random()*15);
			tmp = s[0];
			s[0] = s[k];
			s[k] = tmp;
		}
		System.out.println(Arrays.toString(s));
		
		
		
		// 숫자배열
		count = 48;
		for(int i = 0; i<n.length; i++) {
			n[i] = (char)count;
			count++;
		}
		System.out.println(Arrays.toString(n));

		for(int i = 0; i < 300; i++) {
			k = (int)(Math.random()*10);
			tmp = n[0];
			n[0] = n[k];
			n[k] = tmp;
		}
		System.out.println(Arrays.toString(n));
		
//		count = 0;
//		for (int i = 0; i< pwd.length; i++) {
//			k = (int)(Math.random()*2)+2;
//			if(pwd[count]==0) {
//				for(int j = 0; j< k; j++) {
//				pwd[count] = a[count];
//				count++;
//				}
//			}else if(pwd[count]==0) {
//				for(int j = 0; j< k; j++) {
//				pwd[count] = A[count];
//				count++;
//				}
//		}// for-i
//		System.out.println(Arrays.toString(pwd));
		
		// 4. pwd에 소문자, 대문자, 숫자, 특수문자 배열에서 2~3 사이의 (random())
		//    값을 가져와서 pwd배열에 순차적으로 넣기
		//  ex. pwd={a,b,c,F,K,0,1,!,?,(,,}
		//            3+2+2+3 = 10 칸의 배열을 생성

		int cnt = 0 ; // 몇자리 배열인지 세줄 변수 
	/*	// 1. 소문자
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = lowercase[i];
		}
		cnt+=n; 
		// 2. 대문자 
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = uppercase[i];
		}
		cnt+=n; 
		// 3. 숫자 
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = number[i];
		}
		cnt+=n; 
		// 4. 특수문자 
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = special[i];
		}
		cnt+=n; 
		
		*/
		int ck = 1; // 소문자1, 대문자2, 숫자3, 특수 4 
		for(int i = 0 ; i < pwd.length ; i ++) {
			k = (int)(Math.random()*(3-2+1))+2;
			for(int j = 0 ; j< k ; j++ ) {
				if(ck==1) pwd[j+cnt] = a[j];
				if(ck==2) pwd[j+cnt] = A[j];
				if(ck==3) pwd[j+cnt] = n[j];
				if(ck==4) pwd[j+cnt] = s[j];
			}
			cnt+=k;
			if(ck==4) break;
			ck++;
		}
		

		System.out.println(Arrays.toString(pwd));
		System.out.println(cnt);
		// 5. 가져온 숫자만큼의 배열을 새롭게 만들어서 pw ={a,b,c,F,K,0,1,!,?,(}
		char[] pw = new char[cnt]; 
		for(int i = 0 ; i < pw.length; i++) {
			pw[i] = pwd[i];
		}
		// 6. 랜덤하게 섞어서 출력하기. 
		for(int i = 0 ; i< 500 ; i++) {
			k = (int)(Math.random()*pw.length); 
			tmp = pw[0];
			pw[0] = pw[k];
			pw[k] = tmp;
		}
		System.out.println(Arrays.toString(pw));
		String str = "";
		for(int i = 0 ; i < pw.length; i++) {
			str+= pw[i];
		}
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

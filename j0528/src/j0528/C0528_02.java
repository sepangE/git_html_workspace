package j0528;

import java.util.Arrays;

public class C0528_02 {
	public static void main(String[] args) {
		
		//[15, 45, 8, 39, 14, 43, 9, 30, 40, 35]
		// 위의 변수를 담는 배열 num만들기
		
		int[] num = {15, 45, 8, 39, 14, 43, 9, 30, 40, 35};	
		
		// 최대값 구하기
		int max = num[0]; // 배열의 첫번째 값으로 최대값을 우선 설정함
		// max = 15가 들어있음
		for(int i=0;i<num.length;i++) {
			// i = 0 pass, i = 1 max = 45, i = 2...pass 
			if (num[i] > max) {
				max = num[i];
			}//if
		}//for
		System.out.println("배열의 최대값 : "+max);
		// 최소값 구하기
		int min =num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i] < min) {
				min = num[i];
			}//if
		}//for
		System.out.println("배열의 최소값 : "+min);
		
		// 값들의 합계, 평균
		int sum = 0;
		for(int i = 0; i<num.length;i++) {
			sum += num[i];
		}
		System.out.println("배열 안의 값의 총합 : "+sum);
		double avg = sum/(double)num.length;
		System.out.println("배열 안의 값의 평균 : "+avg);
		
		// 10칸짜리 배열 만들고 평균이상인 것들만 배열에 넣어보기
		
		int[] oavg = new int[10];
		int j = 0;
		for(int i= 0;i<oavg.length;i++) {
			if(num[i]>avg) {
				oavg[j]= num[i];
				j++;
			}//if
		}//for
		System.out.println(Arrays.toString(oavg));
		
		
		int[] n = {1,2,3,4,5};
		// 잘 섞고싶다{5,1,4,3,2}
		System.out.println(Arrays.toString(n));
		
		int tmp = 0;
		tmp = n[0]; 	// tmp = 1
		n[0] = n[4];	// n[0] = 5
		n[4] = tmp; 	// n[4] = 1 
		System.out.println(Arrays.toString(n));
		
		tmp = n[1]; 	//tmp = 2
		n[1] = n[4];	//n[1] = 1
		n[4] = tmp;		//tmp = 2
		System.out.println(Arrays.toString(n));
		
		tmp = n[2];		//tmp = 3
		n[2] = n[3];	//n[2] = 4
		n[3] = tmp;		// n[3] = 3
		System.out.println(Arrays.toString(n));	
		
		// 0~5 사이의 랜덤한 숫자를 생성해서 셔플 하게되면 랜덤하게 섞인다
		int[] n1 = {1,2,3,4,5};
		for(int i=0; i<10; i++) { // 10번 반복하는 for문
			int k = (int)(Math.random()*5); // 0~5 사이의 랜덤한 숫자 생성
			int temp = n1[0];
			n1[0] = n1[k];
			n1[k] = temp;
			System.out.println(i+"번째 반복중, k : "+k);
			System.out.println(Arrays.toString(n1));
		}//for
		
		
		// 1~45의 숫자가 들어있는 배열을 만들어서
		int[] n45 = new int[45];
		for(int i = 0; i<n45.length; i++) {
			n45[i] = i+1;
		}
		System.out.println(Arrays.toString(n45));
		// 300번 섞어보기
		for(int i = 0; i<300;i++) {
			int k = (int)(Math.random()*45);
			int temp = n45[0];
			n45[0] = n45[k];
			n45[k] = temp;
			System.out.println(i+"번째 반복중, k : "+k);
			System.out.println(Arrays.toString(n45));
		}
		
		// 6칸 배열을 만들어서 섞인 배열에서 앞에 숫자 6개만 저장하기
		int[] n6 = new int[6];
		for(int i = 0; i<n6.length; i++){
			n6[i] = n45[i];
		}
		System.out.println(Arrays.toString(n6));

//      셔플 설명
//		int a1 = 10, a2 = 20;
//		System.out.println("a1 : "+a1+", a2 : "+a2);
//		int a3;
//		a3 = a1;	a3에 a1값을 임시로 넣어줌
//		a1 = a2;	a1에 a2값을 넣음
//		a2 = a3;	a2에 임시로 저장해놓은 a1값을 넣어줌 
//					a1과 a2가 서로 값이 바뀜
//		System.out.println("a1 : "+a1+", a2 : "+a2);
		
//		//     			 0   1   2   3   4   5
//		String[] arr = {"a","b","c","d","e","f"};
//		// arr의 0번째와 arr의 3번째 바꾸기.
//		String at;
//		at = arr[0];
//		arr[0] = arr[3];
//		arr[3] = at;
//		System.out.println(Arrays.toString(arr));
//		// arr의 0번째와 arr의 1번째 바꾸기
//		at = arr[0];
//		arr[0] = arr[1];
//		arr[1] = at;
//		System.out.println(Arrays.toString(arr));
//		// arr의 0 번째와 arr의 4번째 바꾸기
//		at = arr[0];
//		arr[0] = arr[4];
//		arr[4] =at;
//		System.out.println(Arrays.toString(arr));
//		// arr의 0번째와 arr의 5번째 바꾸기
//		at = arr[0];
//		arr[0] = arr[5];
//		arr[5] = at;
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

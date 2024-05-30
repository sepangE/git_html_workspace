package j0528;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C0528_03 {
	public static void main(String[] args) {
		
		// 1~45 사이의 랜덤한 숫자 6개를 저장한 배열을 만들어보세요
		int[] n6 = new int[6];
		for(int i = 0; i<n6.length; i++) {
			int k =(int)(Math.random()*45)+1;
			n6[i] = k;
		}
		System.out.println(Arrays.toString(n6));
		// [38, 37, 28, 25, 19, 42]
		// [20, 2, 34, 38, 11, 18]
		// 1~45 사이의 서로다른 랜덤한 숫자 6개가 필요한 경우
		
		// 1~45 를 저장한 배열을 만들어서
		// 위 배열을 충분히 섞어서
		// 앞에서 6개만 가져오면 - 절대 겹치지 않는 랜덤한 숫자 6개가 만들어짐
		
		int[] arr1 = {19, 35, 11, 38, 16, 18};
		int[] arr2 = {20, 45, 19, 16, 5, 11};
		
		// 두 배열에 서로 같은 숫자가 몇개 있는지 출력
		int count = 0; 
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					count++;
					
				}//if
			}//for=j
		}//for=i
		System.out.println(count);
		// 두 배열에 같은 값인 숫자는 무엇인지 출력 : 19,16,11
		int[] snum;
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(i+" : "+arr1[i]);
				}//if
			}//for=j
		}//for=i
		
		// 배열을 만들어서 같은값을 넣어 출력
		int[] arr3 = new int[6];
		int k = 0;
		for(int i = 0; i<arr3.length;i++) {
			for(int j = 0; j < arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr3[k] = arr1[i];
					k++;
				}
			}
		}
		System.out.println(k+" "+Arrays.toString(arr3));
		
		
		// 1~20 사이의 랜덤한 숫자로 채워진 5칸 배열을 만들어보세요
		// 1~20까지 순차적으로 들어간 배열
		int[] n20 = new int[20];
		for(int i = 0;i<n20.length;i++) {
			n20[i] += i+1;
		}
		
		// 1~20까지 순차적으로 들어간 배열 값을 서로 섞어줌
		for(int i = 0; i<50;i++) {
			// 0~19 사이의 숫자를 갖는 랜덤변수
			int t = (int)(Math.random()*20);
			int tmp = n20[0];  	// 임시로 만든 변수에 n20의 첫번째 배열의 값을 넣어줌
			n20[0] = n20[t];	// n20[0]의 값에 n20[t]의 값을 넣어줌
			n20[t] = tmp; 		// n20[t]의 값에 임시로 저장했던 n20[0] 값을 넣어줌 
		}
		System.out.println(Arrays.toString(n20));
		// 섞인 배열의 값 5개를 순차적으로 새로운 배열에 넣어줌
		// 값이 중복되지 않는 1~20 사이의 5칸 배열
		int[] n5 = new int[5];
		for(int i =0; i<n5.length;i++) {
			n5[i] = n20[i]; // n5[i]번째에 섞인 n20[i] 값을 넣어줌
		}
		System.out.println(Arrays.toString(n5));
				
		
		
		// 6칸 배열을 만들어서 입력한 숫자들로 채워진 6개의 배열을 출력
		Scanner scan = new Scanner(System.in);
		int[] num6 = new int[6];
		for(int i = 0; i<num6.length;i++) {
			System.out.println(i+"번째 배열에 넣을 숫자를 입력해주세요");
			num6[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(num6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

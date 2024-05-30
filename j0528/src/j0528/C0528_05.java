package j0528;

import java.util.Arrays;

public class C0528_05 {
	public static void main(String[] args) {
		// 복사
		// 변수
		int a = 10;
		int b = a;
		System.out.printf("a : %d, b: %d \n",a,b); // a 10, b 10
		a = 20;
		System.out.printf("a : %d, b: %d \n",a,b); // a 20, b 10
		
		// 배열의 경우
		// 값을 복사한게 아닌 주소값을 복사함
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		System.out.println(arr1+" , "+arr2); // 주소값 arr1: [I@6a5fc7f7 , arr2: [I@6a5fc7f7
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
	//	arr1:[1,2,3,4,5]
	//	arr2:[1,2,3,4,5]
		arr2[2] = 10;
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
	//	arr1 : [1, 2, 10, 4, 5]
	//	arr2 : [1, 2, 10, 4, 5]	
		
		// 참조 자료형은 메모리에 실제 데이터 값이 아닌 저장된 위치를 저장함
		// 얕은복사라고 표현
		// 얕은복사를 할 경우 데이터가 복사되는것이 아니라 메모리 주소가 복사됨
		
		// 배열을 복사하는 방법
		// 1.
		int[] arr3 = new int[arr1.length];// 배열 생성
		for(int i = 0; i<arr1.length; i++) {// 각 위치에 값만 넣어줌
			arr3[i] = arr1[i];
		}
		System.out.println(arr1+" , "+arr3);
		System.out.println("arr3 : "+Arrays.toString(arr3));
		// arr3 : [1, 2, 10, 4, 5]
		arr3[0] = 100;
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr3 : "+Arrays.toString(arr3));
		//arr1 : [1, 2, 10, 4, 5]		arr3 : [100, 2, 10, 4, 5]
		
		// 2.
		int[] arr4 = Arrays.copyOf(arr1, arr1.length); // copyOf 사용할 경우 깊은 복사(딥복사)가 됨
		System.out.println(arr1+" , "+arr4);
		System.out.println("arr4 : "+Arrays.toString(arr4));
		//arr4 : [1, 2, 10, 4, 5]
		arr4[0] = 7;
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr4 : "+Arrays.toString(arr4));
		//arr1 : [1, 2, 10, 4, 5]	arr4 : [7, 2, 10, 4, 5]
		
		
		
		// 총길이가 10개인 1~20 사이 홀수로 이루어진 배열을 하나 만들고
		// 그 배열을 복사해서
		int[] num1; // 홀수로 이루어진 배열
		int[] num2; // num1을 복사한 배열
		num1 = new int[10];
		int j = 0;
		for(int i = 0; i<20;i++) {
			if(i % 2 != 0) {
				num1[j] = i;
				j++;
			}//if
		}//for
		System.out.println(Arrays.toString(num1));
		
		num2 = new int[num1.length];
		for(int i = 0; i<num1.length;i++) {
			num2[i]=num1[i];
		}
		//방법 2.
		int[] num3 = Arrays.copyOf(num1, num1.length);
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));
		
		// 3. 부분복사
		int[] num4 = new int[num1.length];
		System.arraycopy(num1, 0, num4, 0, 5);
		//원본배열,원본배열복사시작인덱스, 
		//복사할배열, 복사할배열의 시작인덱스, 복사할 요소의 개수
		System.out.println(Arrays.toString(num4));
		
		
		// 배열의 길이
		System.out.println(num4.length);
		for(int i = 0; i< num4.length; i++) {
			System.out.print(num4[i]+" ");
		}
		
		// for-each
		// 배열이나 컬렉션 등 집합객체의 원소들을 하나씩 꺼낼때 사용함
		// for(요소자료형 변수명 : 집합객체){		}
		for(int yoso : num1) {
			System.out.println(yoso);
		}
		for(int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		
		char[] ch = {'a','b','c','d','e','f'};
		// for-each문을 사용해서 요소들을 줄바꿈 없이 출력
		for(char ch1 : ch) {
			System.out.print(ch1);
		}
		System.out.println();
		
		String[] name = {"홍길동","유관순","김구","강감찬","이순신"};
		// for each 문을 사용해서 제 이름은 홍길동입니다 출력
		for(String name1 : name) {
			System.out.printf("제 이름은 %s입니다. ",name1);
		}
		System.out.println();
		boolean[] power = { true, true, false, true, false, false, false};
		// for each문 사용해서 출력 true = 티비켜짐 false = 티비꺼짐
		for(boolean power1 : power) {
			if(power1 == true) {
				System.out.print("티비켜짐 ");
			}else {
				System.out.print("티비꺼짐 ");
			}
		}
		System.out.println();
		int[] score = {80,71,40,65,90,55,77,68,100};
		// 70점 이상은 합격 이하는 불합격이라 출력해보세요
		for(int score1 : score) {
			if(score1 >= 70) {
				System.out.print("합격 ");
			}else {
				System.out.print("불합격 ");
			}
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

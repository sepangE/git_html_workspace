package j0624;
import java.util.*;
public class C0624_03 {
	public static void main(String[] args) {
		/* 배열 단점.
		   1. 한번 크기를 정하면 변경할 수 없다 (필요곤간에 따라 늘리거나 줄일 수 없음)
		       공간크기가 부족할 경우 오류가 생김 > 큰 크기로 할당하면 메모리 낭비
		   2. 기록된 데이터에 대한 중간위치의 추가, 삭제가 불편함
		       추가, 삭제할때 원하는 위치부터 마지막까지 다른곳에 저장해놓고
		       가져다 쓰는 등 복잡한 알고리즘
		   3. 한 타입의 데이터만 저장이 가능하다
		   컬렉션의 장점
		   1. 저장크기 제약이 없다
		   2. 추가, 삭제, 정렬 등 간단하게 기능을 사용할 수 있다
		      자체 메서드가 있어서 따로 알고리즘을 구현할 필요가 없음
		   3. 여러타입의 데이터 저장이 가능(객체만)
		*/
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열 합계 : "+sum);
		// 합계 : 
		List<Object> list = new ArrayList<Object>();
		// 1 - 10 추가후 합계 구하기
		for(int i = 0; i < 10; i ++) {
			list.add(i+1);
		}
		for(Object i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		int lsum = 0;
		for(int i = 0; i<list.size(); i++) {
			// Object타입이라 형변환 해줘야함
			lsum += (Integer)list.get(i);
		}
		System.out.println("리스트 합계 : "+lsum);
		
		
	}
}

package j0620;

import java.util.ArrayList;

public class C0620_09 {
	public static void main(String[] args) {
		String[] str = {"포도","사과","딸기","수박","바나나","사과"};
		/* 1. 리스트를 만들어서 위 배열처럼 저장해보세요
		   2. 저장된 객체의 개수 출력하기
		   3. 딸기 출력하기
		   4. [] 없이 전체 출력하기
		   5. 바나나를 망고로 바꾸기
		   6. 딸기 삭제하기(딸기로)
		   7. 4번째 인덱스 값 삭제하기		   
		*/
		//1. 리스트를 만들어서 위 배열처럼 저장해보세요
//		List<String> fr = Arrays.asList(str);
		ArrayList fr = new ArrayList();
		fr.add("포도");
		fr.add("사과");
		fr.add("딸기");
		fr.add("수박");
		fr.add("바나나");
		fr.add("사과");
		System.out.println(fr); //[포도, 사과, 딸기, 수박, 바나나, 사과]
		//2. 저장된 객체의 개수 출력하기
		System.out.println("저장된 객체의 개수 : "+fr.size()); //저장된 객체의 개수 : 6
		//3. 딸기 출력하기
		System.out.println(fr.get(2)); // 딸기
		//4. [] 없이 전체 출력하기
		for(int i = 0; i < fr.size(); i++) {
			System.out.print(fr.get(i)+" "); //포도 사과 딸기 수박 바나나 사과
		}
		System.out.println();
		//5. 바나나를 망고로 바꾸기
		System.out.println(fr.indexOf("바나나")); // 4
		fr.set(4, "망고");
		System.out.println(fr); //[포도, 사과, 딸기, 수박, 망고, 사과]
		//6. 딸기 삭제하기(딸기로)
		try{
			fr.remove("딸기");
		} catch (Exception e){
			System.out.println("뭐가 잘못된거니");
			e.printStackTrace();
		}
		System.out.println(fr); //[포도, 사과, 수박, 망고, 사과]
		//7. 4번째 인덱스 값 삭제하기
		fr.remove(4);
		System.out.println(fr); //[포도, 사과, 수박, 망고]
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

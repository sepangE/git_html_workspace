package j0625;
import java.util.*;
public class Lotto {

	void lottoInput(List<Integer> list) {
		int cnt = 0;
		while(true) {
			int r = (int)(Math.random()*45)+1;
			if(!list.contains(r)) {
				list.add(r);
				cnt++;
			}
			if (cnt==6) break;
		}
	} // lottoInput
	
	void myInput(List<Integer> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("번호 6개 입력 구분 : 띄어쓰기");
		String s = scan.nextLine();
		String[] myNum = s.split(" ");
		for(int i = 0; i < myNum.length; i++) {
			list.add(Integer.parseInt(myNum[i]));
		}
	}// myInput
	
	void lottoPrint(List<Integer> list) {
		System.out.println("당첨번호 출력");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}// lottoPrint
	
	void myNumPrint(List<Integer> list) {
		System.out.println("내가 입력한 번호");
		for(Integer i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}// myNumPrint
	
	List<Integer> lottoWin(List<Integer> lotto,List<Integer> input){
		List<Integer> Wnum = new ArrayList<Integer>();
		for(int i = 0; i < lotto.size(); i++) {
			for(int j = 0; j< lotto.size(); j++) {
				if(lotto.get(i)==input.get(j)) {
					Wnum.add(lotto.get(i)); 
				} // if
			}// for - j
		} // for - i
		return Wnum;
	} // lottoWin
	
	void lottoResult(List<Integer> list) {
		System.out.println("당첨된 갯수 : "+list.size()+"개");
		System.out.print("당첨된 번호는 : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		} // for
		System.out.println();
	}// lottoResult
	
}//class

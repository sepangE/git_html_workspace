package j0625;
import java.util.*;
public class C0625_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 객체 선언 및 변수생성
		
		Lotto lo = new Lotto();
		List<Integer> lotto = new ArrayList<Integer>();
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> win;
		
		while(true) {
			lotto.clear();
			input.clear();
			System.out.println("1. 도전 2. 프로그램 종료");
			int a = scan.nextInt();
			if (a == 2) break;
			
		// 2. 1~45 사이의 중복이 없는 랜덤한 숫자6개 넣기
		lo.lottoInput(lotto);
		
		// 3. 6개 숫자넣기 (nextline()으로 한줄 입력받아서 해보기
		lo.myInput(input);
		
		// 4. 로또번호 출력하기 (for i = 0; i < lotto.size(); 로 출력
		lo.lottoPrint(lotto);
		
		// 5. 내번호 출력하기 (간단for문으로)
		lo.myNumPrint(input);
		
		// 6. win에 당첨된 번호 넣기
		win = lo.lottoWin(lotto, input);
		
		// 7. 최종결과 출력하기 당첨갯수, 당첨된 번호
		lo.lottoResult(win);
		
		}// while
		
	}
}

package j0607;

public class C0607_06 {

	public static void main(String[] args) {
		int[] myNum= {11, 21, 5, 35, 9, 19};
		
		int[] num = new int[5];
		Lotto[] lotto = new Lotto[5];
		// 객체 배열을 생성해서 총 5회에 같은 로또번호를 응모해서
		// 각 회당 몇등당첨인지 출력해보세요
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = new Lotto();
			lotto[i].generateLotto(11);
			lotto[i].printLotto();
			System.out.println(lotto[i].lottoWinBonus(myNum)+"등");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 로또 객체 생성 - 제 101 회
		Lotto lotto101 = new Lotto(); 
	//	lotto101.printLotto(); //[0, 0, 0, 0, 0, 0]
		lotto101.generateLotto(11);  // 6개의 랜덤한 숫자가 생성
	//	lotto101.printLotto(); // [12, 6, 22, 5, 28, 20]
		// 몇등 당첨인지 출력해주는 함수 만들어보기
		// lottoWin(myNum)
	//	int n = lotto101.lottoWin(myNum);
	//	int b = lotto101.lottoWinBonus(myNum);
	//	System.out.println(b);
		
		
		// 로또 6개의 숫자중에서 30,9,11은 반드시 들어가는
		// generateLotto 함수를 메서드 오버로딩을 사용해서 만들기
		
		
		
		
		
		
		
		
		
		Lotto lotto102 = new Lotto(); 
		lotto102.generateLotto();
	//	lotto102.printLotto();
		
		Lotto lotto103 = new Lotto(); 
		lotto103.generateLotto();
		//lotto103.printLotto();
		
		// 얘는 로또번호가 있어서 
		// 당첨된 번호도 알려줘야하고
		// 상금 도 알려줘야함
//		lotto101.insertNums(myNum); 
		// 배열을 보내면 몇개 당첨되었는지 상금은 얼마인지 알려줘야함
	//	Lotto lotto102 = new Lotto(); 
	}

}
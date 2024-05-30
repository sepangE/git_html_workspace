package j0529;

public class C0529_02 {
	public static void main(String[] args) {
		
		String[] names = {"짱구","철수","맹구","훈이","유리","철수"};
		int[] scores = {228,290,260,252,285,285};
		int[] rank = new int[names.length];
//Rank
		
		for(int i = 0; i< names.length; i++) {
			int rankCnt = 1; // 처음은 무조건 1등으로 시작
			for(int j =0; j<names.length; j++) {
				if(scores[i]<scores[j]) {
					rankCnt++;
				}//if
			}//for-j
			rank[i] = rankCnt;
		}//for-i
		
		// 전체 출력
		System.out.println("이름\t점수");
		System.out.println("-----------------");
		for(int i = 0; i< names.length; i++) {
			System.out.printf("%s\t%d\t%d\n",names[i],scores[i],rank[i]);
		}
		
		// 특정 학생만 출력
		System.out.println("\n-----------------");		
		System.out.println("이름\t점수\t등수");
		System.out.println("-----------------");
		int stu_no = -1;
		for(int i = 0; i< names.length; i++) {
			if(names[i].equals("맹구")) {
				System.out.printf("%s\t%d\t%d\n",names[i],scores[i],rank[i]);
				stu_no = i;
			}
		}
		if(stu_no == -1) {
			System.out.println("검색한 학생이 존재하지 않음");
		}
		
		// 맹구의 점수를 260 > 280으로 바꾸기
		int modi_no = -1;
		for(int i = 0; i< names.length; i++) {
			if(names[i].equals("맹구")) {
				modi_no = i;
			}
		}
		System.out.println("맹구는 배열의 "+modi_no+"방에 있습니다.");
		System.out.println("맹구의 점수는 "+scores[modi_no]+" 있습니다.");
		scores[modi_no] = 280; // 점수 수정
		System.out.println("맹구의 수정된 점수는 "+scores[modi_no]+"입니다.");
		
		// 학생성적 프로그램에서 수정을 할 경우엔
		// 예 : 국어점수 수정 > 국어점수는 수정, 해당 영어점수 수학점수를 가져와서
		//  	학생의 총점과 평균을 새롭게 수정해주어야 함.
//		kor[modi_no]=90;
//		totoal[modi_no]=kor[modi_no]+eng[modi_no]+math[modi_no];
//		avg[modi_no]= total[modi_no]/3.0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

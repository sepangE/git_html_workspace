package j0529;
import java.util.Scanner;
public class C0529_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생성적 입력은 한번에 여러명 할 수 있게 만들어주세요.
		// 출력 > 입력 > 검색 > 수정 > 등수 순으로 하시는게 편합니다. 
		// 검색은 학생이름으로 검색합니다.
		// 수정 시, 학생이름으로 검색해서, 수정할 과목을 물어 본 후 처리함
		
		//변수선언
		int num = 10;							// 학생 수 저장할 배열
		int[] no = new int[num];				// 입력한 순서 저장할 배열
		String[] name = new String[num];		// 이름 저장할 배열
		String mname;							// 수정,검색할때 입력받을 이름 저장할 변수
		int[] kor = new int[num];				// 국어점수 저장할 배열
		int[] eng = new int[num];				// 영어점수 "
		int[] math = new int[num];				// 수학점수 "
		int[] total = new int[num];				// 총점 "
		double[] avg = new double[num];			// 평균 "
		int[] rank = new int[name.length];		// 등수 "
		int count = 0, mno = 0, cno = 0;		// 입력한 학생 몇명인지, 수정/검색할때 사용할 변수, 수정 시 과목 선택할 변수	
		
		while(true) { 							// 무한반복문
			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			int input = scan.nextInt();			// 어떤 작업 할지 입력받음
			switch(input) {						// 입력한 숫자가 무엇인지에 따라 실행되는 코드
				case 0 :
					System.out.println("프로그램을 종료합니다.");
					break;
				case 1 :						// 성적입력
					System.out.println("성적 입력을 선택하셨습니다.");
					for(int i = count; i<num; i++) { // 학생의 정보 입력하는 for문
					System.out.println((i+1)+"번째 학생의 이름을 입력해주세요(0 입력시 이전화면)");
					name[i] = scan.next();		// name[i]번째에 이름 입력받아 저장
					if(name[i].equals("0")) break; 	// 0 입력하면 for문 탈출
					System.out.println("국어점수를 입력해주세요");
					kor[i] = scan.nextInt();	// kor[i]번째에 국어점수 입력받아 저장
					System.out.println("영어점수를 입력해주세요");
					eng[i] = scan.nextInt();	// eng[i]번째에 영어점수 입력받아 저장
					System.out.println("수학점수를 입력해주세요");
					math[i] = scan.nextInt();	// math[i]번째에 수학점수 입력받아 저장
					total[i] = kor[i]+eng[i]+math[i];	// total[i]번째에 입력받은 점수 총합
					avg[i] = (double)total[i]/3;		// 위의 평균
					count++;					// 입력한 학생 수 증가
					}
					
					break;						
				case 2 :
					System.out.println("성적 출력을 선택하셨습니다.");
					System.out.println("--------------------------------------------------------------------");
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
					System.out.println("--------------------------------------------------------------------");
					for(int i = 0; i<count; i++) { // 입력받은 성적정보들 출력
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",no[i],name[i],kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
					}
					break;
				case 3 :
					mno = -1;											// 검색, 수정에 필요한 변수 초기화
					System.out.println("성적 수정을 선택하셨습니다.");
					System.out.println("수정할 학생의 이름을 입력해주세요");
					mname = scan.next();								// 수정할 학생 이름 입력받음
					for(int i = 0; i< count; i++) {						// 입력받은 이름과 저장된 이름들 비교하는 for문
						if(mname.equals(name[i])) {						// 만약 입력받은 이름과 name[i]번째의 이름이 같다면
							mno = i;									// mno에 수정할 학생의 위치 저장
							break;
						}//if
					}//for
					if(mno == -1) {										// 위의 for문에서 일치하는 이름이 없는 경우
						System.out.println("존재하지 않는 학생입니다");
					}else {												// 위의 for문에서 일치하는 이름이 있다면
						System.out.println("수정할 과목의 번호를 입력해주세요");
						System.out.println("1.국어, 2.영어, 3.수학, 0.이전화면");
						cno = scan.nextInt();							// 수정할 과목 입력받음
						switch(cno) {
							case 0: break;								// 0 누르면 이전화면(switch 탈출)
							case 1:
								System.out.println("국어성적 변경을 선택하셨습니다.");
								System.out.println("점수 수정 전, 123 입력시 이전화면");
								cno = scan.nextInt();					// 
								if(cno == 123) break;
								System.out.println("변경할 점수를 입력해주세요");
								kor[mno] = scan.nextInt();				// 변경할 국어점수 입력받음
								total[mno] = kor[mno]+eng[mno]+math[mno];
								avg[mno] = (double)total[mno]/3;
								break;
							case 2:
								System.out.println("영어성적 변경을 선택하셨습니다.");
								System.out.println("변경할 점수를 입력해주세요");
								eng[mno] = scan.nextInt();
								total[mno] = kor[mno]+eng[mno]+math[mno];
								avg[mno] = (double)total[mno]/3;
								break;
							case 3:
								System.out.println("수학성적 변경을 선택하셨습니다.");
								System.out.println("변경할 점수를 입력해주세요");
								math[mno] = scan.nextInt();
								total[mno] = kor[mno]+eng[mno]+math[mno];
								avg[mno] = (double)total[mno]/3;
								break;
						}
					}
					break;
				case 4 :
					System.out.println("등수 처리를 선택하셨습니다.");
					for(int i = 0; i<name.length;i++) {
						int rcnt = 1;
						for(int j = 0; j<name.length;j++) {
							if(total[i]<total[j]) {
								rcnt++;
							}//if
						}//for-j
						rank[i] = rcnt;
					}//for-i
					System.out.println("등수처리가 완료되었습니다.");
					break;
				case 5 : 
					mno = -1;
					System.out.println("학생 성적 검색을 선택하셨습니다.");
					System.out.println("검색할 학생 이름을 입력해주세요");
					mname = scan.next();
					for(int i = 0; i< name.length;i++) {
						if(mname.equals(name[i])) {
							mno = i;
						break;	// for문 탈출
						}
					}
					if(mno == -1) { // 없을때
						System.out.println("존재하지 않는 학생입니다.");
					}else {
						System.out.println("검색한 학생의 성적은");
						System.out.println("----------------------------------------------------");
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
						System.out.println("----------------------------------------------------");
						for(int i = 0; i<count; i++) {
							if(mname.equals(name[i]))
							System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",no[mno],name[mno],kor[mno],eng[mno],math[mno],total[mno],avg[mno]);
						}//출력for문
					}
					break;
			
			
			}//switch


		} //while
	}// main
}// class
package j0530;
import java.util.Scanner;
public class C0530_11 {
	public static void main(String[] args) {
		// 출력 > 입력 > 검색 > 수정 > 등수 순으로 하시는게 편합니다. 
		Scanner scan = new Scanner(System.in);
		// 변수
		int num = 10;
		String[] name = new String[num];
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		int[] no = new int[num];
		int[][] score = new int[num][4];
		double [] avg = new double[num];
		int[] rank = new int[num];
		int count = 0;
		int total= 0;
		String sname;
		int mno, cno;
		
		while(true) {
			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			int input = scan.nextInt();
			switch(input){
			case 0 :
				System.out.println("프로그램을 종료합니다");
				break;
			case 1 :
				System.out.println("성적 입력을 선택하셨습니다.");
				
				for(int i = 0; i<num; i++) {
					System.out.println((i+1)+"번째 학생의 이름을 입력해주세요. 이전화면 0");
					name[i] = scan.next();
					if(name[i].equals("0"))break;
					for(int j = 0; j< score[i].length-1; j++) {
						System.out.println("국어점수를 입력해주세요");
						score[i][0] = scan.nextInt();
						System.out.println("영어점수를 입력해주세요");
						score[i][1] = scan.nextInt();
						System.out.println("수학점수를 입력해주세요");
						score[i][2] = scan.nextInt();
						total += score[i][j];
						score[i][3] = total;
						avg[i] = (double)total/3;
						break;
					}
					count++;
				}
				break;
			case 2 :
				System.out.println("성적 출력을 선택하셨습니다.");
				System.out.println("--------------------------------------------------------------------");
				for(int i = 0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
				for(int i = 0; i<count; i++) {
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f,%d\n",name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i],rank[i]);
				}
				break;
			case 3 :
				System.out.println("성적 수정을 선택하셨습니다");
				System.out.println("수정할 학생의 이름을 입력해주세요 이전화면 0");
				sname = scan.next();
				if(sname.equals("0")) break;
				mno= -1;
				for(int i = 0; i<count; i++) {
					if(sname.equals(name[i])) {
						mno=i;
					}
				}
				if(mno == -1) {
					System.out.println("존재하지 않는 학생입니다");
				}else {
					System.out.println("수정할 과목을 입력해주세요");
					System.out.println("1.국어 2.영어 3.수학 0.이전화면");
					cno = scan.nextInt();
					switch(cno) {
					case 1:
						System.out.println("국어성적 수정을 선택하셨습니다.");
						System.out.println("수정할 점수를 입력해주세요");
					}
				}
				break;
			case 4 :
				break;
			case 5 :
				System.out.println("성적 검색을 선택하셨습니다.");
				System.out.println("검색할 학생의 이름을 입력해주세요 이전화면 0");
				sname = scan.next();
				if(sname.equals("0")) break;
				mno = -1;
				for(int i = 0; i< count; i++) {
					if(sname.equals(name[i])) {
						mno = i;
					}
				}
				if(mno==-1) {
					System.out.println("존재하지 않는 학생입니다");
				}else {
					System.out.println("검색한 학생의 성적은");
					System.out.println("--------------------------------------------------------------------");
					for(int i = 0; i<title.length; i++) {
						System.out.print(title[i]+"\t");
					}
					System.out.println();
					System.out.println("--------------------------------------------------------------------");
					for(int i = 0; i<count; i++) {
						if(sname.equals(name[i]))
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f,%d\n",name[mno],score[mno][0],score[mno][1],score[mno][2],score[mno][3],avg[mno],rank[mno]);
					}
				}
				
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
			
			
			
			
		} // while-true
	}
}
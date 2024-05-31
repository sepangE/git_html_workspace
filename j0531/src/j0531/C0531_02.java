package j0531;

import java.util.Arrays;
import java.util.Scanner;

public class C0531_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수
				int cnt = 0; 
				String sun ;
				// n 명의 학생을
				String[] students = {"강백호", "서태웅", "채치수", "송태섭", "정대만", "권준호",
						"이달재", "신오일", "정병욱", "이호식", "이재훈", "오중식"};
				// 1조
				String[][] arr1 = new String[3][2];
				// 2 조로 나누어서
				String[][] arr2 = new String[3][2];
				/* 출력 :
				== 1조 ==
				강백호 서태웅
				채치수 송태섭
				정대만 권준호
				== 2조 ==
				이달재 신오일
				정병욱 이호식
				이재훈 오중식 */
				
				// 학생이름을 입력받아서   [송태섭은 1조 두번째줄 오른쪽에 있습니다] 를 출력
				//                    [이재훈은 2조 세번째줄 왼쪽에 있습니다.]
				
				for(int i = 0; i< arr1.length; i++) {
					for(int j = 0; j < arr1[i].length; j++) {
						arr1[i][j] = students[j+cnt];
						arr2[i][j] = students[(j+6)+cnt];
					}//for-j
					cnt++;
					cnt++;
				}//for-i
				
				System.out.println(Arrays.deepToString(arr1));
				System.out.println(Arrays.deepToString(arr2));
				
				System.out.println("== 1조 ==");
				for(int i = 0; i< arr2.length; i++) {
					for(int j = 0; j < arr2[i].length; j++) {
						System.out.print(arr1[i][j]+" ");
					}//for-j
					System.out.println();
				}//for-i
				System.out.println("== 2조 ==");
				for(int i = 0; i< arr2.length; i++) {
					for(int j = 0; j < arr2[i].length; j++) {
						System.out.print(arr2[i][j]+" ");
					}//for-j
					System.out.println();
				}//for-i
				
				System.out.println("선수의 이름을 입력해주세요");
				sun = scan.next();
				int group = 0;
				int line = 0;
				String dir ="";
				for(int i = 0; i< arr2.length; i++) {
					for(int j = 0; j < arr2[i].length; j++) {
						if(arr1[i][j].equals(sun)) {
							group = 1;
							line = i+1;
							dir = (j==0) ? "왼" : "오른";
						}else if(arr2[i][j].equals(sun)) {
							group = 2;
							line = i+1;
							dir = (j==0) ? "왼" : "오른";
						}
					}//for-j
				}//for-i
				if (group == 0) System.out.println("존재하지 않는 학새입니다.");
				else System.out.printf("%s은(는) %d조 %d번째줄 %s쪽에 있습니다.\n",sun,group,line,dir);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

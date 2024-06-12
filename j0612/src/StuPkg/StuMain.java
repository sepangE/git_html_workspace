package StuPkg;
import java.util.Scanner;
public class StuMain {

	public static void main(String[] args) {
		stuCal  stucal = new stuCal();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		loop : while(true) {
			choice = stucal.screenPrint();
			switch(choice) {
			case 1:
				stucal.scoreInput();
				break;
			case 2:
				stucal.scorePrint();
				break;
			case 3 :
				stucal.scoreModify();
				break;
			case 4 :
				stucal.scoreRank();
				break;
			case 5 : 
				stucal.searchPrint();
				break;
			case 0 :
				System.out.println("프로그램 종료");
				break loop;
			}
		}

	}

}

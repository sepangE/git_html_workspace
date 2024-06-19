package j0619;

import java.util.Calendar;

public class C0619_11 {
	public static void main(String[] args) {
		int year = 2024;
		int month = 5;
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		// 월은 0 - 11 을 가진다
		sDay.set(year,month-1,1);
		eDay.set(year,month,1);
		// 다음달 첫달에서 하루를 빼면 현재달의 마지막날이 된다
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		// 
		END_DAY = eDay.get(Calendar.DATE);
		System.out.println("        "+year+"년"+month+"월");
		System.out.println("   일   월   화   수   목   금   토");
		// 해당월의 1일이 어느 요일인지에 따라서 공백을 넣어준다
		for(int i = 1; i< START_DAY_OF_WEEK; i++) {
			System.out.print("    ");
		}
		for(int i = 1, n =START_DAY_OF_WEEK; i <= END_DAY; i++,n++) {
			System.out.print((i<10)?"   "+i : "  "+i);
			if(n%7==0) System.out.println(); // 일주일
		}
		
	}
}

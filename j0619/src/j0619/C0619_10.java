package j0619;
import java.util.Date;
import java.util.Calendar;
public class C0619_10 {
	public static void main(String[] args) {
		
		// java.util.Date - 날짜와 시간을 다룰 목적으로 만들어짐
		// 					거의 더이상 사용되진 않지만 쓰이긴함
		// java.util.Calendar - Date를 개선한 클래스
		
		// Calender cal = new Calendar(); // 는 사용 불가능
		// 캘린더는 추상클래스

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year+"년");
		// 월은 0부터 시작함 1월: 0, 2월 :1...
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month+"월");
		System.out.println("올해의 몇번째 주 "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");
		// 1: 일요일 2 : 월요일 3: 화요일 4:수요일 ...7: 토요일
		// 마지막날을 가져옴
		int lastday = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		// 일요일이 1부터 시작하기때문에 배열의첫번째 해당하는 곳은 비움
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2024, 5, 15); // 월은 0부터 시작하기때문에 5는 6월을 의미한다
		//date1을 오늘날짜로 설정하는 방법
		//set()을 사용하면 됨
		//date1.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
		System.out.println("date1 "+toString(date1)
					+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일");
//		date1 1년3월5일토요일
		System.out.println("date2 "+toString(date2)
		+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		// 오늘 날짜의 밀리세컨드를 구한다
		System.out.println(new Date(date1.getTimeInMillis()));
		System.out.println(new Date(date2.getTimeInMillis()));
		
		// 두 날짜간의 차이를 얻으려면 
		long diff = date2.getTimeInMillis() - date1.getTimeInMillis();
		System.out.println(diff);
		//345600000
		// 일로 계산하려면
		System.out.println(diff/(24*60*60*1000)+"일");
		
	}//main
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR)+"년"
				+(cal.get(Calendar.MONTH)+1)+"월"
				+cal.get(Calendar.DATE)+"일";
	}
	
	
}

package j0607;

public class Clock {
	
	// 변수 : hour, min, sec
	// 생성자
	// 메서드 : 시간출력하는 메서드
	
	int hour;
	int min;
	double sec;
	
	Clock(){}
	Clock(int a){
		hour = a;
	}
	Clock(int a, int b){
		hour = a;
		min = b;
	}
	Clock(int a, int b, double c){
		hour = a;
		min = b;
		sec = c;
	}
	void printTime() {
		System.out.printf("%d시 %d분 %.2f초\n",hour,min,sec);
	}
	
	
}// class

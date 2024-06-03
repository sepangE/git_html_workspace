package j0603;

public class Students {
	
	int stuNo;
	String name;
	int kor, eng, math, total;
	double avg;
	void total() {
		total = kor+math+eng;
	}
	void avg() {
		avg = (kor+math+eng)/3.0;
	}
	void print() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",stuNo,name,kor,eng,math,total,avg);
	}
	
	
	
	
}

package stuPkg;

public class Student {
	/*
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	System.out.println("-------------------------------------------------");
	System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
	System.out.println("-------------------------------------------------");
	System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
			stuNo, name, kor, eng, math, total, avg, rank	
	);
    */
	String name;
	int stuNo;
	static int count;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	{
		count++;
	}
	
	Student(){}
	Student(String name, int kor, int eng, int math){
		stuNo = count;
		this.name = name; 
		this.kor= kor; 
		this.eng = eng; 
		this.math=math;
		total = kor+eng+math;
		avg = total/3.0;
	}
	void printStuInfo() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
				stuNo, name, kor, eng, math, total, avg, rank	
		);
	}
	
	void reTotal() {
		this.total = this.kor+this.eng+this.math;
	}
	void reAvg() {
		this.avg = (this.kor+this.eng+this.math)/3.0;
	}
	
	
	
	
	
	
	
	
	
}

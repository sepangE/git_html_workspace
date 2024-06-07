package j0607;


public class Student {
	// Student 클래스를 만들어 보세요.
	// iv : no, name, kor, eng, total, avg, rank
	int no=0, kor=0, eng=0, math = 0, total = 0,rank =0;
	double avg = 0;
	String name;
	
	Student(){}// 기본생성자
	// 1. 생성자를 통해서 total, avg를 넣기.
	Student(String name, int kor, int eng, int math){
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	// 2. printStu()를 만들어 학생 객체의 정보전체 출력
	void printStu() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
				no,name,kor,eng,math,total,avg,rank);
	}
	// )
	// 3. sum(), average()메서드를 만들어서
	//   iv의 total, avg 값 넣기
	void sum() {
		this.total = this.kor+this.eng+this.math;
	}
	void average() {
		this.avg = this.total/3.0;
	}
	

	
	
	
	
	
	
	
	
	








































}




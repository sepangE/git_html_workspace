package j0621;
import java.util.*;
public class Student {
	// 필드 (iv, cv)
	private int stuNo;
	private String stuName;
	private List<Subject> subList = new ArrayList<Subject>();
	// 리스트 - 수강한 과목의 리스트
	
	// 생성자
	public Student(int stuNo, String stuName) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	// 메서드
	
	// 1. addSubject() 메서드 만들기
	public void addSubject(String title, int score) {
		subList.add(new Subject(title,score));
	}
	public void showInfo() {
		// 2. 과목 총점, 평균 출력
		
		System.out.println("번호 : "+stuNo);
		System.out.println("이름 : "+stuName);
		//System.out.println(subList.get(0).getTitle());
		for(int i = 0; i < subList.size(); i++) {
			System.out.print(subList.get(i).getTitle()+" : ");
			System.out.print(subList.get(i).getScore()+" ");
		}
		System.out.println();
		System.out.print("총점 : ");
		int total = 0;
		double avg;
		for(int i = 0; i < subList.size(); i++) {
			total += subList.get(i).getScore();
		}
		System.out.println(total);
		avg = (double)total/subList.size();
		System.out.printf("평균 : %.1f\n",avg);
	}
	
	
	
}

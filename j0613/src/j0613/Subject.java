package j0613;

public class Subject {
	//변수선언
	private String title;
	private int score;
	
	// 생성자
	Subject (){}
	Subject (String title){
		this.title = title;
	}
	Subject (String title, int score){
		//this.title = title; this.score = score;
		setTitle(title);
		setScore(score);
	}
	
	//메서드
	char getGrade() {
		if (score >= 90) return 'A';
		else if (score >= 80) return 'B';
		else if (score >= 70) return 'C';
		else if (score >= 60) return 'D';
		return 'F';
	}
	boolean equalSubject(String title) {
	if(	this.title.equals(title))return true;
	return false;
	}
	void compScore(int score) {
		if (this.score<score) System.out.println("입력하신 점수가 큽니다");
		else if (this.score==score) System.out.println("점수가 같습니다");
		else System.out.println("입력하신 점수가 작습니다");
	}
	
	// getter setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if (score>100 || score<0) System.out.println("잘못 입력되었습니다.");
		this.score = score;
	}
	
	
	
	
	
	
	
	
	
	
	
}

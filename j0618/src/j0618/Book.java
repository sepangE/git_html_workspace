package j0618;
// 추상클래스
public abstract class Book implements Page{
	// 변수
	int totalPageNum;	// 전체 페이지
	int currentPageNum; // 현재 페이지
	// 생성자
	Book(){} // 기본생성자
	Book(int total){
		totalPageNum = total;
	}
	// Object 메서드 toString() 오버라이딩
	public String toString() {
		return 	"전체 "+totalPageNum+"페이지 중 "+currentPageNum+"페이지";
	}
	// 인터페이스 추상메서드 구현

	public void page() {
		System.out.println("현재 "+currentPageNum+" 페이지");
	}
	public void page(int n) { // 메서드 오버로딩 (메서드명 같음 매개변수 다름)
		this.currentPageNum = n;
		System.out.println("현재 "+currentPageNum+" 페이지");
	}
	public void next() {
		currentPageNum++;
	}
	public void prev() {
		currentPageNum--;
	}
	
	
	
	
	
	
}

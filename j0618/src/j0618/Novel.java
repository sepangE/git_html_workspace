package j0618;

public class Novel extends Book{
/*책 클래스를 상속하여 소설 클래스를 만들어보세요
- 변수
name ,company, genre, writer
이름, 회사, 장르, 작가 속성
- 생성자
- 메서드
search(단어);  >> 단어의 내용을 00소설에서 검색합니다 출력
toString()  >>     소설책 [ 제목: 00, 출판사: 00, 장르 : 00, 작가: 00 ]
read() >> 소설책을 읽습니다.
 */
	// iv
	String name;
	String company;
	String genre;
	String writer;
	// 생성자
	Novel(){}
	public Novel(String name, String company, String genre, String writer,int totalPageNum){
		super(totalPageNum);
		this.name = name;
		this.company = company;
		this.genre = genre;
		this.writer = writer;
	}
	public void searcth(String word) {
		System.out.println(word+"의 내용을 "+name+"에서 검색합니다");
	}
	public String toString() {
		return "[소설책 제목 : "+name+", 출판사 : "+company+", 장르 : "+
					genre+", 작가 : "+writer+" ]"+super.toString();
	}
	public void read() {
		System.out.println(name+" 소설을 읽습니다");
	}
}

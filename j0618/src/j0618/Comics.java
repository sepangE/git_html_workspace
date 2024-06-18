package j0618;

public class Comics extends Book{
/*책 클래스를 상속하여 만화 클래스를 만들어보세요 Novel
- 변수
name ,company, writer, illuster, limitAge
이름, 회사, 글작가, 그림작가, 연령 제한 속성
- 생성자
- 메서드
toString()  >>
연령제한이 20세 미만일때:
만화책 [제목 : 00 , 출판사 : 00, 글 작가 : 00, 그림 작가 : 00
, 연령제한 : 00 세 미만 ] 총페이지 : 00 , 현재페이지 : 00
만화책 [제목 : 00 , 출판사 : 00, 글 작가 : 00, 그림 작가 : 00
, 연령제한 : 00 세 이상 ] 총페이지 : 00 , 현재페이지 : 00
read() >> 만화를 봅니다.
 */
	// 변수
	String name;
	String company;
	String writer;
	String illuster;
	int limitAge;
	// 생성자
	Comics(){}
	Comics(String name,String company , String writer, String illuster, int limitAge, int totalPageNum){
		super(totalPageNum);
		this.name = name;
		this.company = company;
		this.writer = writer;
		this.illuster = illuster;
		this.limitAge = limitAge;
	}
	public void read() {
		System.out.println(name+"을 봅니다.");
	}
	public String toString() {
		if(this.limitAge < 20) {
			return "[ 제목 : "+name+", 출판사 : "+company+", 글 작가 : "+writer+
						", 그림 작가 : "+illuster+", 연령 제한 : "+limitAge+" 세 미만 "+super.toString();
		}
		else {
			return "[ 제목 : "+name+", 출판사 : "+company+", 글 작가 : "+writer+
					", 그림 작가 : "+illuster+", 연령 제한 : "+limitAge+" 세 이상 "+super.toString();
		}
	}
	
	
	
	
}

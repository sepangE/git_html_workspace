package j0618;
public class Magazine extends Book{
/*
책 클래스를 상속하여 만화 클래스를 만들어보세요 Magazine
- 변수
name ,company, editor, type
이름, 회사, 에디터, 종류
- 생성자
- 메서드
QRCapture() >>  QR 캡처해보세요
toString()  >>
잡지 [제목 : 00 , 출판사 : 00 , 에디터 : 00 , 종류 : 00 ]
총페이지 : 00 , 현재페이지 : 00
read() >> 00 잡지를 읽습니다
 */
	// 변수
	String name;
	String company;
	String editor;
	String type;
	// 생성자
	Magazine(){}
	Magazine(String name,String company, String editor, String type,int totalPageNum){
		super(totalPageNum);
		this.name = name;
		this.company = company;
		this.editor = editor;
		this.type = type;
	}
	// 메서드
	public void read() {
		System.out.println(name+" 잡지를 읽습니다");
	}
	public void QRCapture() {
		System.out.println("QR코드를 촬영해보세요");
	}
	public String toString() {
		return "[ 제목 : "+name+", 출판사 : "+company+", 에디터 : "+
				editor+", 종류 : "+type+" "+super.toString();
	}
	
}

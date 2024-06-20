package j0620;

public class LPrinterDriver implements ColorPrintalbe {
	public void print(String doc) {
		System.out.println("엘지프린터 출력입니다");
		System.out.println(doc);
	}
	// 두개의 추상메서드를 구현해야함
	// ColorPrintalbe이 Printable을 상속했기때문
	public void colorPrint(String doc) {
		System.out.println("엘지프린터 출력입니다");
		System.out.println(doc);
	}
}

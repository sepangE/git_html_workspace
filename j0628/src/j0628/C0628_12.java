package j0628;
import java.util.*;
import java.io.*;
public class C0628_12 {
	public static void main(String[] args) throws Exception {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("콜라",1700));
		list.add(new Product("포카칩",1500));
		list.add(new Product("빈츠",2500));
		list.add(new Product("초코파이",3500));
		list.add(new Product("오징어집",2000));
		list.add(new Product("사이다",1500));
		
		
		String path = "C:/aaa/product.txt";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		String data = "";
		for(int i = 0; i < list.size(); i++) {
			data += list.get(i).getName()+
					list.get(i).getPrice()+"\n";
		}
		fw.write(data);
		fw.close();
		System.out.println("상품추가 완료");
	}
}

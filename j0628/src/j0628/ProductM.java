package j0628;
import java.util.*;
import java.io.*;
public class ProductM {
	Scanner scan = new Scanner(System.in);
	public Map<String, Object> productInput(List<Product> list, int count) {
		Map<String, Object> map = new HashMap<String, Object>();
		loop : while(true) {
			System.out.println((count+1)+"번째 상품 이름 입력 (종료 : 0)");
			String name = scan.next();
			if(name.equals("0")) break;
			System.out.println("해당 상품 가격 입력");
			int price = scan.nextInt();
			list.add(new Product(name,price));
			count++;
		}
		map.put("cnt", count);
		map.put("list", list);
		return map;
	}

	public void productPrint(List<Product> list) {
		System.out.println("상품 정보");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void searchP(List<Product> list) {
		int a = 0;
		System.out.println("[상품 검색]");
		System.out.println("검색할 상품 이름 입력 (종료 : 0)");
		String sName = scan.next();
		if(sName.equals("0")) return;
		for(Product l : list) {
			if(l.getName().contains(sName)){
				System.out.println(l);
				a = 1;
			}//if
		}//for
		if(a==0)System.out.println("상품이 존재하지 않음");
	} // searchP

	public int calPrice(List<Product> list) {
		System.out.print("등록된 상품의 총액 : ");
		int sum = 0;
		for(Product l : list) {
			sum += l.getPrice();
		}
		return sum;
	} // calPrice

	public Map<String, Object> readF() {
		List<Product> list = new ArrayList<Product>();
		Map<String, Object> map = new HashMap<String, Object>();
		String path = "C:/aaa/product.txt";
		File f = new File(path);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] arr = line.split(",");
				list.add(new Product(arr[0].trim(),Integer.parseInt(arr[1].trim())));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		map.put("list", list);
		System.out.println("파일에서 불러오기 완료");
		
		return map;
	}

	public void pSave(List<Product> list) throws Exception{
		String path = "C:/aaa/p1.txt"; // 저장될 위치
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		String data ="";// 파일에 쓸 문장들을 담는 문자열
		for(int i = 0; i < list.size(); i++) {
			data += list.get(i).getName()+","+
					list.get(i).getPrice()+"\n";
		}
		fw.write(data);
		fw.close();
		System.out.println("저장 완료");
	}

}

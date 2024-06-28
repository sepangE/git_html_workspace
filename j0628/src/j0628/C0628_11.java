package j0628;
import java.util.*;
import java.io.*;
public class C0628_11 {
	public static void main(String[] args) throws Exception{
		// Member 객체의 리스트 생성
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("짱구","aaa","1111"));
		list.add(new Member("철수","bbb","2222"));
		list.add(new Member("유리","ccc","3333"));
		list.add(new Member("맹구","ddd","4444"));
		list.add(new Member("훈이","eee","5555"));
		// 파일에 쓰기
		String path = "C:/aaa/mem.txt";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		String data = "";
		for(int i = 0; i < list.size(); i++) {
			data += list.get(i).getName() + ","+
					list.get(i).getId()+","+
					list.get(i).getPw()+"\n";
		}
		fw.write(data);
		fw.close();
		System.out.println("완료");
	}
}

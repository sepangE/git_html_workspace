package j0628;
import java.util.*;
import java.io.*;
public class C0628_10 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		String path = "C:/aaa/2.txt";
		File f = new File(path);
		BufferedReader br = null;
		String line="";
		
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				line = br.readLine();
				if(line == null) break;
				String[] pr = line.split(",");
				list.add(new Product(pr[0].trim(),Integer.parseInt(pr[1].trim())));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("읽어오기 끝");
		} // try - catch - finally
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
	}
}

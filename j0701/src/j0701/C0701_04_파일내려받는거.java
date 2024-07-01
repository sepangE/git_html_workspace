package j0701;
import java.net.*;
import java.io.*;
public class C0701_04_파일내려받는거 {
	public static void main(String[] args) throws Exception {
		// file받기
		String address = "https://github.com/lalabears/hg7/archive/refs/heads/main.zip";
		URL url = new URL(address);
		InputStream in = url.openStream();
		FileOutputStream out = new FileOutputStream("C:/aaa/t.zip");
		int ch = 0;
		while((ch=in.read())!= -1) {
			out.write(ch);
		}
		in.close();
		out.close();
	}
}

package j0628;
import java.util.*;
import java.io.*;
public class StuControl {
	ArrayList<Student> list = new ArrayList<Student>();
	Scanner scan = new Scanner(System.in);
	
	public Map<String, Object> stuInput(List<Student> list,int count) {
		Map<String, Object> map = new HashMap<String, Object>();

		while(true) {
			System.out.println("학생정보 입력");
			System.out.println((count+1)+"번 학생 이름 입력(종료 : 0)");
			String name = scan.next();
			if(name.equals("0")) break;
			System.out.println("국어점수 입력");
			int kor = scan.nextInt();
			System.out.println("영어점수 입력");
			int eng = scan.nextInt();
			System.out.println("수학점수 입력");
			int math = scan.nextInt();
			list.add(new Student(name,kor,eng,math));
			count++;
			System.out.println("입력완료");
		}
		map.put("cnt", count);
		map.put("stu", list);
		return map;
	}

	public void stuPrint(List<Student> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

	public List<Student> readFile() {
		String path = "C:/aaa/student.txt";
		List<Student> list = new ArrayList<Student>();
		Map<String, Object> map = new HashMap<String, Object>();
		File f = new File(path);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			System.out.println("[학생정보 불러오기]");
			while(true) {
				String stuInfo = br.readLine();
				if(stuInfo == null)break;
				String[] stuarr = stuInfo.split(",");
				list.add(new Student(stuarr[0].trim(),
						Integer.parseInt(stuarr[1].trim()),
						Integer.parseInt(stuarr[2].trim()),
						Integer.parseInt(stuarr[3].trim())
						));
			}//while
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		map.put("stu", list);
		System.out.println("불러오기 완료");
		return list;
	}

	public void saveFile(List<Student> list) {
		String path = "C:/aaa/student.txt";
		Map<String, Object> map = new HashMap<String, Object>();
		File f = new File(path);
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			String data = "";
			for(int i = 0; i < list.size(); i++) {
				data += list.get(i).getStuNo()+","+
						list.get(i).getName()+","+
						list.get(i).getKor()+","+
						list.get(i).getEng()+","+
						list.get(i).getMath()+","+
						list.get(i).getTotal()+","+
						list.get(i).getAvg()+"\n";
				
			}
			fw.write(data);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("저장완료");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

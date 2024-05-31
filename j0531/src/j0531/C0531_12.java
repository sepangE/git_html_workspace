package j0531;

import java.util.Scanner;

public class C0531_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int npwd;
		int mem;
		// 회원1 : 강백호 아이디는 aaa 비밀번호 1111
		Member mem1 = new Member();
		mem1.name = "강백호";
		mem1.id = "aaa";
		mem1.pwd =1111;
		// 회원2 : 서태웅 아이디는 bbb 비밀번호 2222
		Member mem2 = new Member();
		mem2.name = "서태웅";
		mem2.id = "bbb";
		mem2.pwd =2222;
		// 회원3 : 채치수 아이디 ccc 비밀번호 3333
		Member mem3 = new Member();
		mem3.name = "채치수";
		mem3.id = "ccc";
		mem3.pwd =3333;
		// 회원4 : 스캐너로 입력받기
		Member mem4 = new Member();
		System.out.println("회원 4의 이름을 입력해주세요");
		mem4.name = scan.next();
		System.out.println("회원 4의 아이디를 입력해주세요");
		mem4.id = scan.next();
		System.out.println("회원 4의 비밀번호를 입력해주세요");
		mem4.pwd = scan.nextInt();
		
		System.out.print("이름\t아이디\t비밀번호\n");
		System.out.printf("%s\t%s\t%d\n",mem1.name,mem1.id,mem1.pwd);
		System.out.printf("%s\t%s\t%d\n",mem2.name,mem2.id,mem2.pwd);
		System.out.printf("%s\t%s\t%d\n",mem3.name,mem3.id,mem3.pwd);
		System.out.printf("%s\t%s\t%d\n",mem4.name,mem4.id,mem4.pwd);
		System.out.println();
		
		System.out.println("비밀번호를 변경할 회원을 선택해주세요");
		mem = scan.nextInt();
		if(mem == 1) {
			System.out.println(mem+"번 회원을 선택하셨습니다");
			System.out.println("변경할 비밀번호를 입력해주세요");
			mem1.resetPw(npwd = scan.nextInt());
			System.out.println("비밀번호가 변경되었습니다.");
			System.out.print("이름\t아이디\t비밀번호\n");
			System.out.printf("%s\t%s\t%d\n",mem1.name,mem1.id,mem1.pwd);
			System.out.println();
		}
		else if(mem == 2) {
			System.out.println(mem+"번 회원을 선택하셨습니다");
			System.out.println("변경할 비밀번호를 입력해주세요");
			mem2.resetPw(npwd = scan.nextInt());
			System.out.println("비밀번호가 변경되었습니다.");
			System.out.print("이름\t아이디\t비밀번호\n");
			System.out.printf("%s\t%s\t%d\n",mem2.name,mem2.id,mem2.pwd);
			System.out.println();
		}
		else if(mem == 3) {
			System.out.println(mem+"번 회원을 선택하셨습니다");
			System.out.println("변경할 비밀번호를 입력해주세요");
			mem3.resetPw(npwd = scan.nextInt());
			System.out.println("비밀번호가 변경되었습니다.");
			System.out.print("이름\t아이디\t비밀번호\n");
			System.out.printf("%s\t%s\t%d\n",mem3.name,mem3.id,mem3.pwd);
			System.out.println();
		}
		else if(mem == 4) {
			System.out.println(mem+"번 회원을 선택하셨습니다");
			System.out.println("변경할 비밀번호를 입력해주세요");
			mem4.resetPw(npwd = scan.nextInt());
			System.out.println("비밀번호가 변경되었습니다.");
			System.out.print("이름\t아이디\t비밀번호\n");
			System.out.printf("%s\t%s\t%d\n",mem4.name,mem4.id,mem4.pwd);
			System.out.println();
		}
		else System.out.println("존재하지 않는 회원입니다");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 강백호 24살 키 190이고 몸무게는 95키로 로 만들기
		Person ps1 = new Person();		
		ps1.name = "강백호";
		ps1.age = 24;
		ps1.heigth = 190;
		ps1.weight = 95;
		// 서태웅 24살 키 188 몸무게 80키로 로 만들고
		Person ps2 = new Person();		
		ps2.name = "서태웅";
		ps2.age = 24;
		ps2.heigth = 188;
		ps2.weight = 80;
		// 채치수 28살 키 194 몸무게 120키로
		Person ps3 = new Person();		
		ps3.name = "채치수";
		ps3.age = 28;
		ps3.heigth = 194;
		ps3.weight = 120;
		
		
		ps1.print();
		System.out.println(ps1.name+"는 내년에 "+ps1.newYear() + "살");
		ps2.print();
		System.out.println(ps2.name+"는 내년에 "+ps2.newYear() + "살");
		ps3.print();
		System.out.println(ps3.name+"는 내년에 "+ps3.newYear() + "살");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

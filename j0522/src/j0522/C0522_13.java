package j0522;

import java.util.Scanner;

public class C0522_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 점수를 입력받아
		/*
		 100~97 : A+	96~93 : A	92~90 : A-
		 89~87  : B+	86~83 : B	82~80 : B-
		 79~77  : C+	76~73 : C	72~70 : C-
		 나머지 F
		*/
		System.out.println("점수를 입력해 주세요");
		int sc = scan.nextInt();
		
		if(100 >= sc&&sc >=97) {
			System.out.println("A+");
		}else {
			if(96 >= sc&&sc >=93) {
				System.out.println("A");
			}else {
				if(92 >= sc&&sc >=90) {
					System.out.println("A-");
				}else {
					if(89 >= sc && sc>= 87) {
						System.out.println("B+");
					}else {
						if(86 >= sc && sc>= 83) {
							System.out.println("B");
						}else {
							if(82 >= sc && sc>= 80) {
								System.out.println("B-");
							}else {
								if(79 >= sc && sc>= 77) {
									System.out.println("C+");
								}else {
									if(76 >= sc && sc>= 73) {
										System.out.println("C");
									}else {
										if(72 >= sc && sc>= 70) {
											System.out.println("C-");
										}else {
											System.out.println("");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

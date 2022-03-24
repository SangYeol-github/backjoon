
/*
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String num = sc.next();
		String[] b = num.split("");
		
		int c = Integer.parseInt(b[0])*100;
		int d = Integer.parseInt(b[1])*10;
		int e = Integer.parseInt(b[2]);
		
		System.out.println(a*e);
		System.out.println(a*d/10);
		System.out.println(a*c/100);
		System.out.println(a*Integer.parseInt(num));
		
		
	}
}

	
	



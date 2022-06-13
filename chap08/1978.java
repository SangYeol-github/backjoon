/*
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		for(int i=0; i<a; i++) {
			int b = 0;
			
			int c = sc.nextInt();
			for(int j=1; j<=c; j++) {
				if(c % j == 0) {
					b++;
				}
			}
			if(b == 2) {
				sum++;
			}
			
		}
		System.out.println(sum);
		
	}

}

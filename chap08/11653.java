/*
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 2;
		
		while(a >= b) {
			if(a % b ==0) {
				System.out.println(b);
				a /= b;
			} else {
				b++;
			}
		}
		
	}

}

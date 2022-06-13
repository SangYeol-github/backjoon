/*
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 1;
		
		for(int i=a; i>0; i--) {
			sum *= i;
		}
		
		System.out.println(sum);
		
	}

	
		
	

}

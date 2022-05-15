/*N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[] b = new int[a];
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<b.length; i++) {
//			System.out.println(b[i]);
			if(b[i] <= min) {
				min = b[i];
			}
			
			if(b[i] >= max) {
				max = b[i];
			}
			
		}
		System.out.println(min + " " + max);
		
		
		sc.close();
	}

}


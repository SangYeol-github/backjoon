//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
//		System.out.println(a + " " + b);
		int[] c = new int[a];
		for(int i=0; i<a; i++) {
			int d = sc.nextInt();
			c[i] = d;
		}
		
		for(int i=0; i<a; i++) {
//			System.out.print(c[i] + " ");
			if(c[i] < b) {
				System.out.print(c[i] + " ");
			}
		}
		
		
	}

}


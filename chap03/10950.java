
/*

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */


import java.util.Scanner;

public class Main { 
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
		}
		
		
	} 
}



	
	



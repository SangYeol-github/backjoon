//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[6];
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		List<Integer> arr = new ArrayList<Integer>();
//		
//		for(int i=0; i<arr.size(); i++) {
//			int c = sc.nextInt();
//			int d = sc.nextInt();
//			int f = c + d;
////			System.out.println(f);
//			arr.add(f);
//			
//		}
//		
//		for(int i=0; i<arr.size()-1; i++) {
//			System.out.println(arr);
//			
//		}
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}
		
		
		
	}

}


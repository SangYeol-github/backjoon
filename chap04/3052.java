/*
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[42];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i< 10; i++) {
			try {
				arr[Integer.parseInt(br.readLine()) % 42] = true;
			}  catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		int count = 0;
		for(boolean a : arr) {
			if(a) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
//		int[] arr = new int[10];
//		
//		int a = 0;
//		
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
////			System.out.print(arr[i] + " ");
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = arr[i] % 42;
////			System.out.print(arr[i] + " ");
//		}
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length; j++) {
//				if(arr[i] == arr[j]) {
//					continue;
////					System.out.println(a);
//				} 
//			}
//			a++;
//		}
//		
//		if(a==0) {
//			System.out.println(1);
//		} else {
//			System.out.println(a);			
//		}
		
		
		

//		sc.close();
	}

}


/*
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a * b * c;
		String e = Integer.toString(d);
		String[] str = e.split("");
		
		int[] arr = new int[10];
		
		for(int i=0; i<str.length; i++) {
//			System.out.print(str[i]);
			if(str[i].equals("0")) {
				arr[0]++;
			} else if(str[i].equals("1")) {
				arr[1]++;
			} else if(str[i].equals("2")) {
				arr[2]++;
			} else if(str[i].equals("3")) {
				arr[3]++;
			} else if(str[i].equals("4")) {
				arr[4]++;
			} else if(str[i].equals("5")) {
				arr[5]++;
			} else if(str[i].equals("6")) {
				arr[6]++;
			} else if(str[i].equals("7")) {
				arr[7]++;
			} else if(str[i].equals("8")) {
				arr[8]++;
			} else if(str[i].equals("9")) {
				arr[9]++;
			} 
				
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		
		
		
		sc.close();
	}

}


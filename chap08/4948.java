/*
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	
	public static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws IOException  {
		
		Scanner sc = new Scanner(System.in);
		
		get_prime();
		
		while(true) {
			int a = sc.nextInt();
			if(a == 0) {
				break;
			}
			
			int count = 0;
			
			for(int i = a + 1; i <= 2 * a; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
		}
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		bw.write(String.valueOf(num));
//		bw.flush();
//		bw.close();
//		System.out.println(num);
		
//		while(true) {
////			int a = Integer.parseInt(br.read());
//			String num = br.readLine();
////			int a = br.read();
//			int a = Integer.parseInt(num);
////			if(a == 1) {
////			System.out.println(1);
////		} else if(a == 0) {
////			break;
////		}
//		if(a == 0) {
//			break;
//		}
//		int sum = 0;
//		
//		for(int i=a+1; i<=2*a; i++) {
//			int b = 0;
//			for(int j=1; j<=2*a; j++) {
//				if(i % j == 0) {
//					b++;
//				}
//			}
//			if(b == 2) {
//				sum += b;
////				System.out.println(i);
//			}
//		}
//		bw.write(String.valueOf(sum/2));
////		bw.write(String.valueOf(a));
//		bw.write("\n");
//		bw.flush();
//		
////			}
//		}
//		bw.close();
//		br.close();
		
//		System.out.println(sum/2);
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			int a = sc.nextInt();
////			if(a == 1) {
////				System.out.println(1);
////			} else if(a == 0) {
////				break;
////			}
//			if(a == 0) {
//				break;
//			}
//			int sum = 0;
//			
//			for(int i=a+1; i<=2*a; i++) {
//				int b = 0;
//				for(int j=1; j<=2*a; j++) {
//					if(i % j == 0) {
//						b++;
//					}
//				}
//				if(b == 2) {
//					sum += b;
////					System.out.println(i);
//				}
//			}
//			
//			System.out.println(sum/2);
//						
//			
//		}
		
		
	}

	private static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}

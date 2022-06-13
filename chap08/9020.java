/*
1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.

골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		
		get_prime();
		
		int num = sc.nextInt();
		
		while(num-- >0) {
			int a = sc.nextInt();
			int b = a / 2;
			int c = a / 2;
			
			while(true) {
				
				if(!prime[b] && !prime[c]) {
					System.out.println(b + " " + c);
					break;
				}
				b--;
				c++;
			}
			
		}
		
		
//		int a = sc.nextInt();
////		int sum = 0;
//		List<Integer> l1 = new ArrayList<Integer>();
//		for(int i=0; i<a; i++) {
//			int b = 0;
//			
//			int c = sc.nextInt();
//			for(int j=1; j<=c; j++) {
//				for(int k=1; k<=c; k++) {
//					if(c % j == 0) {
////						System.out.print(j);
//						b++;
//					}
//				}
//				
////				System.out.println();
//
////				if(c % j == 0) {
////					b++;
////				}
//				if(b == 2) {
//					System.out.println(j);
////					sum++;
////				l1.add(j);
//				}
//			}
//			System.out.println();
//		}
////		System.out.println(sum);
		
		
	}

	private static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j= i *i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
	}

}

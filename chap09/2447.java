/*
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

 */

import java.util.Scanner;

public class Main {
	
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				f(i, j);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	public static void f(int x, int y) {
		
		if(x < 3 && y < 3) {
			if(x % 3 == 1 && y % 3 == 1) {
				sb.append(" ");
			} else {
				sb.append("*");
			}
		} else {
			if(x % 3 == 1 && y % 3 == 1) {
				sb.append(" ");
			} else {
				f(x / 3, y / 3);
			}
		}
	}
}

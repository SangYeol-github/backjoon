/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        String c = sc.next();
        String[] d = c.split("");

        int sum = 0;

        for(int i=0; i<b.length; i++) {
            b[i] = Integer.parseInt(d[i]);
        }

        for(int i=0; i<b.length; i++) {
            sum += b[i];
        }

        System.out.println(sum);

    }
}

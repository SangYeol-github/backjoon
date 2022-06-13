/*
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        char[] c;

        for(int i=0; i<a; i++) {
            b = sc.nextInt();
            c = sc.next().toCharArray();

            for(int j=0, k=c.length; j<k; j++) {
                for(int y=0; y<b; y++) {
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }



//        for(int i=0; i<a; i++) {
//            int b = sc.nextInt();
//
//            String str = sc.nextLine();
//            String[] st = str.split("");
//            for(int j=0; j<b; j++) {
//                System.out.print(st[j]);
//            }
//
//        }


    }
}

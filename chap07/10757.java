/*

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        System.out.println(b1.add(b2));


    }
}


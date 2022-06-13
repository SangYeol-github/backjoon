/*
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

*/

import java.util.Scanner;



public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        int count = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean check() {

        boolean[] check = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }else {
                continue;
            }
        }
        return true;
    }


}


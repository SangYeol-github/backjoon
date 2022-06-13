/*
상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.

전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

*/

import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] st = str.split("");
//        String str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        System.out.println(st.countTokens());
//        System.out.println(st);

//        for (int i = 0; i < st.length; i++) {
//            System.out.println(st[i]);
//        }

        int sum = 0;

//        for (int i = 0; i < st.length; i++) {
//            if (st[i].equals("A") || st[i].equals("B") || st[i].equals("C")) {
//                sum += 3;
//                System.out.println(i);
//            }
//            System.out.println(sum);


        for(int i=0; i<st.length; i++) {
            if(st[i].equals("A") | st[i].equals("B") | st[i].equals("C")) {
                sum += 3;
            } else if (st[i].equals("D") | st[i].equals("E") | st[i].equals("F")) {
                sum += 4;
            } else if (st[i].equals("G") | st[i].equals("H") | st[i].equals("I")) {
                sum += 5;
            } else if (st[i].equals("J") | st[i].equals("K") | st[i].equals("L")) {
                sum += 6;
            } else if (st[i].equals("M") | st[i].equals("N") | st[i].equals("O")) {
                sum += 7;
            } else if (st[i].equals("P") | st[i].equals("Q") | st[i].equals("R") | st[i].equals("S")) {
                sum += 8;
            }  else if (st[i].equals("T") | st[i].equals("U") | st[i].equals("V")) {
                sum += 9;
            } else if (st[i].equals("W") | st[i].equals("X") | st[i].equals("Y") | st[i].equals("Z")) {
                sum += 10;
            } else if (st[i].equals("1")) {
                sum += 2;
            } else if (st[i].equals("0")) {
                sum += 11;
            }
//            System.out.println(sum);
            }
        System.out.println(sum);

        }
    }
//}

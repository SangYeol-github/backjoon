// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for(int i=1; i<=a; i++) {
            if(i <= 99) {
                b += 1;
            } else if (i <= 999) {
                String[] c = Integer.toString(i).split("");
                if ((Integer.parseInt(c[1]) - Integer.parseInt(c[0])) == (Integer.parseInt(c[2])- Integer.parseInt(c[1]))) {
                    b += 1;
                }
            }
        }
        System.out.println(b);
    }
}

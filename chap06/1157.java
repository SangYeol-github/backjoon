/*
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

*/

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int count = 0;

        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 'A']++;
            } else {
                arr[str.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for(int i=0; i<26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            } else if(arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);



    }
}


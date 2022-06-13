/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        String a = sc.nextLine();

        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);

            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }

        }
        for(int val : arr) {
            System.out.print(val + " ");
        }




//        /*String a = sc.next();
//        String[] b = a.split("");
//        int[] c = new int[26];
//
//        char[] arr = new char[26];
//
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = (char)(97+i);
//        }
//
//        *//* for(int i=0;i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();*//*
//
////        for(int i=0;i<b.length;i++) {
////            System.out.print(b[i] + " ");
////        }
//
//
//        for(int i=0; i<c.length; i++) {
//            c[i] = -1;
//        }
//
//        for(int i=0; i<c.length; i++) {
//            for(int j=0; j<b.length; j++) {
//                if(b[j].equals(arr[i])) {
//                    c[i] = i;
//                }
//            }
//        }
//        for(int i=0; i<c.length; i++) {
//            System.out.print(c[i] + " ");
//        }*/


    }
}

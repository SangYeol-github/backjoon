/*
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

*/

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == 'c') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {

                        i++;
                    }
                    else if(str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if(ch == 'd') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'z') {
                        if(i < str.length() - 2) {
                            if(str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }

                    else if(str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if(ch == 'l') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if(ch == 'n') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if(ch == 's') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            else if(ch == 'z') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            count++;

        }

        System.out.println(count);


//        int sum = 0;
////        String a = sc.next();
////        String[] st = a.split("");
//        char[] st = sc.next().toCharArray();
//        int[] arr = new int[st.length];
//
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = 0;
//        }
//
//        for(int i=0; i<st.length; i++) {
////            System.out.println(st[i]);
////            st[i] = (char) Integer.parseInt(String.valueOf(st[i]));
////            int a = 0;
////            a = (int)st[i];
////            st[i] = (char) a;
//            arr[i] = (int)st[i];
////            System.out.println(arr[i]);
//        }
//
////      c = 99
////      = = 61
////      d = 100
////      z = 122
////      - = 45
////      n = 110
////      l = 108
////      j = 106
////      s = 115
//
////      c=  160
////      c-  144
////      dz= 283
////      d-  145
////      lj  214
////      nj  216
////      s=  176
////      z=  183
//
//
//
////        for(int i=0; i<arr.length; i++) {
//////            if(arr[i] == 100 & arr[i+1] ==122 & arr[i+2] == 61) {
//////                sum += 1;
//////            }
////
////            if(arr[i]+ arr[i+1] == 160 | arr[i]+ arr[i+1] == 144 |  arr[i]+ arr[i+1] == 283 | arr[i]+ arr[i+1] == 183
////                    | arr[i]+ arr[i+1] == 145 | arr[i]+ arr[i+1] == 214 | arr[i]+ arr[i+1] == 216 | arr[i]+ arr[i+1] == 176) {
////                sum += 1;
////            } else {
////                sum += 1;
////            }
////        }
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr.length; j++) {
//                if(arr[i] == 100 & arr[j] ==122) {
//                    sum += 1;
//                }
//                if(arr[i]+ arr[j] == 160 | arr[i]+ arr[j] == 144 |  arr[i]+ arr[j] == 283 | arr[i]+ arr[j] == 183
//                    | arr[i]+ arr[j] == 145 | arr[i]+ arr[j] == 214 | arr[i]+ arr[j] == 216 | arr[i]+ arr[j] == 176) {
//                sum += 1;
//            } else {
//                sum += 1;
//            }
//            }
//            System.out.println(sum);
//        }
//
//        System.out.println(sum);

    }
}


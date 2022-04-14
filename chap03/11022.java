
/*

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */



import java.util.Scanner;

public class Main { 
	public static void main(String[] args)  { 
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println("Case #" +i + ": "+ b + " + " + c + " = " + (b+c));
		}
		
	} 
}



	
	



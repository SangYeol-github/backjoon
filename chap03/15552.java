
/*

첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
 다음 T줄에는 각각 두 정수 A와 B가 주어진다.
 A와 B는 1 이상, 1,000 이하이다.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main { 
	public static void main(String[] args) throws IOException { 
		
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
		
	} 
}



	
	



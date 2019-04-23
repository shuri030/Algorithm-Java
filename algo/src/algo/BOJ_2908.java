package algo;

import java.io.*;
import java.util.*;

public class BOJ_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		StringBuffer sa = new StringBuffer(a);
		a = sa.reverse().toString();
		
		StringBuffer sb = new StringBuffer(b);
		b = sb.reverse().toString();
		
		int a_num = Integer.parseInt(a);
		int b_num = Integer.parseInt(b);
		
		
		if(a_num > b_num) {
			System.out.println(a_num);
		}
		else {
			System.out.println(b_num);
		}
		
	}

}

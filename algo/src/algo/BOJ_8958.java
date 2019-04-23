package algo;

import java.io.*;
import java.util.*;

public class BOJ_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcase;
		String input;
		char[] problem = new char[80];
		Scanner sc = new Scanner(System.in);
		testcase = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < testcase; i++) {
			input = sc.nextLine();
			int past = 0, score = 0;
			
			
			for(int j = 0; j < input.length(); j++) {
				problem[j] = input.charAt(j);
			}
			
			for(int j = 0; j < input.length(); j++) {
				if(problem[j] == 'X') {
					past = 0;
				}
				else {
					past++;
					score += past;
				}
			}
			
			System.out.println(score);
			
		}
	

	}

}

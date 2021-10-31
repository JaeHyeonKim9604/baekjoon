package baekjoon_stage_1_to_9.stage7;

import java.util.Scanner;

public class Exercise1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int num = 0;
		
		for(int i = 0; i < N; i++) {
			String temp = sc.nextLine();
			num += Exercise1316.findGroupWord(temp);
		}
		
		System.out.println(num);
		sc.close();
	}
	
	public static int findGroupWord(String str) {
		int YorN = 1;
		char[] ch = str.toCharArray();

		if(str.length() < 2) {
			YorN = 1;
		}
		
		for(int i = 0; i < str.length()-1; i++) {
			if(ch[i] != ch[i+1]) {
				for(int j = i+1; j < str.length(); j++) {
					if(ch[i] == ch[j]) {
						YorN = 0;
					}
				}
			}
		}
		
		
		return YorN;
	}

}

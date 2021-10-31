package baekjoon_stage_1_to_9.stage7;

import java.util.Scanner;

public class Exercise11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		char[] num = new char[N];
		for(int i = 0; i < N; i++) {	
			num[i] = str.charAt(i);
		}
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += num[i] - '0';
		}
		System.out.println(sum);
		
		sc.close();
	}

}

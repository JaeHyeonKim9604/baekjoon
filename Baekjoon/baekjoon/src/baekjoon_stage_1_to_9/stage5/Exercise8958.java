package baekjoon_stage_1_to_9.stage5;

import java.util.Scanner;

public class Exercise8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String OX;
		int sum = 0;
		int cnt = 0;
		
		for(int t = 0; t < T; t++) {
			OX = sc.nextLine();
			for(int i = 0; i < OX.length(); i++) {
				if(OX.charAt(i) == 'O') {
					cnt++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			System.out.println(sum);
			cnt = 0;
			sum = 0;
		}
		
		sc.close();
	}

}

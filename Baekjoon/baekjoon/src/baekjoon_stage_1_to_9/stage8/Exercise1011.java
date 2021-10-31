package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

//Fly me to the Alpha Centauri//

public class Exercise1011 {

	public static void main(String[] args) {
		/*
		 * sum					   cnt
		 * 1						1
		 * 1 1						2
		 * 1 2 1					3
		 * 1 2 2 1					4
		 * 1 2 3 2 1				5
		 * 1 2 3 3 2 1				6
		 * 1 2 3 4 3 2 1 			7
		 * 1 2 3 4 4 3 2 1			8
		 * ...						...
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long x, y, n;
		
		for(int i = 0; i < T; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			n = y - x;
			System.out.println(Exercise1011.alphaCentauri(n));
		}
		
		sc.close();
	}
	
	public static long alphaCentauri(long n) {
		if(n == 1 || n == 2) {
			return n;
		}
		
		long sum = 2;
		long cnt = 2;
		
		for(int i = 2; i < n; i++) {
			for(int t = 0; t < 2; t++) {
				sum += i;
				cnt++;
				if(sum >= n) {
					break;
				}
			}
			if(sum >= n) {
				break;
			}
		}
		
		return cnt;
	}

}

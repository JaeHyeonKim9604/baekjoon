package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

public class Exercise2292 {

	public static void main(String[] args) {

		/*
		 * 벌집 문제
		 * 1 -> 2 ~ 7 : 1칸
		 *   -> 8 ~ 19 : 2칸 + 12
		 *   -> 20 ~ 37 : 3칸 + 18
		 *   -> 38 ~ 61 : 4칸 + 24
		 *   
		 *   마지막 수의 일반항 : f(n) = 6n + f(n-1)
		 *   
		 *   f(n-1) < N <= f(n) 일때
		 *   n을 출력
		 */
				
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sol = 0;

		for(int n = 1; n < N; n++) {
			if(N > Exercise2292.honeycomb(n)) {
				continue;
			}
			else {
				sol = n;
				break;
			}
		}
		
		System.out.println(sol + 1);
						
		sc.close();
	}
			
	public static int honeycomb(int n) {
		if(n == 1) {
			return 7;
		}
		return 6*n + honeycomb(n-1);
	}
}

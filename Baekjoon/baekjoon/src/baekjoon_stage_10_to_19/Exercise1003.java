package baekjoon_stage_10_to_19;

import java.util.Scanner;

public class Exercise1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = 0;
		
		for(int i = 0; i < T; i++) {
			N = sc.nextInt();
			int a = Exercise1003.fibonacci(N);
			int b = Exercise1003.fibonacci(N+1);
			System.out.println(a + " " + b);
		}
		
		sc.close();
	
	}

	static public int fibonacci(int n) {
		if(n < 3) {
			if(n == 0) {
				return 1;
			} else if(n == 1) {
				return 0;
			} else {
				return 1;
			}
		}
		
		int[] cache = new int[n+1];
		cache[0] = 0;
		cache[1] = 0;
		cache[2] = 1;
		
		for(int i = 3; i < cache.length; i++) {
			cache[i] = cache[i-1] + cache[i-2];
		}
		
		return cache[n];
	}

}

package baekjoon_stage_1_to_9.stage9;

import java.util.Scanner;

// N을 입력받고 N부터 2N 까지의 소수의 갯수를 출력
public class Exercise4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(N != 0) {
			System.out.println(Exercise4948.findPrimeNum(N, 2*N));
			N = sc.nextInt();
		}
		
		sc.close();
	}
	
	public static int findPrimeNum(int m, int n) {
		int count = 0;
		int M = m;
		int N = n;
		boolean[] arr = new boolean[N+1];
		arr[1] = true;
		
		// 두 수의 곱으로 표현되면 true 저장
		for(int k = 2; k <= N; k++) {
			for(int i = 2; k*i <= N; i++) {
				arr[i*k] = true;
			}
		}
		
		for(int i = M+1; i < arr.length; i++) {
			if(!arr[i]) {
				count++;
			}
		}
		return count;
	}

}

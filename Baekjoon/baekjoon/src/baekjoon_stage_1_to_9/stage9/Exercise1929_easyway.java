package baekjoon_stage_1_to_9.stage9;

import java.util.Scanner;

public class Exercise1929_easyway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] arr = new boolean[N+1];
		arr[1] = true;
		
		// 두 수의 곱으로 표현되면 true 저장
		for(int k = 2; k <= N; k++) {
			for(int i = 2; k*i <= N; i++) {
				arr[i*k] = true;
			}
		}
		
		for(int i = M; i < arr.length; i++) {
			if(!arr[i]) {	// false만 출력(false = 소수)
				System.out.println(i);
			}
		}
		sc.close();
	}

}
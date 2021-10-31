package baekjoon_stage_10_to_19.stage10;

import java.util.Scanner;

// fibonacci 수열을 재귀함수로.
// 0번째 항목이 0, 1번째 항목이 1 일때 N번째 피보나치수를 구하는 프로그램
public class Exercise10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Exercise10870.fibonacci(N));
		sc.close();
	}
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		return Exercise10870.fibonacci(n-1) + Exercise10870.fibonacci(n-2);
	}
}

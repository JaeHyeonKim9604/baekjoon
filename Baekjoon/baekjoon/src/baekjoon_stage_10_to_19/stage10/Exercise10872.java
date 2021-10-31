package baekjoon_stage_10_to_19.stage10;

import java.util.Scanner;

// factorial을 재귀함수로 작성
public class Exercise10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Exercise10872.factorial(N));
		sc.close();
	}
	
	public static int factorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		return n * Exercise10872.factorial(n-1);
	}
}

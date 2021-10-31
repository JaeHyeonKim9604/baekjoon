package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

public class Exercise2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int k, n;
		
		for(int i = 0; i < T; i++) {
			k = sc.nextInt();	// 층
			n = sc.nextInt();	// 호
			System.out.println(Exercise2775.familyNum(k, n));
		}
		
		sc.close();
	}
	/*
	 * 1 1+1+2 1+1+2+1+2+3 1+1+2+1+2+3+1+2+3+4 
	 * 1  1+2     1+2+3          1+2+3+4
	 * 1   2        3               4 
	 */
	public static int familyNum(int k, int n) {
		int sum = 0;
		int[][] arr = new int[k+1][n+1];
		// arr[k][n] = arr[k-1][1] + ... + arr[k-1][n-2] + arr[k-1][n-1] + arr[k-1][n];
		
		
		for(int i = 0; i <= n; i++) {
			arr[0][i] = i;
		}
		
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= n; j++) {
				sum += arr[i-1][j];
				arr[i][j] += sum;
			}
			sum = 0;
		}
		
		return arr[k][n];
	}
}

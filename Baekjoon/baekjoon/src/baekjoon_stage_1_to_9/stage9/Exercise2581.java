package baekjoon_stage_1_to_9.stage9;

import java.util.Arrays;
import java.util.Scanner;

// 입력된 두 수 M이상 N이하의 소수의 합과 가장 작은 소수를 출력
// 두 수 사이에 소수가 없다면 -1 출력
public class Exercise2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M, N;
		M = sc.nextInt();
		N = sc.nextInt();
		
		Exercise2581.findSumAndMin(M, N);
		
		sc.close();
	}
	
	public static void findSumAndMin(int m, int n) {
		int a = 0;
		boolean YN = true;
		
		if(m == n) {
			int num = (Exercise2581.findPrimeNumber(n) > 0)?n:-1;
			if(num == -1) {
				System.out.println(-1);
				return;
			}
			else {
				System.out.println(num);
				System.out.println(num);
				return;
			}
		}
		
		int[] arr = new int[n-m];
		
		if(m == 1) {m++;}
		
		for(int i = m; i <= n; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					YN = false;
					break;
				}
			}
			if(YN) {
				arr[a] = i;
				a++;
			}
			YN = true;
		}
		
		if(Arrays.stream(arr).sum() == 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(Arrays.stream(arr).sum());
		System.out.println(arr[0]);
	}
	
	public static int findPrimeNumber(int num) {
		int count = 0;
		
		if(num == 1) {
			return count;
		}
		
		else if(num == 2) {
			count++;
			return count;
		}
		
		else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					return count;
				}
			}
			count++;
			return count;
		}
	}
}

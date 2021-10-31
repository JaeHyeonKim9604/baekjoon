package baekjoon_stage_1_to_9.stage9;

import java.util.Scanner;

// 소수 찾기
// N개의 숫자 중 소수의 개수 출력
public class Exercise1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			cnt += Exercise1978.findPrimeNumber(sc.nextInt());
		}
		
		System.out.println(cnt);
		sc.close();
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

package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

public class Exercise2839 {

	public static void main(String[] args) {
		// N이 3 또는 5의 배수의 합으로 나타날때 
		// 배수의 합 중 가장 작은 수를 출력
		// 3의배수와 5의배수의 합으로 나타나지 않으면 -1 출력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		
		result = (N%3==0)?(N/3):(N%5==0)?(N/5):2000;	// 우선 3의 배수 혹은 5의 배수인지 확인 후 값 저장
		
		for(int i = 0; i < N/3 + 1; i++) {
			for(int j = 0; j < N/5 + 1; j++) {
				if(i*3 + j*5 == N) {
					result = (result > i+j)?i+j:result;
				}
			}
		}
		if(result == 2000) {
			result = -1;
		}
		System.out.println(result);
		sc.close();
	}
}

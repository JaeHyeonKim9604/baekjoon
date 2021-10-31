package baekjoon_stage_1_to_9.stage9;

import java.util.Scanner;

// 에라토스테네스의 채를 이용해 소수를 구하는 프로그램
public class Exercise1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] arr = new boolean[N+1];
		arr[1] = true;
		
		// k의 배수을 index로 갖는 배열은 true 저장
		for(int k = 2; k < Math.sqrt(N)+1; k++) {	// k는 a^2 > N 를 만족하는 a의 최솟값보다 작은 소수
			for(int i = M; i < N+1; i++) {			// M번째부터 N번째 배열까지
				if(arr[i] != true && (i % k == 0 && i != k)) {	// k의 배수를 index로 하는 배열의 값을 true로 바꿔줌
					arr[i] = true;
				}
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

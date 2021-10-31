package baekjoon_stage_1_to_9.stage9;

import java.util.Scanner;

// 골드 바흐의 추측
/* 
 * 2보다 큰 짝수는 두 소수의 합으로 표현 가능할때 이를 골드바흐 파티션이라고 하며
 * 두 소수를 출력. 이때,
 * 조건 1. 둘 중 작은 소수부터 출력하고
 * 조건 2. 한 수에 대한 골드바흐 파티션이 여러개일때는 두 소수의 차가 가장 작은쌍을 출력
 */
public class Exercise9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		// 테스트 케이스
		
		int n;						// 입력받을 수
		int[] arr;					// n 이하의 소수를 전달받을 배열
		boolean run = true;			// 조건 충족시 이탈을 위한 변수
		
		for(int i = 0; i < T; i++) {
			n = sc.nextInt();
			arr = Exercise9020.findPrimeNum(n);
			
			// 조건 2를 위한 index 찾기
			int z = 0;
			for(int d = 0; d < arr.length; d++) {
				if(arr[d] >= n/2) {
					z = d;
					break;
				}
			}
		
			// 두 소수의 합이 n 일때 두 소수를 출력
			// index k 는 절반부터 0까지
			// index t 는 k 부터 가장 큰 소수 까지
			for(int k = z; k >= 0; k--) {
				for(int t = k; t < arr.length; t++) {
					if(arr[k] + arr[t] == n) {
						System.out.println(arr[k] +" "+ arr[t]);
						run = false;
						break;
					}
				}
				if(!run) {
					run = true;
					break;
				}
			}
		}
		
		sc.close();
	}
	
	// 2 이상 n 이하의 소수를 요소로 갖는 배열 반환
	public static int[] findPrimeNum(int n) {
		int N = n;
		boolean[] arr = new boolean[N+1];
		arr[0] = true;
		arr[1] = true;
		int count = 2;	// 전체 배열 중 소수가 아닌 수의 개수
		
		// 두 수의 곱으로 표현되면(소수가 아니면) true 저장
		for(int k = 2; k < Math.sqrt(N)+1; k++) {
			for(int i = 2; i < N+1; i++) {
				if(arr[i] != true && (i % k == 0 && i != k)) {
					arr[i] = true;
					count++;
				}
			}
		}
		
		int[] pNum = new int[arr.length - count];		// N이하의 소수의 배열 pNum
		int j = 0;
		
		for(int i = 2; i < arr.length; i++) {
			if(!arr[i]) {
				pNum[j] = i;
				j++;
			}
		}
		
		return pNum;
	}

}

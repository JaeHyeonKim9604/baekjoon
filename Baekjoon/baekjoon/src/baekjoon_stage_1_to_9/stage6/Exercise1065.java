package baekjoon_stage_1_to_9.stage6;

import java.util.Scanner;

public class Exercise1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] numbers = new boolean[N+1];	// N 이하의 수는 한수이거나 한수가 아니므로 크기가 N인 boolean형 배열을 선언
		
		for(int i = 1; i <= N; i++) {
			if(Exercise1065.hanSoo(i)) {
				int idx = i;
				numbers[idx] = true;	// 한수를 index로 갖는 요소만 true로 변경
			}
		}
		int count = 0;
		for(int i = 1; i <= N; i++) {
			if(numbers[i]) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
	
	// n 이하의 한수 찾기 
		// 한수 : 각 자리가 등차수열을 이루는 양의 정수
		public static boolean hanSoo(int n) {
			// 1 ~ 99는 모두 한수
			if(1 <= n && n <= 99) {
				return true;
			}
			
			// 각 자릿수 분리
			int k = n;
			int cnt = 0;	// 자릿수 카운트
			while(k!=0) {
				cnt++;
				k /= 10;
			}
			
			k = n;
			int[] sum = new int[cnt];	// n의 자릿수 만큼의 배열 생성
			// 0번째 배열에 1의자릿수, 1번째 배열에 10의자릿수...저장
			for(int i = 0; i < sum.length; i++) {
				sum[i] = k%10;			
				k /= 10;
			}
			
			// 각 요소들이 등차수열 관계인지 확인
			int[] cha = new int[sum.length-1];	// 각 요소의 차를 저장할 배열 cha 생성
			for(int i = 1; i < sum.length; i++) {
				cha[i-1] = sum[i-1] - sum[i];
			}
			
			for(int i = 1; i < cha.length; i++) {
				if(cha[i-1] != cha[i]) {		// 한수가 아닐 경우
					return false;
				}
			}

			return true;						// 한수일 경우
		}

}

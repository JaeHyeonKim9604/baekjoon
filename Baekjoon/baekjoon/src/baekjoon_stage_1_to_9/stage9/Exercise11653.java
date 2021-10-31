package baekjoon_stage_1_to_9.stage9;

import java.util.Scanner;

// 입력받은 N을 소인수분해한 결과를 출력
// N 이 1이면 아무것도 출력하지 않음
public class Exercise11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = N;
		
		for(int i = 2; i <= temp; i++) {
			if(temp % i == 0) {
				System.out.println(i);
				temp /= i;
				i = 1;
			}
			if(temp == 1) {
				break;
			}
		}
		
		sc.close();
	}

}

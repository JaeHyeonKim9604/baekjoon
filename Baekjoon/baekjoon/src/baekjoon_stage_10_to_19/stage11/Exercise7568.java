package baekjoon_stage_10_to_19.stage11;

import java.util.Scanner;

// 덩치
// 몸무게와 키를 입력받아
// 몸무게와 키 모두가 큰 사람 순으로 순위를 매김
// 자신보다 몸무게와 키 모두가 큰 사람이 k명일때 등수는 k+1명

public class Exercise7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] person = new int[5][N];		// 0행 : 몸무게 / 1행 : 키
		int count = 1;
		
		for(int i = 0; i < N; i++) {
			person[0][i] = sc.nextInt();
			person[1][i] = sc.nextInt();
			person[2][i] = i+1;
			person[3][i] = i+1;
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(person[0][j] > person[0][i] && person[1][j] > person[1][i]) {
					count++;
				}
			}
			person[2][i] = count;
			count = 1;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(person[2][i]);	
		}
		
		sc.close();
	}

}

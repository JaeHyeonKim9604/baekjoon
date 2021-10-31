package baekjoon_stage_10_to_19.stage11;

import java.util.Scanner;

// 체스판 문제
public class Exercise1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		String[] str = new String[N];
		char[][] board = new char[N][M];
		boolean[][] ch = new boolean[N][M];
		int[][] count = new int[N][M];
		
		// 문자열로 입력 후 char[][]로 저장
		// boolean[][]에 'B'는 true, 'W'는 false로 저장
		for(int i = 0; i < N; i++) {
			str[i] = sc.nextLine(); 
			for(int j = 0; j < M; j++) {
				board[i][j] = str[i].charAt(j);
				if(board[i][j] == 'B') {
					ch[i][j] = true;
				}
			}
		}
		
		// 우선 전부 체스판 형태로 바꿔줌
		// 이때, 바꿔준 부분의 좌표는 같은 좌표의 count[][]에 1을 추가
		boolean run = true;
		// 'B' = true, 'W' = false
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(!run) {
					if(ch[i][j] != run) {
						ch[i][j] = run;
						count[i][j] = 1;
					}
					run = !run;
				}
				else {
					if(ch[i][j] != run) {
						ch[i][j] = run;
						count[i][j] = 1;
					}
					run = !run;
				}
			}
			if(M%2==0) {				// 홀수일때는 다음줄 첫번째 항목과 이전줄 마지막 항목이 다름
				run = !run;	
			}
		}
		

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(count[i][j]);
			}
			System.out.println();
		}
		
		// 가장 많이 바꿔주어야 할 때의 바꾼 횟수 = 32;
		/*
		 *  8 8
			WBWBWBWB
			WBWBWBWB
			WBWBWBWB
			WBWBWBWB
			WBWBWBWB
			WBWBWBWB
			WBWBWBWB
			WBWBWBWB
		 */
		
		int large = 32;
		int temp = 0;
		int count1 = 0;
		
		for(int i = 0; i <= N-8 ; i++) {
			for(int j = 0; j <= M-8; j++) {
				for(int k = i; k < i+8; k++) {
					for(int l = j; l < j+8; l++) {
						if(count[k][l] == 1) {
							count1++;
						}
					}
				}
				temp = (count1 > 32)?64-count1:count1;		// 바꿔줘야하는게 32보다 많으면 바꿀것의 수와 안바꿀것의 수를 교체
				large = (temp <= large)?temp:large;
				count1 = 0;
			}
		}
		
		System.out.println(large);
		sc.close();
	}
	
}

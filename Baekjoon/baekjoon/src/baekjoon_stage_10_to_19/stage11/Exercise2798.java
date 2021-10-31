package baekjoon_stage_10_to_19.stage11;

import java.util.Scanner;

//브루트 포스
// new 블랙잭
// N과 M을 입력받아 N장의 카드 중, 합계가 M 이하이면서 M에 가장 가까운 카드 3장의 합을 출력

public class Exercise2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] card = new int[N];
		
		for(int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}
		System.out.println(black(card, M));
		
		sc.close();
	}
	
	public static int black(int[] card, int M) {
		int sum = 0;
		int temp = 0;
		
		for(int i = 0; i < card.length-2; i++) {
			for(int j = i+1; j < card.length-1; j++) {
				for(int k = j+1; k < card.length; k++) {
					sum = card[i] + card[j] + card[k];
					if(sum <= M && temp < sum) {
						temp = sum;
					}
				}
			}
		}
		
		return temp;
	}
	
}

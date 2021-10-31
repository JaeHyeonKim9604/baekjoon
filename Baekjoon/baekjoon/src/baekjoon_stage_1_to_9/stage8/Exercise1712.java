package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

public class Exercise1712 {

	public static void main(String[] args) {
		// 손익분기점
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();	// 고정비용
		B = sc.nextInt();	// 가변비용
		C = sc.nextInt();	// 판매비용(수입)
		if(B >= C && A != 0) {
			System.out.println(-1);
			sc.close();
			return;
		}
		int num = A / (C - B);
		System.out.println(num+1);
		sc.close();
	}
}

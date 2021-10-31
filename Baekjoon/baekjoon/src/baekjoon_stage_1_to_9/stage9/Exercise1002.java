package baekjoon_stage_1_to_9.stage9;

import java.util.*;

// 터렛
// 두 원의 교점의 개수를 구하는 프로그램
public class Exercise1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, y1, r1, x2, y2, r2;
		int T;
		double d;
		
		// T 입력
		T = sc.nextInt();
		int[] result = new int[T];
		
		// T번 반복
		for(int i = 0; i < T; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			// 두 좌표 사이의 거리 d 정의
			d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
			result[i] = Exercise1002.compare(d, r1, r2);
			
		}
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		sc.close();
		
	}
	
	static public int compare(double d, int r1, int r2) {
		if(d == r1 + r2 || d == Math.abs(r1 - r2)) {
			return (d == 0)? -1 : 1;
		}
		else if(d > r1 + r2 || d < Math.abs(r1 - r2)) {
			return 0;
		}
		else if(d == 0 && r1 != r2) {
			return 0;
		}
		else /*if(d < r1 + r2 && d > Math.abs(r1 - r2)) */{
			return 2;
		}
		
	}

}

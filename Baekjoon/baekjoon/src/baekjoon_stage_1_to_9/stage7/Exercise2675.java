package baekjoon_stage_1_to_9.stage7;

import java.util.Scanner;

public class Exercise2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		// testcase
		
		for(int t = 0; t < T; t++) {
			int R = sc.nextInt();		// 문자 반복 횟수
			String str = sc.nextLine();	// 문자열 입력
			
			// substring(int index) : 문자열을 index번 부터 시작
			char[] ch = new char[str.substring(1).length()];	// 문자열을 문자단위 배열로 분리 저장
			
			for(int i = 1; i < str.length(); i++) {
				ch[i-1] = str.charAt(i);
			}
			
			for(int i = 0; i < ch.length; i++) {
				for(int j = 0; j < R; j++) {
					System.out.print(ch[i]);
				}
			}
			System.out.println("");
		}
		
		sc.close();
	}

}

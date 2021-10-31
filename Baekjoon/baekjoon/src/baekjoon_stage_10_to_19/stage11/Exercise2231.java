package baekjoon_stage_10_to_19.stage11;

import java.util.Scanner;

public class Exercise2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(findNum(N));
		sc.close();
	}
	
	public static int findNum(int N) {
		int num = 0;
		int temp = 0;
		
		for(int i = 1; i < N; i++) {
			temp = i;
			num = temp;
			while(temp != 0) {
				num += temp%10;
				temp /= 10;
			}
			if(num == N) {
				return i;
			}
		}
		
		return 0;
		
	}
}

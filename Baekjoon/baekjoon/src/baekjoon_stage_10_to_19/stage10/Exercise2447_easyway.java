package baekjoon_stage_10_to_19.stage10;

import java.util.Scanner;

// 별찍기 - 반복문 이용 풀이
public class Exercise2447_easyway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(star(i, j)) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
	
	public static boolean star(int i, int j) {
		boolean run = true;
		while(run) {
			if(i%3 == 1 && j%3 == 1) {
				return true;
			}
			if(i == 0 || j == 0){
				return false;	
			}
			i /= 3;
			j /= 3;
		}
		return false;
	}

}

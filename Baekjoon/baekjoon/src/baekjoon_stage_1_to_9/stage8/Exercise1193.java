package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

public class Exercise1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int sum = 0;
		int num = 0;
		
		// 1 3 6 10 15..
		// n = 1 ~
		// 1 + (n-1)
		for(int n = 1; n < X+1; n++) {
			sum += n;
			if(X <= sum) {
				num = n;
				break;
			}
		}
		if(num%2 == 0) {
			System.out.print(num-(sum-X) + "/");
			System.out.print(1+(sum-X));
			sc.close();
			return;
		}
		else {
			System.out.print(1+(sum-X) + "/");
			System.out.print(num-(sum-X));
			sc.close();
			return;
		}
		
	}

}

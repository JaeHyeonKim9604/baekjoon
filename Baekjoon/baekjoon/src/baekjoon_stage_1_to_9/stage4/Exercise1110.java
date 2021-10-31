package baekjoon_stage_1_to_9.stage4;

import java.util.Scanner;

public class Exercise1110 {
	// while문을 이용

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pnum = num;
		int a, b, c;
		int count = 0;
		
		do {
			a = (pnum < 10)?(0):(pnum/10);
			b = pnum%10;
			c = (a+b < 10)?(a+b):((a+b)%10);
			
			pnum = b*10 + c;
			
			count++;
			
		}while(pnum != num);
		
		System.out.println(count);
		
		sc.close();
	}

}

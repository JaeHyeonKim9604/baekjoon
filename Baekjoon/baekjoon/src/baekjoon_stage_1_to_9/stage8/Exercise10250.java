package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

public class Exercise10250 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ACM 호텔
		int T = sc.nextInt();
		int H, N; //W;	입력은 받지만 계산할때 필요없는 값
		int floor = 0;
		int number = 0;
		
		for(int i = 0; i < T; i++) {
			H = sc.nextInt();
			//W = sc.nextInt();
			N = sc.nextInt();
			floor = (N <= H)?N:(N%H==0)?H:N%H;
			number = (N <= H)?1:(N%H==0)?(N/H):((N/H)+1);

			if(number > 9) {
				System.out.println(floor+""+number);
			}
			else {
				System.out.println(floor+"0"+number);
			}
		}
		
		sc.close();
	}

}

package baekjoon_stage_1_to_9.stage4;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise10951 {
	// 예외처리 중 NoSuchElementException 이용
	// Runtime Exception 중 구성 요소가 없을 경우 발생하는 오류

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean run = true;
		
		try {
			while(run){
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+b);
			}
		}catch(NoSuchElementException e){
			
		}
		
		
		sc.close();
	}

}

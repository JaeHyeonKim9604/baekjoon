package baekjoon_stage_1_to_9.stage8;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise10757_easyway {

	public static void main(String[] args) {
		// 두개의 큰 수(<10^10000)를 입력받아 더하는 프로그램
		// nextBigInteger() 이용
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		System.out.println(A.add(B));
		
		sc.close();
	}

}

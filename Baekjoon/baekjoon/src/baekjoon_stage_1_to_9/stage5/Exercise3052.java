package baekjoon_stage_1_to_9.stage5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3052 {

	public static void main(String[] args) {
		// 10개의 수를 입력받아 각각의 수를 42로 나눈 나머지를 각각 구하고
				// 각기 다른 나머지의 총 개수를 구하는 프로그램
			Scanner sc = new Scanner(System.in);
			final int N = 10;
			int[] number = new int[N];
			
			for(int i = 0; i < N; i++) {
				number[i] = sc.nextInt()%42;
			}
				
			Arrays.sort(number);
			
			System.out.println(Exercise3052.remove_Duplicate_Elements(number, N));
			
			sc.close();
	}
	
	public static int remove_Duplicate_Elements(int[] arr, int length) {
		int l = length;
		
		if(l == 0 || l == 1) {
			return l;
		}
		
		int[] temp = new int[l];
		temp[0] = arr[0];
		int j = 1;
		for(int i = 0; i < l-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j] = arr[i+1];
				j++;
			}
			
		}
		l = j;
		return l;
	}

}

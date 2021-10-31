package baekjoon_stage_1_to_9.stage5;

import java.util.Scanner;

public class Exercise2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int result;
		String sresult;
		int[] cnt = new int[10];
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// 입력받은 수의 곱을 result에 저장
		result = a*b*c;
		// result를 sresult에 문자열로 저장
		sresult = result + "";
		
		// 각 자릿수를 담을 Int형 배열 arr을 sresult의 길이만큼의 크기로 선언
		int[] arr = new int[sresult.length()];
		
		// sresult의 각 문자를 순서대로 배열 arr에 넣음
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sresult.charAt(i) - '0';
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < 10; j++) {
				if(arr[i] == j) {
					cnt[j]++;
				}
			}
		}
		
		for(int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
		
		sc.close();
	}

}

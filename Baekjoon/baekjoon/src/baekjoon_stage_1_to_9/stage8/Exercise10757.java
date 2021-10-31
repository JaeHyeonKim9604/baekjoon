package baekjoon_stage_1_to_9.stage8;

import java.util.Scanner;

public class Exercise10757 {

	public static void main(String[] args) {
		// 두개의 큰 수(<10^10000)를 입력받아 더하는 프로그램
		// 두 수를 문자열로 입력받은 후 배열로 저장해 각각 더한값을 출력
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		// 두 수를 하나의 문자열로 입력
		
		String[] number = str.split(" ");	// " "를 사이에 두고 나눔
		
		String num1 = (number[0].length()>number[1].length())?number[0]:number[1];	// 긴 숫자
		String num2 = (number[0].length()<=number[1].length())?number[0]:number[1];	// 짧은숫자
		
		int[] arr1 = new int[num1.length()];	// num1
		int[] arr2 = new int[num1.length()];	// num2, 배열 길이는 긴 쪽과 같게
		
		// 각 배열에 각 숫자 저장
		for(int i = 0; i < num1.length(); i++) {
			arr1[i] = Integer.parseInt(num1.charAt(i)+"");
		}
		// 마지막 index로 붙여서 저장
		for(int i = num1.length() - num2.length(); i < num1.length(); i++) {
			arr2[i] = Integer.parseInt(num2.charAt(i - (num1.length() - num2.length()))+"");
		}
		
		// 결과를 저장할 배열 result
		int[] result = new int[arr1.length];
		
		// 마지막 index ~ 0번
		for(int i = result.length - 1; i >= 0; i--) {
			if(i != 0) {
				// 합이 10 이상일 경우를 위해 이전 항목에 몫을 전달
				result[i-1] += (result[i] + arr1[i] + arr2[i])/10;
				result[i] = (result[i] + arr1[i] + arr2[i])%10;
			}
			// 마지막 값(마지막 자릿수)은 더한 값을 그대로 저장
			else {
				result[i] = result[i] + arr1[i] + arr2[i];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]);	
		}
		
		sc.close();
	}

}

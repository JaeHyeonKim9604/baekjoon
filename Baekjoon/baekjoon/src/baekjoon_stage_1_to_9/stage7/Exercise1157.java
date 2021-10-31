package baekjoon_stage_1_to_9.stage7;

import java.util.*;

public class Exercise1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		char[] chWord;
		int[] alphNum;
		int TF = 0;
		
		word = sc.nextLine();				// 문자열 입력
		chWord = word.toCharArray();		// 문자열 -> 문자 배열
		Exercise1157.smallToBig(chWord);			// 소문자 -> 대문자
		Arrays.sort(chWord);				// 알파벳 순으로 정렬
		
		if(chWord.length == 1) {			// 문자 1개만 입력시 실행
			System.out.println(chWord[0]);
			sc.close();
			return;
		}
		
		alphNum = Exercise1157.alphNum(chWord);		// 문자순서를 인덱스로하는 배열
		TF = Exercise1157.maxNumIndex(alphNum);
		if(TF < 0) {
			System.out.println("?");
			sc.close();
			return;
		}
		
		System.out.println((char)(TF+65));
		
		
		sc.close();
	}
	
	// 소문자 -> 대문자
	public static char[] smallToBig(char[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 'Z') {
				array[i] = (char)(array[i] - ' ');
			}
		}
		return array;
	}
	
	// 문자 배열 -> 각 알파벳 개수 배열(index 0 ~ 25 = value 'A' ~ 'Z')
	public static int[] alphNum(char[] array) {
		int[] count = new int[26];
		Arrays.fill(count, 0);
		for(int i = 0; i < array.length; i++) {
			for(char a = 'A'; a <= 'Z'; a++) {
				if(array[i] == a) {			// array[i]에 문자 a가 있으면
					count[(int)(a)-65]++;	// (a-65)번째 count에 1 추가
					break;					// 다음 문자 배열 항목으로 이동
				}
			}
		}
		return count;
	}
	
	// 정수 배열 중 가장 큰 값의 index 찾기
	public static int maxNumIndex(int[] array) {
		int index = -1;
		int maxNum = 0;
		int countMaxNum = 0;
		int[] tempArr = new int[array.length];		// 깊은 복사..
		for(int i = 0; i < tempArr.length; i++) {
			tempArr[i] = array[i];
		}
		Arrays.sort(tempArr);
		maxNum = tempArr[tempArr.length-1];		// 최대값 = 정렬 후 맨 뒤의 수
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == maxNum) {
				index = i;
				countMaxNum++;
			}
		}
		
		if(countMaxNum > 1) {
			return -1;
		}
		
		return index;
	}
}

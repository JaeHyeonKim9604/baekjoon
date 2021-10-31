package baekjoon_stage_1_to_9.stage7;

import java.util.Scanner;

public class Exercise10809 {

	public static void main(String[] args) {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
				// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
				// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램
				Scanner sc = new Scanner(System.in);
				// 단어 입력
				String word = sc.nextLine();
				// 단어를 문자 단위로 분리하기 위한 배열 ch
				char[] ch = new char[word.length()];
				// 알파벳수 만큼의 크기를 갖는 배열 alph
				int[] alph = new int[26];
				// 알파벳 출현 위치를 계산하기 위한 cnt, 미포함된 경우 -1이므로 -1로 초기화
				int cnt = -1;
				
				
				// 단어 분리
				for(int i = 0; i < word.length(); i++) {
					ch[i] = word.charAt(i);
				}
				
				// 배열alph의 모든 항목에 -1 저장
				for(int i = 0; i < 26; i++) {
					alph[i] = -1;
				}
				
				// 실행
				for(int i = 0; i < ch.length; i++) {	// ch[i]
					for(int j = 0; j < 26; j++) {		// 알파벳
						int a = 97;						// 'a'의 아스키코드 97
						if((int)ch[i] == a+j) {			// ch[i]의 아스키코드 확인
							cnt++;
							if(alph[j] == -1) {			// 처음 위치인지 여부 확인
								alph[j] = cnt;	
							}
							break;						// 위치 확인 되면 다음 단어 확인
						}
					}
				}
				
				// 출력
				for(int i = 0; i < 26; i++) {
					System.out.println(alph[i]);
				}
				
				
				sc.close();
	}

}

package baekjoon_stage_10_to_19.stage11;

import java.util.Scanner;

// 666에 미친 숌
// 666이 포함된 숫자중 N번째로 작은 수 출력
public class Exercise1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		System.out.println(jongMal(N));
		
		sc.close();
	}
	public static int jongMal(int N) {
		final int jongmal = 666;
		if(N == 1) return jongmal;		// 1번째 수는 666
		
		String temp = "";	// 숫자 조합을 문자열로 변경시 사용
		String jnum = "";	// 숫자의 자릿수를 빠르게 구하기 위해(.length())사용
		int jm = 666;		// N번째 사탄의 수가 들어갈 변수 
		int cnt = 0;		// 001 처럼 숫자보다 차지하는 자릿수가 클때 그 크기를 계산하는 변수
		int n = 1;			// N번째 jm을 출력하기 위해 N이 되면 return하기 위해 증가시키는 변수
		
		/*
		 * "i" + "666" + "j" 의 형태로 숫자를 표현
		 * i에 666과 맞닿은 연속된 6이 있다면
		 * i를 6이 아닌 자릿수 까지 10으로 나눈 후 연결해주고 j를 증가시킴
		 * // 예) 5666 -> 6660 -> 6661 -> 6662...
		 * // 예) 65666 -> 66600 -> 66601 -> 66602...
		 * // 예) 15666 -> 16660 -> 16661 -> 16662...
		 */
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < N; j++) {
				temp = (i / (int)Math.pow(10, six(i)))+""+jongmal+"";
				
				// six(i) != 0 이면 i의 연속된 6의 갯수에 따라 j값의 증가가 필요함
				if(six(i) != 0) {
					jnum = ""+j;
					if(six(i) > 1 && j < (int)Math.pow(10, six(i)-1)) {
						jnum = ""+j;
						cnt = six(i)-1-(jnum.length()-1);
						jnum = "";
						while(cnt != 0) {
							temp += "0";
							jnum += "0";
							cnt--;
						}
						jnum += j;
					}
					jm = Integer.parseInt(temp+j);
					n++;
					if(n == N) return jm;
					String t = (j+1)+"";
					
					// j+1의 숫자의 길이가 j가 차지해야하는 자릿수의 길이보다 커지면 중단
					// 예) 66699 일때, 66699 다음이 666100이 아닌 67666 이므로 i 값 증가를 위해 j 증가 for문을 탈출해야함
					if(jnum.length() < t.length()) {
						break;
					}
				}
				
				// six(i) == 0 이면 i값만 증가
				else {
					jm = Integer.parseInt(temp);
					n++;
					if(n == N) return jm;
					break;
				}
			}
		}
		return jm;
	}
	
	// i의 1의자리부터 연속된 6의 갯수 return
	// 예) 6 -> 1, 16 -> 1, 66 -> 2, 7 -> 0, 606 -> 1
	// i = 6660 이상은 염두하지 않음
	public static int six(int i) {
		int num = 0;
		while(i != 0) {
			if(i % 10 == 6) {
				num++;
				i /= 10;
			}
			else {
				break;
			}
		}
		return num;
	}
}

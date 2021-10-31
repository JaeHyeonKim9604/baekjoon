package baekjoon_stage_1_to_9.stage8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise2869 {

	public static void main(String[] args) throws IOException {
		// 달팽이 문제
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int cnt = (V-B)/(A-B);
		if((V-B)%(A-B) != 0) {
			cnt++;
		}
		System.out.println(cnt);
	}

}

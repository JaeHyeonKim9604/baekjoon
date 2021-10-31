package baekjoon_stage_1_to_9.stage3;

import java.io.BufferedReader;			// 입력
import java.io.BufferedWriter;			// 출력
import java.io.InputStreamReader;		// 입력
import java.io.OutputStreamWriter;		// 출력
import java.io.IOException;				// 예외처리
import java.util.StringTokenizer;		// 공백으로 구분

public class Exercise15552 {
	// 빠른 A+B
	// 입출력을 System.out.println 과 Scanner로 받지 않고
	// BufferdReader 와 BufferedWriter로 받아
	// 빠른 속도로 많은 양의 데이터를 입출력 할 수 있음

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(bf.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(bf.readLine());
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
		}
		
		bw.flush();
		bw.close();
	}
	
}
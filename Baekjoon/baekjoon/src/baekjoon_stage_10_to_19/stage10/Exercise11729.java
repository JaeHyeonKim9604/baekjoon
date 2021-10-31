package baekjoon_stage_10_to_19.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 하노이탑
// n개의 원판을 옮길 때 옮긴 횟수와 순서(최소이동)를 출력
public class Exercise11729 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		bw.write((int) (Math.pow(2, N)-1)+"\n");
		hanoi(N, 1, 2, 3);
		
		bw.flush();
		bw.close();

	}
	
	public static void hanoi(int n, int from, int mid, int to) throws IOException {
		if(n <= 1) {
			bw.write(from+" "+to+"\n");
		}
		else {
			hanoi(n-1, from, to, mid);
			bw.write(from+" "+to+"\n");
			hanoi(n-1, mid, from, to);
		}
	}

}

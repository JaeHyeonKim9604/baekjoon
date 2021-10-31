package baekjoon_stage_10_to_19.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 별찍기 - 재귀적 풀이
public class Exercise2447 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				bw.write(star2(i, j));
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
	
	public static String star2(int i, int j) {
		if(i * j <= j*j || i * j <= i*i) {
			if(i%3 == 1 && j%3 == 1) {
				return " ";
			}
			if(i == 0 || j == 0){
				return "*";	
			}
		}
		
		return star2(i/3, j/3);
	}
	

}

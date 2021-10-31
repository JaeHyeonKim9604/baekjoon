package baekjoon_stage_1_to_9.stage7;

import java.util.Scanner;

public class Exercise2941 {

	public static void main(String[] args) {
		// 입력된 문자열을 크로아티아 문자로 몇개인지 세는 프로그램
		// 아래 문자열 배열 cro의 항목은 크로아티아의 특수한 알파벳이며 이외에는 기존 알파벳과 같음
		Scanner sc = new Scanner(System.in);
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int what = 0;
		boolean space;
		int count = 0; 					// 전체 문자열에서 cro와 일치하는 항목의 수
		String str = sc.nextLine();		// 임의의 문자열 입력(a~z, =, -)
		char[] ch = str.toCharArray();	// char형 배열로 전환
		
		// 문자열에서 'j' 또는 '-'또는 '=' 가 오면 앞의 문자를 확인.
		for(int i = 0; i < ch.length; i++) {
			// 'j'와 '-'가 오면 1, '='가 오면 2를 저장
			what = (ch[i] == 'j' || ch[i] == '-')?1:(ch[i] == '=')?2:0;	// j-= 유무
			space = (what!=0 && i > 0)?true:false;							// 앞 공간 유무
			if(space) {
				if(what == 2 && i > 1) {	// '='에 index 크기가 최소 3일때
					if((ch[i-2]+""+ch[i-1]+""+ch[i]).equals("dz=")){
						count += 2;		// 문자 3개가 1개로 치환되므로 2로 count
					}
					else {	// '='이 뒤에오면서 'dz='이 아닐때
						for(int c = 0; c < cro.length; c++) {
							if((ch[i-1]+""+ch[i]).equals(cro[c])) {
								count ++;
							}
						}
					}
				}
				else {	// 'j', '-', '='이 뒤에오면서 index 크기가 최소 2일때
					for(int c = 0; c < cro.length; c++) {
						if((ch[i-1]+""+ch[i]).equals(cro[c])) {
							count++;
						}
					}
				}
			}
		}
		
		System.out.println(str.length() - count);		// 전체문자열 길이 - 특수문자열 갯수 = 크로아티아 문자 수
		sc.close();
	}

}

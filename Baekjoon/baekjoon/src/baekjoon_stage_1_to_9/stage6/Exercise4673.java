package baekjoon_stage_1_to_9.stage6;

public class Exercise4673 {

	public static void main(String[] args) {
		int cnt = 0;
		int[] num = new int[9999];
		int[] numm = new int[9999];
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
			if(Exercise4673.findSelfNum(num[i])) {
				numm[cnt] = i+1;
				cnt++;
			}

		}
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(numm[i]);
		}
		
	}
	
	// 어떤 수의 생성자 존재 유무 판단
		public static boolean findSelfNum(int n) {
			int[] temp = new int[n];
			boolean YN = false;
			
			// 배열 temp에 1부터 n까지 저장
			for(int i = 0; i < n; i++) {
				temp[i] = i+1;
			}
			
			// 
			for(int i = 0; i < n; i++) {
				if(n == temp[i] + Exercise4673.selfsum(temp[i])) {
					YN = false;
					break;
				}
				else {
					YN = true;
				}
			}
			return YN;
		}
		
		// 각 자릿수의 합을 반환하는 함수
		public static int selfsum(int a) {
			String aa;
			int[] x;
			int sum = 0;
			
			// 각 자리 숫자 추출
			aa = a + "";	// 문자열로 변환
			x = new int[aa.length()];
			for(int i = 0; i < aa.length(); i++) {
				x[i] = aa.charAt(i) - '0';		// 배열에 숫자로 저장
				sum += x[i];					// sum에 더함
			}
			
			return sum;
		}

}

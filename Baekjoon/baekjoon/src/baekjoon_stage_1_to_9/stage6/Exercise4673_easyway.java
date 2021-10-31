package baekjoon_stage_1_to_9.stage6;

public class Exercise4673_easyway {

	public static void main(String[] args) {
		// selfNumber이거나, 아니거나 이므로 boolean형 배열 생성
		boolean[] YN = new boolean[10045];

		// 임의의 수로 '생성'될 수 있는 수는 selfNumber가 될 수 없으므로
		// '0~9999 까지의 자연수'로 '생성될 수 있는 수'를 index로 하는 배열의 요소값만을 true로 변경
		for(int i = 0; i < 10000; i++) {
			int idx = Exercise4673_easyway.self(i);
			YN[idx] = true;
		}
		
		// 요솟값이 false인 요소, 즉 '0~9999'로부터 '생성될 수 있는 수'를 제외한 수를 출력
		for(int i = 0; i < 10000; i++) {
			if(!YN[i]) {
				System.out.println(i);
			}
		}

	}
	
	// 생성자 n에대한 d(n)
	public static int self(int n) {
		int sum = n;
		while(n != 0) {
			sum += n%10;	// sum에 1의자릿수, 10의자릿수... 가 더해진다.
			n /= 10;		// 더한 후 10으로 나눠 자릿수를 줄인다.
		}
		return sum;
	}

}

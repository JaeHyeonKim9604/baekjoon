package mainformain;

public class TestForAll {

	public static void main(String[] args) {
		String temp = "1230";
		int j = 9;
		System.out.println(Integer.parseInt(temp+(j+1)));		// 12310
		System.out.println(Integer.parseInt(temp+j)+1);			// 1240
	}
}
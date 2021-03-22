package chapter3;

public class Ex15 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			int su = i%2;
			if(su == 0) sum = sum + i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i2 = 2; i2 <= 10; i2 = i2 + 2) {
			sum2 = sum2 + i2;
		}
	}
}

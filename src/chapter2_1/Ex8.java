package chapter2_1;

import java.util.Arrays;

public class Ex8 {
	public static void main(String[] args) {
		double[] avgArr = new double[4];
		avgArr[0] = 67;
		avgArr[1] = 81.3;
		avgArr[2] = 54.67;
		avgArr[3] = 64.67;
		
		System.out.println(Arrays.toString(avgArr));
		
//		avgArr[1] = 67;
//		avgArr[2] = 81.3;
//		avgArr[3] = 54.67;
//		avgArr[0] = 78.99;
		avgArr[3] = avgArr[2];
		avgArr[2] = avgArr[1];
		avgArr[1] = avgArr[0];
		avgArr[0] = 78.99;
		
		System.out.println(Arrays.toString(avgArr));
	}
}

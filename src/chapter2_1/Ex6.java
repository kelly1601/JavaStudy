package chapter2_1;

import java.util.Arrays;

public class Ex6 {
	public static void main(String[] args) {
		int[] korArr = new int[4];
		korArr[0] = 84;
		korArr[1] = 93;
		korArr[2] = 52;
		korArr[3] = 42;
		
		double[] avgArr = new double[4];
		avgArr[0] = 67;
		avgArr[1] = 81.3;
		avgArr[2] = 54.67;
		avgArr[3] = 64.67;
		
		char[] gradeArr = new char[4];
		gradeArr[0] = 'B';
		gradeArr[1] = 'A';
		gradeArr[2] = 'C';
		gradeArr[3] = 'B';
		
		System.out.println(Arrays.toString(gradeArr)); //배열 확인
	}

}

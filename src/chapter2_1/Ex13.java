package chapter2_1;

public class Ex13 {
	public static void main(String[] args) {
		char[][] arr1 = new char[3][3];
		double[][] arr2 = new double[1][4];
		
		int[][] scores = {
				{84, 93, 52, 42}, 
				{62, 71, 79, 100}, 
				{55, 80, 33, 52}
			};
		int[][] pScores = {
				{84, 62, 55},
				{93, 71, 80},
				{52, 79, 33},
				{42, 100, 52}
			};
		System.out.println(pScores[0][0]);
		System.out.println(pScores[0][1]);
		System.out.println(pScores[0][2]);
		
		int kor1 =  pScores[0][0];
		
		int[] student1 = pScores[0];
		System.out.println(student1[0]);
		System.out.println(student1[1]);
		System.out.println(student1[2]);
		
		int[][] studentInfo = new int[3][];
		studentInfo[0] = new int[3]; //studentInfo 첫 번째 줄에는 세 개의 데이터 자리
		studentInfo[1] = new int[5]; //studentInfo 두 번째 줄에는 다섯 개의 데이터 자리
		studentInfo[2] = new int[1]; //studentInfo 세 번째 줄에는 한 개의 데이터 자리

	}
}

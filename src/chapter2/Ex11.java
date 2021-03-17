package chapter2;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		double sight;
		
		System.out.println("시력: ");
		sight = scanf.nextDouble();
//		if (sight > 2.0 || sight < 0.0) {
//			System.out.println("범위에 맞지 않습니다. 다시 입력해 주세요: ");
//			sight = scanf.nextDouble();
//			System.out.println("시력: " + sight);
//		}
//		else {
//			System.out.println("시력: " + sight);
		System.out.println(sight >= 0.0 && sight <= 2.0);
		System.out.println(sight >= 0.0 || sight <= 2.0);
	}
}

package chapter2;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		boolean button = true;
		
		String status = button ? "불이 켜졌습니다." : "불이 꺼졌습니다.";
		
		System.out.println(status);
		
		
		System.out.println("국어 점수를 입력해 주세요: ");
		double kor;
		Scanner scanf = new Scanner(System.in);
		kor = scanf.nextDouble();
		
		boolean grade = (kor >= 0 && kor <= 100);
		String status2 = grade ? "올바른 점수입니다." : "점수가 잘못되었습니다.";
		System.out.println(status2);
		
		boolean pnp = (kor >= 50);
		String status3 = pnp ? "Pass" : "Non pass";
		System.out.println(status3);
	}
}

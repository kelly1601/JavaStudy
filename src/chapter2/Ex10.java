package chapter2;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		//Scanner package: 입력을 위한 여러 가지 기능을 가지고 있음
		int kor;
		Scanner scanf = new Scanner(System.in);
		//객체가 제공하는 기능 -> 메서드
		//nextInt 메서드: 입력한 값을 정수로 가져오는 기능
		System.out.print("국어 점수를 입력하세요: ");
		kor = scanf.nextInt();
		if (kor > 100 || kor <0) {
			System.out.println("다시 입력해 주세요: ");
			kor = scanf.nextInt();
			System.out.println(kor);
		}
		else {
			System.out.println(kor);
		}
	}

}

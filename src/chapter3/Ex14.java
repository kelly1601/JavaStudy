package chapter3;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		//초기식 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		//실행 순서: 초기식 -> 조건식 -> 증감식 -> 조건식 -> 증감식 -> ...
		
		int i;
		int sum = 0;
		int max;
		Scanner sca = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
		max = sca.nextInt();
		
		for (i = 1; i <= max; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 " + max + "까지의 합: " + sum);
	}
}

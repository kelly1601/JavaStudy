package chapter3;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String a = "+";
		System.out.println("b를 입력하세요: ");
		//next 메서드: 사용자가 입력한 값을 문자열로 가져옴
		String b = sca.next();
		
		if (a == b) {
			System.out.println("a와 b가 같습니다.");
		}
		else {
			System.out.println("a와 b가 다릅니다.");
		}
	}
}

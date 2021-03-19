package chapter3;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a;
		int b;
		String c;
		System.out.print("첫 번째 숫자를 입력하세요: ");
		a = sca.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		b = sca.nextInt();
		System.out.print("연산자를 입력하세요: ");
		c = sca.next();
		
		if (c == "/") System.out.printf(a + c + b + " = " + (double)(a/b));
		else if (c == "+") System.out.println(a + c + b + " = " + (a+b));
		else if (c == "-") System.out.println(a + c + b + " = " + (a-b));
		else if (c == "*") System.out.println(a + c + b + " = " + (a*b));
		else System.out.println("잘못된 연산자입니다.");
		
	}
}

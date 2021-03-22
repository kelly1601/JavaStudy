package chapter3;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		int num1 = sca.nextInt();
		
		System.out.print("두 번째 수: ");
		int num2 = sca.nextInt();
		
		System.out.print("연산자: ");
		String operator = sca.next();
		
		switch(operator) {
		case "*":
			System.out.println(num1 + "*" + num2 + "+" + (num1*num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "+" + ((float)num1/num2));
			break;
		case "+":
			System.out.println(num1 + "+" + num2 + "+" + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "+" + (num1-num2));
			break;
		default:
			System.out.println("사칙연산만 입력하실 수 있습니다.");
		}
	}
}

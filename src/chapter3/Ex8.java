package chapter3;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		int num1 = sca.nextInt();
		
		System.out.print("�� ��° ��: ");
		int num2 = sca.nextInt();
		
		System.out.print("������: ");
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
			System.out.println("��Ģ���길 �Է��Ͻ� �� �ֽ��ϴ�.");
		}
	}
}

package chapter3;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a;
		int b;
		String c;
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		a = sca.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		b = sca.nextInt();
		System.out.print("�����ڸ� �Է��ϼ���: ");
		c = sca.next();
		
		if (c == "/") System.out.printf(a + c + b + " = " + (double)(a/b));
		else if (c == "+") System.out.println(a + c + b + " = " + (a+b));
		else if (c == "-") System.out.println(a + c + b + " = " + (a-b));
		else if (c == "*") System.out.println(a + c + b + " = " + (a*b));
		else System.out.println("�߸��� �������Դϴ�.");
		
	}
}

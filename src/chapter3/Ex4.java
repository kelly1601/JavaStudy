package chapter3;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String a = "+";
		System.out.println("b�� �Է��ϼ���: ");
		//next �޼���: ����ڰ� �Է��� ���� ���ڿ��� ������
		String b = sca.next();
		
		if (a == b) {
			System.out.println("a�� b�� �����ϴ�.");
		}
		else {
			System.out.println("a�� b�� �ٸ��ϴ�.");
		}
	}
}

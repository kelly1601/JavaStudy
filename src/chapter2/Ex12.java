package chapter2;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		boolean button = true;
		
		String status = button ? "���� �������ϴ�." : "���� �������ϴ�.";
		
		System.out.println(status);
		
		
		System.out.println("���� ������ �Է��� �ּ���: ");
		double kor;
		Scanner scanf = new Scanner(System.in);
		kor = scanf.nextDouble();
		
		boolean grade = (kor >= 0 && kor <= 100);
		String status2 = grade ? "�ùٸ� �����Դϴ�." : "������ �߸��Ǿ����ϴ�.";
		System.out.println(status2);
		
		boolean pnp = (kor >= 50);
		String status3 = pnp ? "Pass" : "Non pass";
		System.out.println(status3);
	}
}

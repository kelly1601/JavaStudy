package chapter2;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		//Scanner package: �Է��� ���� ���� ���� ����� ������ ����
		int kor;
		Scanner scanf = new Scanner(System.in);
		//��ü�� �����ϴ� ��� -> �޼���
		//nextInt �޼���: �Է��� ���� ������ �������� ���
		System.out.print("���� ������ �Է��ϼ���: ");
		kor = scanf.nextInt();
		if (kor > 100 || kor <0) {
			System.out.println("�ٽ� �Է��� �ּ���: ");
			kor = scanf.nextInt();
			System.out.println(kor);
		}
		else {
			System.out.println(kor);
		}
	}

}

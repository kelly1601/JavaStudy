package chapter3;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		//�ʱ�� �ڸ��� ������ ������ for�������� ����� �� �ִ�.
		//���� ����: �ʱ�� -> ���ǽ� -> ������ -> ���ǽ� -> ������ -> ...
		
		int i;
		int sum = 0;
		int max;
		Scanner sca = new Scanner(System.in);
		System.out.print("���ڸ� �Է��� �ּ���: ");
		max = sca.nextInt();
		
		for (i = 1; i <= max; i++) {
			sum = sum + i;
		}
		System.out.println("1���� " + max + "������ ��: " + sum);
	}
}

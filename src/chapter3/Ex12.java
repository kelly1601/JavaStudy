package chapter3;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		//while���� �ַ� ���� �ݺ���(���� ��Ȯ���� ����)�� ����
		
		Scanner sca = new Scanner(System.in);
		
		//������ ��� �ٽ� ��� ����
		char repeat;
		
		while(true) {
			System.out.println("������ ����մϴ�.");
			System.out.println("1�� Ʈ�� ���");
			System.out.println("2�� Ʈ�� ���");
			System.out.println("3�� Ʈ�� ���");
			System.out.println("4�� Ʈ�� ���");
			System.out.println("5�� Ʈ�� ���");
			System.out.println("6�� Ʈ�� ���");
			System.out.println("7�� Ʈ�� ���");
			System.out.println("8�� Ʈ�� ���");
			System.out.println("9�� Ʈ�� ���");
			System.out.println("10�� Ʈ�� ���");
			
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			
			if(repeat != 'y') {
				break;
			}
		}
	}
}

package chapter3;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("�ڸ��� IT ���Ǳ�");
		System.out.println("1. �ݶ�");
		System.out.println("2. ȯŸ");
		System.out.println("3. ���̴�");
		System.out.println("4. ����ƾ��");
		System.out.print("���Ǳ��� ��ư�� ���缼��: ");
		
		int button = sca.nextInt();
		
		switch(button) {
		case 1:
		case 2:
		case 3: System.out.println("�ݶ�"); break;
		case 4: System.out.println("ȯŸ"); break;
		case 5:
		case 6: System.out.println("���̴�"); break;
		case 7: System.out.println("����ƾ��"); break;
		default: System.out.println("1 ~ 4���� ���� �� �ֽ��ϴ�.");
		}
		
	}
}

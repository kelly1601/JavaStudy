package chapter3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int num;
		Scanner sca = new Scanner(System.in);
		System.out.print("0~100 ������ ���ڸ� �Է��ϼ���");
		num = sca.nextInt();
		
		if (num >= 50) {
			System.out.println("50 �̻��� ���� ��� �ֽ��ϴ�.");
		}
		else {
			System.out.println("50 �̸��� ���� ��� �ֽ��ϴ�.");
		}
		
		
		double height;
		System.out.print("Ű�� �Է��ϼ���.");
		height = sca.nextDouble();
		
		if (height >= 150) {
			System.out.println("ž�� ����");
		}
		else {
			System.out.println("ž�� �Ұ�");
		}
		
		
		int numb = 1;
		
		if (numb == 1) {
			System.out.println("1�Դϴ�.");
		}
		else if (numb == 2) {
			System.out.println("2�Դϴ�.");
		}
		else if (numb == 3) {
			System.out.println("3�Դϴ�.");
		}
		else if (numb == 4) {
			System.out.println("4�Դϴ�.");
		}
		
		
		int age;
		System.out.print("���̸� �Է��ϼ���");
		age = sca.nextInt();
		
		if (age <= 7) {
			System.out.println("������ �Ƶ��Դϴ�.");
		}
		else if (age > 7 && age <= 13) {
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if (age > 13 && age <= 16) {
			System.out.println("���л��Դϴ�.");
		}
		else if (age > 16 && age <= 19) {
			System.out.println("����л��Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
		
		
		int dayOfMonth;
		System.out.print("2021�� 3���� ��¥: ");
		dayOfMonth = sca.nextInt();
		
		System.out.println("2021�� 3�� " + dayOfMonth + "���� ");
		if ((dayOfMonth % 7) == 1) {
			System.out.println("�������Դϴ�.");
		}
		else if ((dayOfMonth % 7) == 2) {
			System.out.println("ȭ�����Դϴ�.");
		}
		else if ((dayOfMonth % 7) == 3) {
			System.out.println("�������Դϴ�.");
		}
		else if ((dayOfMonth % 7) == 4) {
			System.out.println("������Դϴ�.");
		}
		else if ((dayOfMonth % 7) == 5) {
			System.out.println("�ݿ����Դϴ�.");
		}
		else if ((dayOfMonth % 7) == 6) {
			System.out.println("������Դϴ�.");
		}
		else {
			System.out.println("�Ͽ����Դϴ�.");
		}
		
		
		int num2;
		int num3;
		System.out.print("ù ��° ���ڸ� �Է��ϼ���");
		num2 = sca.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���");
		num3 = sca.nextInt();
		
		if (num2 > num3) System.out.println(num2);
		else if (num3 > num2) System.out.println(num3);
		else System.out.println("�� ���� ���� �����ϴ�.");
		
		
		double score;
		System.out.println("������ �Է��ϼ���: ");
		score = sca.nextDouble();
		
		if (score <= 100 && score >= 90) System.out.println("A");
		else if (score < 90 && score >= 80) System.out.println("B");
		else if (score < 80 && score >= 70) System.out.println("C");
		else if (score < 70 && score >= 60) System.out.println("D");
		else if (score < 60 && score >= 0) System.out.println("F");
		else System.out.println("�߸��� ���Դϴ�.");
	}
}

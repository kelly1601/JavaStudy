package chapter3;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		char repeat;
		while(true) {
			System.out.println("1�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("2�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("3�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("4�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("5�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("6�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("7�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("8�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("9�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			System.out.println("10�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				continue; //�ݺ����� ó������ �ö�
			}
			if(repeat != 'y') {
				break;
			}
			
		} //while end
		
		//�� �ڵ� �ܼ�ȭ
		int number = 1;
		while(number <= 10) {
			System.out.println(number + "�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//�ٽ� ó������ ���
				number = 1;
				continue; //�ݺ����� ó������ �ö�
			}
			number++;
		}
	}
}

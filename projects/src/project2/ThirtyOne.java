package project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirtyOne {
	public static void main(String[] args) {
		//����ڿ� ��ǻ�Ͱ� ���� ���ڸ� �θ���.
		//���ڴ� �� ���� �ּ� 1������ �ִ� 3������ �θ� �� �ִ�.
		//1���� �����ؼ� 1�� ������Ű�鼭 �ҷ��� �Ѵ�.
		//31�� �θ��� �Ǹ� ���ӿ��� ����.
		
		//1. ���� ���� ���� ����
		//2. ���� �ϴ� ���� ���ڸ� �θ���.
		//3. ���ڴ� �� ���� �Է��ؾ� �Ѵ�.
		
		Scanner sca = new Scanner(System.in);
		Random random = new Random();
		
		boolean turn = true;
		
		while(true) {
			System.out.println("���� ���� �ұ��?\n 1. �����\n 2. ��ǻ��");
			int a = sca.nextInt();
			if (a == 1) {
				//����ڰ� ����
				System.out.println("����ڰ� ���� �����մϴ�.");
				break;
			}
			else if (a == 2) {
				//��ǻ�Ͱ� ����
				System.out.println("��ǻ�Ͱ� ���� �����մϴ�.");
				turn = false;
				break;
			}
			else {
				System.out.println("�������� 1, 2���Դϴ�.");
			}
		}
		
		System.out.println("== Game Start ==");
		
		while(true) {
			if(turn) {
				//����� ����
				System.out.println("������� �����Դϴ�.");
				System.out.println("�ִ� 3���� ���ڸ� ���� ������ �ΰ� �Է��� �ּ���");
				
				String user = sca.nextLine();
				String[] users = user.split(" ");
				
				System.out.println("user = " + Arrays.toString(users));
				
				if(users.length == 0 || user.length() > 3) {
					System.out.println("���ڴ� ��� �ϳ� �̻�, �ִ� 3�������� ���� �� �ֽ��ϴ�.");
				} else {
					break;
				}
			}
			else {
				//��ǻ�� ����
			}
			
			turn =! turn;
		}
		
	}
}

package project1;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		//��ǻ�Ͱ� 1~100 ������ �� �� �ϳ��� ���� �����Ѵ�.
		//����ڴ� ��ǻ�Ͱ� ������ ���� ������ �Ѵ�.
		//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ ������ ũ�ٸ�
		//��ǻ�ʹ� ���� ���ڸ� �Է��� �ּ���!��� ����ϰ�
		//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ ������ �۴ٸ�
		//��ǻ�ʹ� ū ���ڸ� �Է��� �ּ���!��� ����ϼ���.
		Random random = new Random();
		Scanner sca = new Scanner(System.in);
		
		int answer = random.nextInt(100) + 1;
		int userAns;
		
		System.out.print("1 ~ 100 ������ ������ �Է��� �ּ���: ");
		userAns = sca.nextInt();
		
		for (int i = 1; i < 5; i++) {
			if (0 < (userAns - answer) && (userAns - answer) <= 5) {
				System.out.println("Down");
				System.out.println("������ �����Դϴ�");
				userAns = sca.nextInt();
			}
			else if (0 > (userAns - answer) && (userAns - answer) >= -5) {
				System.out.println("Up");
				System.out.println("������ �����Դϴ�");
				userAns = sca.nextInt();
			}
			else {
				if (userAns == answer) {
					System.out.println("�����Դϴ�!");
					break;
				}
				else if (userAns > answer) {
					System.out.println("Down");
					System.out.println("���� Ƚ��: " + (5-i));
					userAns = sca.nextInt();
				}
				else {
					System.out.println("Up");
					System.out.println("���� Ƚ��: " + (5-i));
					userAns = sca.nextInt();
				}
			}
		}
		
		if (userAns != answer) {
			System.out.println("�õ� Ƚ���� �ʰ��Ͽ����ϴ�.");
			System.out.println("����: " + answer);
		}
	}
}

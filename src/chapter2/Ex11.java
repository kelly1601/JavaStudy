package chapter2;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		double sight;
		
		System.out.println("�÷�: ");
		sight = scanf.nextDouble();
//		if (sight > 2.0 || sight < 0.0) {
//			System.out.println("������ ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���: ");
//			sight = scanf.nextDouble();
//			System.out.println("�÷�: " + sight);
//		}
//		else {
//			System.out.println("�÷�: " + sight);
		System.out.println(sight >= 0.0 && sight <= 2.0);
		System.out.println(sight >= 0.0 || sight <= 2.0);
	}
}

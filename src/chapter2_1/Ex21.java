package chapter2_1;

public class Ex21 {
	public static void main(String[] args) {
		//����� ���� ������ �� �ִ� ����
		int num1 = 10;
		num1 = 20;
		
		//����� ���� ������ �� ���� ���� = ���
		//���ϸ� �� �Ǵ� �����Ͱ� ���� ��쿡 ���
		//ex) ������ �Ǵ� �� (������, Ư�� ������ �츮 ���� ���� ũ�� ��)
		final int num2 = 10;
		
		num1 = num1 * num2;
		System.out.println(num2);
	}
}

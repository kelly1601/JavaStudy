package chapter2_1;

public class Ex26 {
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		//1000000
		numbers.num1 = 1000000;
		numbers.num2 = numbers.num1;
		
		//int Ÿ���� ������ �Ѵ� ����� ���� overflow ���� �߻�
		int var = numbers.num1 * numbers.num2;
		System.out.println(var);
		
		//���� �Ҽ��� 3° �ڸ����� ���
		double pi = 3.141592;
		double pi_1 = (int) (pi * 1000) / 1000.0;
		System.out.println(pi_1);
		
		//�Ҽ��� ��° �ڸ����� �ݿø��Ϸ� ��° �ڸ����� ���
		double pi_2 = (int) ((pi * 100) + 0.5) / 100.0;
		System.out.println(pi_2);

	}

}

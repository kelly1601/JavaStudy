package chapter1;

public class Ex9 {
	public static void main(String[] args) {
		//�Ǽ� > ���� > ����
		//��ĳ����: ���� ���� �������� ū �������� �� ��ȯ (�� ��ȯ Ÿ�� ���� ����)
		//�ٿ�ĳ����: ���� ū �������� ���� �������� �� ��ȯ (�� ��ȯ Ÿ�� ���� �Ұ���)
		
		char monja = 'A';
		int num = 20;
		
		//���ڸ� ������ ��ȯ(��ĳ����)
		int num2 = monja;
		
		//������ �Ǽ��� ��ȯ(��ĳ����)
		float fNum2 = num;
		
		//�ٿ�ĳ����
		char var = (char)num;
		
		//�Ǽ� -> ������ �� ��ȯ
		//�ٿ�ĳ����
		//���� ���� ����
		double a = 1.1414;
		int b = (int)a;
		
		//���� -> �Ǽ��� �� ��ȯ
		//��ĳ����
		//���� ���� ����
		int c = 1;
		double d = c;
		
		//���� -> ������ �� ��ȯ
		//��ĳ����
		//���� ���� ����
		char e = 'A';
		int f = e;
		
		//���� -> ���ڷ� �� ��ȯ
		//�ٿ�ĳ����
		//���� ���� ����
		int g = 100;
		char h = (char) g;
		
		
		int sum = 74 + 85 + 98;
		int subject = 3;
		//ö���� ���
		double avg = sum/(double)subject;
		
		System.out.println("ö���� ����: " + sum);
		System.out.println("ö���� ���: " + avg);
	
	}
}

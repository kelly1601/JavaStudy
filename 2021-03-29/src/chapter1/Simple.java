package chapter1;

public class Simple {
	public int num1 = 10;
	public int num2 = 20;
	
	@Override
	public String toString() {
		//�Ϲ������� toString�� ����ؼ� ��ü�� ������ ����� ����
		//Ŭ������ ������ ���� ������ �� ������ ���� �ִ� ���� ���
		return super.toString();
		//return "num1 = " + num1 + "num2 = " + num2();
	}

}
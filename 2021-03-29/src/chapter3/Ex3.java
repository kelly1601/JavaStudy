package chapter3;

public class Ex3 {
	public static void main(String[] args) {
		Integer intValue = Integer.valueOf(10);
		System.out.println(intValue.intValue());
		
		//����ڽ� (�ڵ����� .intValue1() ȣ��)
		Integer intValue1 = 10;
		System.out.println(intValue1);
		//�����ڽ� (�ڵ����� .intValue1() ȣ��)
		int num1 = intValue1;
		
		Double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		Character charValue = 'a';
		System.out.println(charValue);
		
		String str = "�ȳ��ϼ���";
		System.out.println(str);
	}
}

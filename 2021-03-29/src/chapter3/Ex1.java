package chapter3;

public class Ex1 {
	public static void main(String[] args) {
		//���׸� Ÿ���� Ŭ������ �θ��� �ٸ� ��� (�׳� �ҷ��� ��)
		//T �ڸ��� � ������ Ÿ���� ���� ����
		ClassName<Object> object1 = new ClassName<>(); //�� ��° <> ���� ���� ����
		ClassName<String> object2 = new ClassName<>(); 
		ClassName<Integer> object3 = new ClassName<Integer>();
		ClassName<Double> object4 = new ClassName<Double>();
		
//		person<String> p1 = new person<> ();
		
		//���׸� Ÿ�� �ڸ����� �⺻ ������ Ÿ���� �� �� ����
		//���׸� Ÿ�� �ڸ����� Ŭ������ �� ���� �ִ�
		//����, �Ǽ�, ���ڸ� ���׸� Ÿ�� �ڸ��� ������
		//�⺻ ������ Ÿ���� Ŭ������ ����� �� �� ��� -> ����Ŭ����(Wrapper Class)
		/*
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * char -> Character
		 * boolean -> Boolean
		 */
//		person<Integer> p2 = new person<> ();
//		
//		//���� 10���� ���޵Ǵ� ���� �ƴ϶� ����ڽ��� ���� Integer�� ���޵�
//		p2.setID(10);
//		//�����ڽ��� ���� 10�� ����
//		int ID = p2.getID();
		
		person <String> p1 = new person<>("010-1234-5678");
		person <Integer> p2 = new person<>(1012345678);
		
		
	}
}

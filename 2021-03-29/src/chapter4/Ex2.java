package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		//ArrayList, LinkedList, stack, vertor ��...
		//ArrayList: �߰��� ����, ������ ����� ��Ȳ������ �������� �ڷ� ����
		//			 �� �ڿ��� ����, ������ ����� ��Ȳ������ ������ �ڷ� ����
		
		//ArrayList�� �����ϴ� �Ϳ� ���� �������� ���� ������ ������
		List<String> arrayList = new ArrayList<>();
//		arrayList = new LinkedList<>();
//		ArrayList<String> arrList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		System.out.println("�ʱ� ����: " + arrayList);
		
		//���� ��ġ ����
		arrayList.add(1, "B");
		System.out.println("�ε��� 1 ��ġ�� B �߰�: " + arrayList);
		arrayList.add(3, "D");
		System.out.println("�ε��� 3 ��ġ�� D �߰�: " + arrayList);
		arrayList.remove(5);
		System.out.println("�ε��� 5 ��ġ ����: " + arrayList);
		System.out.println("�ε��� 2 ��ġ�� �� ��ȯ: " + arrayList.get(2));
		
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i<10; i++) {
			intList.add(i);
		}
		
		List<Passenger> passengerList = new ArrayList<>();
//		passengerList.add(passenger1);
//		passengerList.add(passenger2);
//		passengerList.add(passenger3);
//		passengerList.add(passenger4);
//		passengerList.add(passenger5);
//		passengerList.add(0, passenger6);
		
	}
}

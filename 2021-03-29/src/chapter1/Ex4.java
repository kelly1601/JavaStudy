package chapter1;

import java.util.Calendar;

public class Ex4 {
	//Ķ���� ��ü�� ���� �ִ� ��¥ ������
	//�츮�� ���ϴ� �������� ��ȯ�� �ִ� �޼���
	public static String toString(Calendar calendar) {
		//��-��-��
		//yyyy-MM-dd
		
		String year = calendar.get(Calendar.YEAR) + "-";
		
		//1~12 -> 1~9�������� �� �ڸ��� �� / 10~12�������� �� �ڸ��� ��
		int monthOfYear = calendar.get(Calendar.MONTH) + 1;
		//�� �ڸ��� ���� ��쿡�� �� �տ� 0�� ���̴� ����
		String month = (monthOfYear < 10 ? "0" : "") + monthOfYear + "-";
		
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		String day = (dayOfMonth < 10 ? "0" : "") + dayOfMonth;
		
		return year + month + day;
		
	}
	
	public static void main(String[] args) {
//		Simple simple = new Simple();
//		System.out.println(simple.toString());
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(toString(calendar));
		
		//System.out.println(calendar);
		
		System.out.println("= 1�� �� =");
		//DATE(��¥)�� 1�� ���ϰڴ�
		calendar.add(Calendar.DATE, 1);
		System.out.println(toString(calendar));
		
		System.out.println("= 2�� �� =");
		//DATE(��¥)�� 2�� ���ϰڴ�
		calendar.add(Calendar.DATE, 2);
		System.out.println(toString(calendar));
		
		System.out.println("= 30�� �� =");
		//DATE(��¥)�� 30�� ���ϰڴ�
		calendar.add(Calendar.DATE, 30);
		System.out.println(toString(calendar));
		
		System.out.println("= �� �� �� =");
		//MONTH(��)�� 1�� ���ϰڴ�
		calendar.add(Calendar.MONTH, 1);
		System.out.println(toString(calendar));
	}
}

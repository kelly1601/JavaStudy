package chapter1;

import java.util.Calendar;

public class Ex2 {
	//�Ϸ��� �ð��� �ʷ� ��ȯ�� ��
	static final int DAY_IN_SECOND = 24 * 60 * 60;
	static final int HOUR_IN_SECOND = 60 * 60;
	static final int MINUTE_IN_SECOND = 60;
	
	public static void main(String[] args) {
		//�ڵ尡 ����Ǵ� ������ �ð�
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		//Calendar�� ���� 0���� ī��Ʈ��
		//�򰥸��� ������ JANUARY�� �ٲ㼭 ��
		//��¥ ����
		cal1.set(2021, Calendar.JANUARY, 1);
		cal2.set(2021, Calendar.JANUARY, 2);
		
		//�и��� ������ ��ȯ
		long cal1ToSecond = cal1.getTimeInMillis();
		long cal2ToSecond = cal2.getTimeInMillis();
		
		//1�� 1�ϰ� 1�� 2���� ���̸� ���� ��
		//�� ������ �ٲٱ� ���� 1000���� ����
		long difference = cal2ToSecond - cal1ToSecond;
		difference = difference / 1000;
		System.out.println(difference + "�ʰ� �귶���ϴ�.");
		
		//�� ������ DAY_IN_SECOND�� ������ ��ĥ�� �������� ����
		int period = (int) (difference / DAY_IN_SECOND);
		System.out.println(period + "�� ���");
		
		int period2 = (int) (difference / HOUR_IN_SECOND);
		System.out.println(period2 + "�ð� ���");
		
		int period3 = (int) (difference / MINUTE_IN_SECOND);
		System.out.println(period3 + "�� ���");
		
	}

}

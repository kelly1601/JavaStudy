package chapter1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex12 {
	public static String toString(LocalDate date) {
		String year = date.getYear() + "��";
		String month = date.getMonthValue() + "��";
		String day = date.getDayOfMonth() + "��";
		
		return year + " " + month + " " + day;
	}
	
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(9, 12, 34);
		
		//�� ���� ���̸� �� �� ����
		Duration duration = Duration.between(time1, time2);
		
		//�� ���� ����
		long second = duration.get(ChronoUnit.SECONDS);
		
		//������ ���� ���� / �и���, ����ũ����, ������
		long nano = duration.get(ChronoUnit.NANOS);
		
		//0�� 0�� 0�� ������ ������ �ִ� ��ü ����
		LocalTime time = LocalTime.of(0, 0, 0);
		//�� ���� ���̸�ŭ �ʸ� ����
		time = time.plusSeconds(second);
		
		System.out.println(time.getHour() + "�ð� " + time.getMinute() + "�� " + time.getSecond() + "�� ����");
		
//		System.out.println(second);
//		System.out.println(nano);
//		
//		long hour = second/3600;
//		long minute = second/60 - hour * 60;
//		long second2 = second - minute * 60 - hour * 3600;
//		
//		System.out.println(hour + "�ð� " + minute + "�� " + second2 + "�� ���̰� ���ϴ�");
		
		
//		LocalDate date1 = LocalDate.of(2020,  1, 19);
//		LocalDate date2 = LocalDate.now();
//		
//		//���� ����
//		Period period = Period.between(date1, date2);
//		//���� �� ��
//		long year = period.get(ChronoUnit.YEARS);
//		//���� �� ��
//		long month = period.get(ChronoUnit.MONTHS);
//		//���� �� ��
//		long day = period.get(ChronoUnit.DAYS);
//		
//		//��¥�� ���̸� �ϴ����� ������ �ִ� ����
//		long dayPeriod = (year * 365) + (month * 30) + day;
//		//��¥�� ���̸� ������ ������ ������ �ִ� ����
//		long monthPeriod = (year * 12) + month;
//		
//		String date1String = toString(date1);
//		String date2String = toString(date2);
//		String periodString = year + "�� " + month + "���� " + day + "�� ���̰� ���ϴ�";
//		
//		System.out.println(date1String + "�� " + date2String + "��" + periodString);
//		System.out.println(date1String + "�� " + date2String + "��" + dayPeriod + "�� ���̰� ���ϴ�");
//		System.out.println(date1String + "�� " + date2String + "��" + monthPeriod + "���� ���̰� ���ϴ�");
//		
//		System.out.println("�ڷγ� ���� " + year + "�� " + month + "���� " + day + "��°");
	}
}

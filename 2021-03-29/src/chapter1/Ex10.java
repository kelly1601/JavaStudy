package chapter1;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Ex10 {
	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		
		System.out.println(zdt);
		
		//�ð����� ���� -> offset
		ZoneOffset krOffset = zdt.getOffset();
		System.out.println(krOffset);
		
		ZoneId nyId = ZoneId.of("America/New_York");
		zdt = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(zdt);
		
		ZoneOffset nyOffset = zdt.getOffset();
		System.out.println(nyOffset);
		
//		//���� �ý����� ��¥�� �ð��� ���� ��ü
//		LocalDateTime dateTime = LocalDateTime.now();
//		
//		//�ѱ��� �ð���
//		//Asia/Seoul -> ����
//		//Asia/Japan -> �Ϻ�
//		//Ÿ����, �ð���, zone id Ű����� �˻�
//		ZoneId zoneId = ZoneId.of("Asia/Seoul");
//		
//		//dateTime ��ü�� ������ �ִ� ��¥�� �ð��� Asia/Seoul�� ��¥�� �ð��̶�� ǥ�� ����
//		ZonedDateTime zdt = dateTime.atZone(zoneId);
//		
//		System.out.println(dateTime);
//		System.out.println(zdt);
	}
}

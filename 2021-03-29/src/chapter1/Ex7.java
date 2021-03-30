//time ��Ű��
package chapter1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex7 {
	public static void main(String[] args) {
		//��ü�� Ÿ�Կ� Date �ܾ �����Ƿ� ��¥�� �ٷ��
		LocalDate localDate = LocalDate.now();
		
		//��ü�� Ÿ�Կ� Time �ܾ �����Ƿ� �ð��� �ٷ��
		LocalTime localTime = LocalTime.now();
		
		//��ü�� Ÿ�Կ� Date, Time ��� �����Ƿ� ��¥�� �ð��� �ٷ��
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//�ð������ ������ �ִ� ��¥�� �ð��� �ٷ��
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println("==== ====");
		
		//��¥
		LocalDate ld = LocalDate.of(2021, 03, 25);
		//�ð�
		LocalTime lt = LocalTime.of(1, 12, 34);
		//��¥�� �ð�
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		//��¥, �ð� + �ð���
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
	}
}

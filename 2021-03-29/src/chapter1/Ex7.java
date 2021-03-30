//time 패키지
package chapter1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex7 {
	public static void main(String[] args) {
		//객체의 타입에 Date 단어가 들어갔으므로 날짜를 다룬다
		LocalDate localDate = LocalDate.now();
		
		//객체의 타입에 Time 단어가 들어갔으므로 시간을 다룬다
		LocalTime localTime = LocalTime.now();
		
		//객체의 타입에 Date, Time 모두 들어갔으므로 날짜와 시간을 다룬다
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//시간대까지 가지고 있는 날짜와 시간을 다룬다
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println("==== ====");
		
		//날짜
		LocalDate ld = LocalDate.of(2021, 03, 25);
		//시간
		LocalTime lt = LocalTime.of(1, 12, 34);
		//날짜와 시간
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		//날짜, 시간 + 시간대
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
	}
}

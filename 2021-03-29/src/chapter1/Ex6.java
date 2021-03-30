//SimpleDateFormat
//날짜와 관련된 형식화 클래스
package chapter1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
		SimpleDateFormat sdf;
		
		//y -> 년, M -> 월, d -> 일
		//yyyy = 년을 4자리로 출력
		//MM = 월을 2자리로 출력
		//dd = 일을 2자리로 출력
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 H:m:s.SSS");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy년 M월 d일 h:m:s.SSS a");
		System.out.println(sdf.format(date));
	}
}

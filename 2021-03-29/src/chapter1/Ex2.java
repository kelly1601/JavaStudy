package chapter1;

import java.util.Calendar;

public class Ex2 {
	//하루의 시간을 초로 변환한 값
	static final int DAY_IN_SECOND = 24 * 60 * 60;
	static final int HOUR_IN_SECOND = 60 * 60;
	static final int MINUTE_IN_SECOND = 60;
	
	public static void main(String[] args) {
		//코드가 실행되는 시점의 시간
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		//Calendar는 월을 0부터 카운트함
		//헷갈리기 때문에 JANUARY로 바꿔서 씀
		//날짜 지정
		cal1.set(2021, Calendar.JANUARY, 1);
		cal2.set(2021, Calendar.JANUARY, 2);
		
		//밀리초 단위로 변환
		long cal1ToSecond = cal1.getTimeInMillis();
		long cal2ToSecond = cal2.getTimeInMillis();
		
		//1월 1일과 1월 2일의 차이를 구한 후
		//초 단위로 바꾸기 위해 1000으로 나눔
		long difference = cal2ToSecond - cal1ToSecond;
		difference = difference / 1000;
		System.out.println(difference + "초가 흘렀습니다.");
		
		//초 단위를 DAY_IN_SECOND로 나누어 며칠의 차이인지 구함
		int period = (int) (difference / DAY_IN_SECOND);
		System.out.println(period + "일 경과");
		
		int period2 = (int) (difference / HOUR_IN_SECOND);
		System.out.println(period2 + "시간 경과");
		
		int period3 = (int) (difference / MINUTE_IN_SECOND);
		System.out.println(period3 + "분 경과");
		
	}

}

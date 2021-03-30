//DecimalFormat
//숫자와 관련된 형식화 클래스
package chapter1;

import java.text.DecimalFormat;

public class Ex5 {
	public static void main(String[] args) {
		int balance = 1278455091;
		
		//#, ., , 세 가지를 통하여 보고 싶은 형식 지정
		//# = 10진수
		//. = 소수점 구분자
		//, = 콤마 문자 그 자체
		DecimalFormat df = new DecimalFormat("#,###");
		String data = df.format(balance);
		System.out.println(data);
		
		double avg = 87.53710297;
		
		df = new DecimalFormat("#.##");
		System.out.println(df.format(avg));
	}
}

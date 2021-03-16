package chapter1;

public class Ex9 {
	public static void main(String[] args) {
		//실수 > 정수 > 문자
		//업캐스팅: 값이 작은 범위에서 큰 범위로의 형 변환 (형 변환 타입 생략 가능)
		//다운캐스팅: 값이 큰 범위에서 작은 범위로의 형 변환 (형 변환 타입 생략 불가능)
		
		char monja = 'A';
		int num = 20;
		
		//문자를 정수로 변환(업캐스팅)
		int num2 = monja;
		
		//정수를 실수로 변환(업캐스팅)
		float fNum2 = num;
		
		//다운캐스팅
		char var = (char)num;
		
		//실수 -> 정수로 형 변환
		//다운캐스팅
		//값의 변경 있음
		double a = 1.1414;
		int b = (int)a;
		
		//정수 -> 실수로 형 변환
		//업캐스팅
		//값의 변경 없음
		int c = 1;
		double d = c;
		
		//문자 -> 정수로 형 변환
		//업캐스팅
		//값의 변경 없음
		char e = 'A';
		int f = e;
		
		//정수 -> 문자로 형 변환
		//다운캐스팅
		//값의 변경 있음
		int g = 100;
		char h = (char) g;
		
		
		int sum = 74 + 85 + 98;
		int subject = 3;
		//철수의 평균
		double avg = sum/(double)subject;
		
		System.out.println("철수의 총점: " + sum);
		System.out.println("철수의 평균: " + avg);
	
	}
}

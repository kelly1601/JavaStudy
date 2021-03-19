package chapter2_1;

public class Ex26 {
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		//1000000
		numbers.num1 = 1000000;
		numbers.num2 = numbers.num1;
		
		//int 타입의 범위를 넘는 결과로 인해 overflow 현상 발생
		int var = numbers.num1 * numbers.num2;
		System.out.println(var);
		
		//파이 소수점 3째 자리까지 출력
		double pi = 3.141592;
		double pi_1 = (int) (pi * 1000) / 1000.0;
		System.out.println(pi_1);
		
		//소수점 셋째 자리에서 반올림하려 둘째 자리까지 출력
		double pi_2 = (int) ((pi * 100) + 0.5) / 100.0;
		System.out.println(pi_2);

	}

}

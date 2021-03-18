package chapter2_1;

public class Ex21 {
	public static void main(String[] args) {
		//저장된 값을 변경할 수 있는 변수
		int num1 = 10;
		num1 = 20;
		
		//저장된 값을 변경할 수 없는 변수 = 상수
		//변하면 안 되는 데이터가 있을 경우에 사용
		//ex) 기준이 되는 값 (원주율, 특정 시점에 우리 나라 땅의 크기 등)
		final int num2 = 10;
		
		num1 = num1 * num2;
		System.out.println(num2);
	}
}

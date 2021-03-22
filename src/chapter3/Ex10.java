package chapter3;

public class Ex10 {
	public static void main(String[] args) {
//		while (조건식) {
//			코드
//		}
		/*
		 * 조건식은 논리형만 가능
		 * 조건이 참을 경우에만 반복적으로 실행됨
		 * 어떤 조건일 동안 반복해야 하는 문제에 적합
		 */
		
		int i = 0;
		
		while(i < 10) {
			System.out.println("Hello World");
			i++;
		}
		
		int a = 1;
		
		while(a < 11) {
			System.out.println(a + 1);
			a = a + 2;
		}
		
		a = 1;
		
		while(a < 11) {
			if (a%2 == 0) {
				System.out.println(a);
				a++;
			}
			else {
				a++;
			}
		}
	}
}

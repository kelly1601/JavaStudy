package chapter3;

public class Ex10 {
	public static void main(String[] args) {
//		while (���ǽ�) {
//			�ڵ�
//		}
		/*
		 * ���ǽ��� ������ ����
		 * ������ ���� ��쿡�� �ݺ������� �����
		 * � ������ ���� �ݺ��ؾ� �ϴ� ������ ����
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

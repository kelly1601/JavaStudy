package chapter3;

public class Ex6 {
	public static void main(String[] args) {
//		switch(��) {
//		case ��1:
//			�ڵ�
//			break;
//		case ��2:
//			�ڵ�
//			break;
//		default:
//			�ڵ�
//		}

		/*
		 * ���� ���� �Ǵ� ���ڸ� ����
		 * case�� ���� ���Ͽ� ��ġ�ϴ� �ڵ带 ����
		 * default ��� case�� �ش���� ���� �� ����, ���û���
		 */
		int num = 1;
		
		switch(num) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		} //end switch
		
		System.out.println("���α׷� ����");
	}
}

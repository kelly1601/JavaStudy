package chapter3;

public class Ex7 {
	public static void main(String[] args) {
		//1�⵿�� ���� å�� ��
		int book = 2;
		
		if (book >= 0) {
			switch(book) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("���� �� �����ô� �� ���ھ��!");
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				System.out.println("å �д� ���� ���� ���̽ó׿�!");
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
				System.out.println("å�� ����ϴ� ���̽ó׿�!");
				break;
			default:
				System.out.println("����� �ٵ����Դϴ�!");
			}
		}
		else {
			System.out.println("���� å�� ���� ����� �����մϴ�.");
		}
		
		
		//���� �ڵ� �ܼ�ȭ
		int book2 = book/10;
		
		switch(book2) {
		case 0:
			System.out.println("���� �� ����ϼ���!");
			break;
		case 1:
			System.out.println("å �д� ���� ���� ���̽ó׿�!");
			break;
		case 2:
			System.out.println("å�� ����ϴ� ���̽ó׿�!");
			break;
		default:
			System.out.println("����� �ٵ����Դϴ�!");
		}

		//¦�� Ȧ�� ���
		int num = 10;
		int numMod = num/2;
		
		switch(numMod) {
		case 0:
			System.out.println("¦��");
			break;
		case 1:
		case -1:
			System.out.println("Ȧ��");
			break;
		}
		
		//2021 3�� ���� ���
		int date = 21;
		int dateMod = date/7;
		
		switch(dateMod) {
		case 0:
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
			break;
		}

	}
}

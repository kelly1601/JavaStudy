//DecimalFormat
//���ڿ� ���õ� ����ȭ Ŭ����
package chapter1;

import java.text.DecimalFormat;

public class Ex5 {
	public static void main(String[] args) {
		int balance = 1278455091;
		
		//#, ., , �� ������ ���Ͽ� ���� ���� ���� ����
		//# = 10����
		//. = �Ҽ��� ������
		//, = �޸� ���� �� ��ü
		DecimalFormat df = new DecimalFormat("#,###");
		String data = df.format(balance);
		System.out.println(data);
		
		double avg = 87.53710297;
		
		df = new DecimalFormat("#.##");
		System.out.println(df.format(avg));
	}
}

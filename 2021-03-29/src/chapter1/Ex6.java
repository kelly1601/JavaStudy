//SimpleDateFormat
//��¥�� ���õ� ����ȭ Ŭ����
package chapter1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
		SimpleDateFormat sdf;
		
		//y -> ��, M -> ��, d -> ��
		//yyyy = ���� 4�ڸ��� ���
		//MM = ���� 2�ڸ��� ���
		//dd = ���� 2�ڸ��� ���
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� H:m:s.SSS");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy�� M�� d�� h:m:s.SSS a");
		System.out.println(sdf.format(date));
	}
}

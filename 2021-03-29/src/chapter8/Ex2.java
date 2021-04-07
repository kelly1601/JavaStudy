package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		//inputStream�� ����� �迭
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//outputStream�� ����� �����͸� ���� �迭
		byte[] outSrc = null;
		
		byte[] temp = new byte[10];
		
		//����Ʈ ����� input ��Ʈ�� ����
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		//����Ʈ ����� output ��Ʈ�� ����
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		try {
			input.read(temp);
			
			output.write(temp);
			
			outSrc = output.toByteArray();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		while(true) {
//			int data = input.read();
//			if(data == -1) {
//				//��Ʈ���� ����� �������� ���� �����ٸ�
//				//�� �ݺ����� ����������
//				break;
//			}
//			
//			output.write(data);
//		}
		
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(outSrc));
		System.out.println(Arrays.toString(inSrc));
		
		try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

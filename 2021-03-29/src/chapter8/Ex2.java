package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		//inputStream과 연결될 배열
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//outputStream에 저장된 데이터를 가질 배열
		byte[] outSrc = null;
		
		byte[] temp = new byte[10];
		
		//바이트 기반의 input 스트림 생성
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		//바이트 기반의 output 스트림 생성
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
//				//스트림과 연결된 데이터의 끝을 만났다면
//				//이 반복문을 빠져나가라
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

package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		//iterator ������ ��ȯ
		Iterator<Integer> it = list.iterator();
		
		//Iterator�� �����Ͱ� ����Ű�� ������ �ǵ� �� ����
		//hasNext, next�� �̿��� ������ �̵��ϸ鼭 ���
		//�����ʹ� �տ��� �ڷθ� �̵� ����
		while(it.hasNext()) {
			int num = it.next();
			Integer num2 = it.next();
			
			System.out.println();
		}
		
		
		
		
	}
}

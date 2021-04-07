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
		
		//iterator 구조로 변환
		Iterator<Integer> it = list.iterator();
		
		//Iterator는 포인터가 가리키는 변수만 건들 수 있음
		//hasNext, next를 이용해 포인터 이동하면서 사용
		//포인터는 앞에서 뒤로만 이동 가능
		while(it.hasNext()) {
			int num = it.next();
			Integer num2 = it.next();
			
			System.out.println();
		}
		
		
		
		
	}
}

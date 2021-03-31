package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		//ArrayList, LinkedList, stack, vertor 등...
		//ArrayList: 중간에 삽입, 삭제가 빈번한 상황에서는 부적합한 자료 구조
		//			 맨 뒤에서 삽입, 삭제가 빈번한 상황에서는 적합한 자료 구조
		
		//ArrayList는 저장하는 것에 따라 동적으로 저장 공간을 생성함
		List<String> arrayList = new ArrayList<>();
//		arrayList = new LinkedList<>();
//		ArrayList<String> arrList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		System.out.println("초기 상태: " + arrayList);
		
		//저장 위치 지정
		arrayList.add(1, "B");
		System.out.println("인덱스 1 위치에 B 추가: " + arrayList);
		arrayList.add(3, "D");
		System.out.println("인덱스 3 위치에 D 추가: " + arrayList);
		arrayList.remove(5);
		System.out.println("인덱스 5 위치 삭제: " + arrayList);
		System.out.println("인덱스 2 위치의 값 반환: " + arrayList.get(2));
		
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i<10; i++) {
			intList.add(i);
		}
		
		List<Passenger> passengerList = new ArrayList<>();
//		passengerList.add(passenger1);
//		passengerList.add(passenger2);
//		passengerList.add(passenger3);
//		passengerList.add(passenger4);
//		passengerList.add(passenger5);
//		passengerList.add(0, passenger6);
		
	}
}

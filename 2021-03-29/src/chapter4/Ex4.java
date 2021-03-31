package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			intList.add(i);
		}
		System.out.println(intList.get(2));
		
		Integer el1 = intList.get(5);
		System.out.println(el1);
		
		int el2 = intList.get(5);
		System.out.println(el2);
		
		float el3 = intList.get(5);
		
		String el4 = intList.get(5).toString();
		
		//비어 있나요? -> true / 그렇지 않으면 false
		System.out.println(intList.isEmpty());
		//컬렉션 프레임워크에 들어 있는 데이터의 개수를 반환
		System.out.println(intList.size());
		
		//i가 0으로 시작해서 9로 끝난다.
		for(int i = 0; i<intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		//향상된 for문 / foreach문
		//배열 또는 컬렉션 프레임워크에 들어 있는 데이터를 하나하나 할당하여 실행
		for(int j : intList) {
			System.out.println(j);
		}
	}
}

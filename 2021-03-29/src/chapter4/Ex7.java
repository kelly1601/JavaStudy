package chapter4;

import java.util.HashSet;
import java.util.Set;

public class Ex7 {
	public static void main(String[] args) {
		//Set은 저장하는 데이터의 순서를 보장하지는 않음
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(7);
		
		System.out.println("초기 상태: " + hashSet);
		
		//중복이기 때문에 추가되지 않음
		//추가했으면 true, 추가하지 못했으면 false를 반환함
		hashSet.add(1);
		System.out.println("요소에 1을 추가: " + hashSet);
		
		boolean isAdd = hashSet.add(7);
		if (isAdd) {
			System.out.println("요소 7을 추가: " + hashSet);
		}
		
		isAdd = hashSet.add(9);
		if (isAdd) {
			System.out.println("요소 9를 추가: " + hashSet);
		}
		
		hashSet.remove(1);
		System.out.println("요소 1을 삭제: " + hashSet);
	}
}

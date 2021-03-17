package chapter2_1;

public class Ex2 {
	public static void main(String[] args) {
		
		int i = 4;
		//배열에 저장할 데이터의 개수는 전통적으로 상수만 가능
		char[] arr1 = new char[5];
		//자바는 특별히 변수도 넣을 수 있음
		char[] arr2 = new char[i];
		//컴파일 타임에 배열의 크기를 결정한다.
		
		//변수를 입력받는 경우에는 런타임에 배열의 크기를 결정한다고 함.
		// -> 동적 배열 생성
	}

}

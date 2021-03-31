//제네릭스 generics
//하나의 변수 명을 가지고 다양한 타입의 값을 저장하기 위한 방법
/*
 * 제네릭 타입 - 클래스에 Generics 정의 (클래스 명 옆에 <영문자 하나(보통 T)> 적음)
 * 제네릭 함수 - 메서드에 Generics 정의 
 */
package chapter3;

//E - Element
//K - Key
//V - Value
//T - Type
//N - Number

//T1, T2 이런 식으로 여러 개도 가능
//개수만큼 타입 지정해 줘야 함
public class person <T> {
	private int eye;
	private int nose;
	private int mouth;
	
	private T id;
	private T tel;
	
	public person(T tel) {
		this.tel = tel;
	}
	
	public void setTel() {
		this.tel = tel;
	}
	
//	public person(int eye, int nose, int mouth, T id) {
//		this.eye = eye;
//		this.nose = nose;
//		this.mouth = mouth;
//		this.id = id;
//	}
	
	public void add(T val1, T val2) {
		System.out.println(1);
	}
	
	public void setID(T id) {
		this.id = id;
	}
	
	public T getID() {
		return id;
	}

}

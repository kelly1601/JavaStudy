package chapter3;

public class Ex1 {
	public static void main(String[] args) {
		//제네릭 타입의 클래스를 부르는 다른 방법 (그냥 불러도 됨)
		//T 자리에 어떤 데이터 타입이 들어갈지 적음
		ClassName<Object> object1 = new ClassName<>(); //두 번째 <> 안은 생략 가능
		ClassName<String> object2 = new ClassName<>(); 
		ClassName<Integer> object3 = new ClassName<Integer>();
		ClassName<Double> object4 = new ClassName<Double>();
		
//		person<String> p1 = new person<> ();
		
		//제네릭 타입 자리에는 기본 데이터 타입은 들어갈 수 없음
		//제네릭 타입 자리에는 클래스만 올 수가 있다
		//정수, 실수, 문자를 제네릭 타입 자리에 쓰려면
		//기본 데이터 타입을 클래스로 만들어 둔 것 사용 -> 레퍼클래스(Wrapper Class)
		/*
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * char -> Character
		 * boolean -> Boolean
		 */
//		person<Integer> p2 = new person<> ();
//		
//		//정수 10으로 전달되는 것이 아니라 오토박싱을 통해 Integer로 전달됨
//		p2.setID(10);
//		//오토언박싱을 통해 10을 받음
//		int ID = p2.getID();
		
		person <String> p1 = new person<>("010-1234-5678");
		person <Integer> p2 = new person<>(1012345678);
		
		
	}
}

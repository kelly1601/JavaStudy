package chapter3;

public class Ex3 {
	public static void main(String[] args) {
		Integer intValue = Integer.valueOf(10);
		System.out.println(intValue.intValue());
		
		//오토박싱 (자동으로 .intValue1() 호출)
		Integer intValue1 = 10;
		System.out.println(intValue1);
		//오토언박싱 (자동으로 .intValue1() 호출)
		int num1 = intValue1;
		
		Double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		Character charValue = 'a';
		System.out.println(charValue);
		
		String str = "안녕하세요";
		System.out.println(str);
	}
}

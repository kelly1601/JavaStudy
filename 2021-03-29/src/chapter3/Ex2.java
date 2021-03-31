//레퍼 클래스
package chapter3;

public class Ex2 {
	public static void main(String[] args) {
		Byte byteValue = Byte.valueOf((byte)10);
		System.out.println(byteValue.byteValue());
		
		Short shortValue = Short.valueOf((short)10);
		System.out.println(shortValue.shortValue());
		
		Integer integerValue = Integer.valueOf(10);
		System.out.println(integerValue.intValue());
		
		Long longValue = Long.valueOf(10);
		System.out.println(longValue.longValue());
		
		Float floatValue = Float.valueOf((float)3.14);
		Float floatValue2 = Float.valueOf("3.14"); //문자 형태의 실수를 float 타입으로 변환
		System.out.println(floatValue.floatValue());
		
		Double doubleValue = Double.valueOf(3.14);
		System.out.println(doubleValue.doubleValue());
		
		Character charValue = Character.valueOf('A');
		System.out.println(charValue.charValue());
		
		Boolean booleanValue = Boolean.valueOf(true);
		System.out.println(booleanValue.booleanValue());
	}
}

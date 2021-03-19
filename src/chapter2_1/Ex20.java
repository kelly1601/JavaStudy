package chapter2_1;

public class Ex20 {
	public static void main(String[] args) {
		SimpleType1 type1 = new SimpleType1();
		type1.num1 = 10;
		//type1.num2 = 11;
		//SimpleType1.num2 = 11;
		
		SimpleType1 type2 = new SimpleType1();
		type2.num1 = 20;
		
		System.out.println(type1.num1);
		System.out.println(type2.num1);
	}
}

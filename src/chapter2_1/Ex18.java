package chapter2_1;

public class Ex18 {
	public static void main(String[] args) {
		int var1;
		
		//1. Ex15 타입의 인스턴스를 생성
		//2. obj1 객체에 저장
		Ex15 obj1 = new Ex15();
		obj1.var1 = 10;
		obj1.var2 = 3.14;
		obj1.var3 = 'a';
		obj1.var4 = "Hello World~!";
		
		//1. Ex16 타입의 인스턴스를 생성
		//2. obj2 객체에 저장
		Ex16 obj2 = new Ex16();
		obj2.num1 = 100;
		obj2.num2 = 50;
		
		//1. Ex17 타입의 인스턴스를 생성
		//2. obj3 객체에 저장
		Ex17 obj3 = new Ex17();
		obj3.num1 = 32;
		obj3.num2 = 180.6;
		obj3.num4 = 'A';
		obj3.num5 = "나이키";
		obj3.num6 = "삼성";
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println(obj3.num4);
		System.out.println(obj3.num5);
		System.out.println(obj3.num6);
		
		//클래스라고 하는 나만의 데이터 타입 선언
		//클래스를 사용해서 인스턴스를 생성
		//인스턴스 안에 데이터를 저장
		//저장된 데이터를 출력
	}
}

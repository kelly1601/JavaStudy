package chapter1;

public class Simple {
	public int num1 = 10;
	public int num2 = 20;
	
	@Override
	public String toString() {
		//일반적으로 toString을 사용해서 객체의 정보를 출력할 때는
		//클래스에 선언해 놓은 변수와 그 변수가 갖고 있는 값을 출력
		return super.toString();
		//return "num1 = " + num1 + "num2 = " + num2();
	}

}

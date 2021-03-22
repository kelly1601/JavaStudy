package chapter3;

public class Ex11 {
	public static void main(String[] args) {
		int i = 10;
		
		while (i >= 1) {
			if (i%2 == 1) {
				System.out.println(i);
				i--;
			}
			else {
				i--;
			}
		}
		
		i = 9;
		while (i>= 1) {
			System.out.println(i);
			i = i - 2;
		}
		
		//备备窜
		int a = 1;
		while (a < 10) {
			System.out.println("2 * " + a + " = " + 2*a);
			a++;
		}
		
		//备备窜 2
		int j = 2;
		while (j <= 5) {
			i = 1;
			System.out.println(j + "窜");
			while (i <= 9) {
				System.out.println(j + " * " + i + " = " + j*i);
				i++;
			}
			System.out.println("-------------");
			j++;
		}
	}
}

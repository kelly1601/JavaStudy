package chapter2_1;

public class Ex22 {
	public static void main(String[] args) {
		student student1 = new student();
		student1.kor = 56;
		student1.eng = 41;
		student1.mat = 88;
		student1.sum = student1.kor + student1.eng + student1.mat;
		student1.avg = student1.sum / 3.0;
		
		int sum = student1.kor + student1.eng + student1.mat;
		double avg = sum/3.0;
		
		System.out.println("Ã¶¼öÀÇ ÃÑÁ¡: " + sum);
		System.out.println("Ã¶¼öÀÇ Æò±Õ: " + avg);
	}
}

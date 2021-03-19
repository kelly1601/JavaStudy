package chapter3;


public class Ex1 {
	public static void main(String[] args) {
		System.out.println("코드 시작");
		
		if (false) {
			System.out.println("이 if문은");
			System.out.println("참이므로");
			System.out.println("코드가 실행됩니다.");
		}
		else {
			System.out.println("이 if문은");
			System.out.println("거짓이므로");
			System.out.println("이 코드가 실행됩니다.");
		}
		
		System.out.println("코드 끝");
		
		int score = 60;
		
		if (score >= 60) {
			System.out.println("통과");
		}
		else {
			System.out.println("재시험");
		}
		
		double weight;
		double height;

	
//		double bmi = weight/(height * height)*10000;
		
//		if (bmi < 18.5) {
//			System.out.println("저체중");
//		}
//		else if (18.5 <= bmi <= 22) {
//			System.out.println("정상");
//		}
//		else if (22 < bmi <= 24) {
//			System.out.println("과체중 의심");
//		}
//		else if (24 < bmi <= 30) {
//			System.out.println("비만");
//		}
//		else {
//			System.out.println("고도 비만");
//		}

	}
}

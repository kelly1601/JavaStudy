package chapter3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int num;
		Scanner sca = new Scanner(System.in);
		System.out.print("0~100 사이의 숫자를 입력하세요");
		num = sca.nextInt();
		
		if (num >= 50) {
			System.out.println("50 이상의 값이 들어 있습니다.");
		}
		else {
			System.out.println("50 미만의 값이 들어 있습니다.");
		}
		
		
		double height;
		System.out.print("키를 입력하세요.");
		height = sca.nextDouble();
		
		if (height >= 150) {
			System.out.println("탑승 가능");
		}
		else {
			System.out.println("탑승 불가");
		}
		
		
		int numb = 1;
		
		if (numb == 1) {
			System.out.println("1입니다.");
		}
		else if (numb == 2) {
			System.out.println("2입니다.");
		}
		else if (numb == 3) {
			System.out.println("3입니다.");
		}
		else if (numb == 4) {
			System.out.println("4입니다.");
		}
		
		
		int age;
		System.out.print("나이를 입력하세요");
		age = sca.nextInt();
		
		if (age <= 7) {
			System.out.println("미취학 아동입니다.");
		}
		else if (age > 7 && age <= 13) {
			System.out.println("초등학생입니다.");
		}
		else if (age > 13 && age <= 16) {
			System.out.println("중학생입니다.");
		}
		else if (age > 16 && age <= 19) {
			System.out.println("고등학생입니다.");
		}
		else {
			System.out.println("성인입니다.");
		}
		
		
		int dayOfMonth;
		System.out.print("2021년 3월의 날짜: ");
		dayOfMonth = sca.nextInt();
		
		System.out.println("2021년 3월 " + dayOfMonth + "일은 ");
		if ((dayOfMonth % 7) == 1) {
			System.out.println("월요일입니다.");
		}
		else if ((dayOfMonth % 7) == 2) {
			System.out.println("화요일입니다.");
		}
		else if ((dayOfMonth % 7) == 3) {
			System.out.println("수요일입니다.");
		}
		else if ((dayOfMonth % 7) == 4) {
			System.out.println("목요일입니다.");
		}
		else if ((dayOfMonth % 7) == 5) {
			System.out.println("금요일입니다.");
		}
		else if ((dayOfMonth % 7) == 6) {
			System.out.println("토요일입니다.");
		}
		else {
			System.out.println("일요일입니다.");
		}
		
		
		int num2;
		int num3;
		System.out.print("첫 번째 숫자를 입력하세요");
		num2 = sca.nextInt();
		System.out.print("두 번째 숫자를 입력하세요");
		num3 = sca.nextInt();
		
		if (num2 > num3) System.out.println(num2);
		else if (num3 > num2) System.out.println(num3);
		else System.out.println("두 수의 값이 같습니다.");
		
		
		double score;
		System.out.println("점수를 입력하세요: ");
		score = sca.nextDouble();
		
		if (score <= 100 && score >= 90) System.out.println("A");
		else if (score < 90 && score >= 80) System.out.println("B");
		else if (score < 80 && score >= 70) System.out.println("C");
		else if (score < 70 && score >= 60) System.out.println("D");
		else if (score < 60 && score >= 0) System.out.println("F");
		else System.out.println("잘못된 값입니다.");
	}
}

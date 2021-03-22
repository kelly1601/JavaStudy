package chapter3;

public class Ex6 {
	public static void main(String[] args) {
//		switch(값) {
//		case 값1:
//			코드
//			break;
//		case 값2:
//			코드
//			break;
//		default:
//			코드
//		}

		/*
		 * 값은 정수 또는 문자만 가능
		 * case의 값과 비교하여 일치하는 코드를 실행
		 * default 모든 case에 해당되지 않을 때 실행, 선택사항
		 */
		int num = 1;
		
		switch(num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		} //end switch
		
		System.out.println("프로그램 종료");
	}
}

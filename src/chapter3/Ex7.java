package chapter3;

public class Ex7 {
	public static void main(String[] args) {
		//1년동안 읽은 책의 수
		int book = 2;
		
		if (book >= 0) {
			switch(book) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("조금 더 읽으시는 게 좋겠어요!");
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				System.out.println("책 읽는 것을 즐기는 분이시네요!");
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			default:
				System.out.println("당신은 다독왕입니다!");
			}
		}
		else {
			System.out.println("읽은 책의 수는 양수만 가능합니다.");
		}
		
		
		//위에 코드 단순화
		int book2 = book/10;
		
		switch(book2) {
		case 0:
			System.out.println("조금 더 노력하세요!");
			break;
		case 1:
			System.out.println("책 읽는 것을 즐기는 분이시네요!");
			break;
		case 2:
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default:
			System.out.println("당신은 다독왕입니다!");
		}

		//짝수 홀수 출력
		int num = 10;
		int numMod = num/2;
		
		switch(numMod) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
		case -1:
			System.out.println("홀수");
			break;
		}
		
		//2021 3월 요일 출력
		int date = 21;
		int dateMod = date/7;
		
		switch(dateMod) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		}

	}
}

package project1;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		//컴퓨터가 1~100 사이의 수 중 하나의 수를 선택한다.
		//사용자는 컴퓨터가 선택한 수를 맞혀야 한다.
		//사용자가 입력한 수가 컴퓨터가 선택한 수보다 크다면
		//컴퓨터는 작은 숫자를 입력해 주세요!라고 출력하고
		//사용자가 입력한 수가 컴퓨터가 선택한 수보다 작다면
		//컴퓨터는 큰 숫자를 입력해 주세요!라고 출력하세요.
		Random random = new Random();
		Scanner sca = new Scanner(System.in);
		
		int answer = random.nextInt(100) + 1;
		int userAns;
		
		System.out.print("1 ~ 100 사이의 정수를 입력해 주세요: ");
		userAns = sca.nextInt();
		
		for (int i = 1; i < 5; i++) {
			if (0 < (userAns - answer) && (userAns - answer) <= 5) {
				System.out.println("Down");
				System.out.println("근접한 숫자입니다");
				userAns = sca.nextInt();
			}
			else if (0 > (userAns - answer) && (userAns - answer) >= -5) {
				System.out.println("Up");
				System.out.println("근접한 숫자입니다");
				userAns = sca.nextInt();
			}
			else {
				if (userAns == answer) {
					System.out.println("정답입니다!");
					break;
				}
				else if (userAns > answer) {
					System.out.println("Down");
					System.out.println("남은 횟수: " + (5-i));
					userAns = sca.nextInt();
				}
				else {
					System.out.println("Up");
					System.out.println("남은 횟수: " + (5-i));
					userAns = sca.nextInt();
				}
			}
		}
		
		if (userAns != answer) {
			System.out.println("시도 횟수를 초과하였습니다.");
			System.out.println("정답: " + answer);
		}
	}
}

package project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirtyOne {
	public static void main(String[] args) {
		//사용자와 컴퓨터가 서로 숫자를 부른다.
		//숫자는 한 번에 최소 1개에서 최대 3개까지 부를 수 있다.
		//1부터 시작해서 1씩 증가시키면서 불러야 한다.
		//31을 부르게 되면 게임에서 진다.
		
		//1. 누가 먼저 할지 결정
		//2. 먼저 하는 쪽이 숫자를 부른다.
		//3. 숫자는 한 번에 입력해야 한다.
		
		Scanner sca = new Scanner(System.in);
		Random random = new Random();
		
		boolean turn = true;
		
		while(true) {
			System.out.println("누가 먼저 할까요?\n 1. 사용자\n 2. 컴퓨터");
			int a = sca.nextInt();
			if (a == 1) {
				//사용자가 먼저
				System.out.println("사용자가 먼저 시작합니다.");
				break;
			}
			else if (a == 2) {
				//컴퓨터가 먼저
				System.out.println("컴퓨터가 먼저 시작합니다.");
				turn = false;
				break;
			}
			else {
				System.out.println("선택지는 1, 2뿐입니다.");
			}
		}
		
		System.out.println("== Game Start ==");
		
		while(true) {
			if(turn) {
				//사용자 차례
				System.out.println("사용자의 차례입니다.");
				System.out.println("최대 3개의 숫자를 띄어쓰기 간격을 두고 입력해 주세요");
				
				String user = sca.nextLine();
				String[] users = user.split(" ");
				
				System.out.println("user = " + Arrays.toString(users));
				
				if(users.length == 0 || user.length() > 3) {
					System.out.println("숫자는 적어도 하나 이상, 최대 3개까지만 말할 수 있습니다.");
				} else {
					break;
				}
			}
			else {
				//컴퓨터 차례
			}
			
			turn =! turn;
		}
		
	}
}

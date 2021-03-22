package chapter3;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		char repeat;
		while(true) {
			System.out.println("1번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("2번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("3번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("4번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("5번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("6번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("7번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("8번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("9번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			System.out.println("10번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				continue; //반복문의 처음으로 올라감
			}
			if(repeat != 'y') {
				break;
			}
			
		} //while end
		
		//위 코드 단순화
		int number = 1;
		while(number <= 10) {
			System.out.println(number + "번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = sca.next().charAt(0);
			if(repeat == 'y') {
				//다시 처음부터 재생
				number = 1;
				continue; //반복문의 처음으로 올라감
			}
			number++;
		}
	}
}

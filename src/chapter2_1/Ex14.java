package chapter2_1;

public class Ex14 {
	public static void main(String[] args) {
		String[] nameArr = {"김철수", "고영희", "권상태", "이신혁", "윤경원"};
		int[] ageArr = {16, 16, 16, 16, 16};
		String[] addArr = {
				"부산광역시 연제구 연산동", 
				"부산광역시 부산진구 부암동", 
				"부산광역시 동구 수정동",
				"부산광역시 동구 영주동", 
				"부산광역시 남구 우암동"
			};
		int[] korArr = {51, 87, 53, 79, 28};
		int[] engArr = {8, 76, 72, 26, 13};
		int[] matArr = {86, 88, 87, 33, 7};
		
		//정수를 저장하기 위한 데이터 타입이 있고
		int korScore = 51;
		//정수들을 저장하기 위한 데이터 타입이 있는 것처럼
		int[] korScores = {51, 87};
		//정보를 저장할 수 있는 데이터 타입, 즉 클래스가 있음
		//정보를 저장하기 위한 데이터 타입은 자바가 제공해 주지 않음
		//우리가 직접 만들어야 함
		
		//<클래스>
		//1. 클래스 선언
		//2. 인스턴스 생성
		//3. 데이터 저장
		/*
		 * class 클래스명 {
		 * 		데이터타입 변수명1;
		 * 		데이터타입 변수명2;
		 * 	}
		 */
		class Student {
			String name;
			int age;
			String addr;
			int kor;
			int eng;
			int mat;
		}
		

		
	}
}

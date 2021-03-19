package chapter2_1;

import java.util.Arrays;

public class Ex24 {
	public static void main(String[] args) {
		int num1 = 10;
		
		int[] arr1 = new int[2];
		arr1[0] = num1;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		num1++;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("=================");
		
		//Student에 김철수 저장
		student Student = new student();
		Student.name = "김철수";
		
		//배열 선언 후 0번 배열에 김철수가 저정된 Student 저장(메모리 주소를 복사해서 넣은 것)
		student[] studentList = new student[2];
		studentList[0] = Student;
		
		System.out.println(Student.name);
		System.out.println(studentList[0].name);
		
		//수정하면 둘 다 바뀜
		Student.name = "고영희";
		
		System.out.println(Student.name);
		System.out.println(studentList[0].name);
	}

}

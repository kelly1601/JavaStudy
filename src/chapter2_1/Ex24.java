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
		
		//Student�� ��ö�� ����
		student Student = new student();
		Student.name = "��ö��";
		
		//�迭 ���� �� 0�� �迭�� ��ö���� ������ Student ����(�޸� �ּҸ� �����ؼ� ���� ��)
		student[] studentList = new student[2];
		studentList[0] = Student;
		
		System.out.println(Student.name);
		System.out.println(studentList[0].name);
		
		//�����ϸ� �� �� �ٲ�
		Student.name = "����";
		
		System.out.println(Student.name);
		System.out.println(studentList[0].name);
	}

}

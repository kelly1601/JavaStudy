package chapter2_1;

public class Ex23 {
	public static void main(String[] args) {
		student student1 = new student();
		student1.name = "����";
		student1.addr = "�λ걤���� �λ����� �߾Ӵ��";
		
		student student2 = new student();
		student2.name = "��ö��";
		student2.addr = "�λ걤���� ���� �������";
		
		student[] studentList = new student[5];
		
		studentList[0] = new student();
		studentList[1] = student1;
		studentList[2] = new student();
		studentList[3] = student2;
		studentList[4] = new student();
		
		studentList[3].addr = "�λ걤���� �λ����� ��õ��"; //�̻� ��
	}

}

package chapter2_1;

public class Ex23 {
	public static void main(String[] args) {
		student student1 = new student();
		student1.name = "고영희";
		student1.addr = "부산광역시 부산진구 중앙대로";
		
		student student2 = new student();
		student2.name = "이철수";
		student2.addr = "부산광역시 남구 전포대로";
		
		student[] studentList = new student[5];
		
		studentList[0] = new student();
		studentList[1] = student1;
		studentList[2] = new student();
		studentList[3] = student2;
		studentList[4] = new student();
		
		studentList[3].addr = "부산광역시 부산진구 범천동"; //이사 후
	}

}

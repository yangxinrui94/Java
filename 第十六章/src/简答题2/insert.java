package 简答题2;

import java.util.Scanner;

public class insert {
	static void insertStudent() {
		Student stu = new Student();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		stu.name = input.next();
		System.out.println("请输入学生年龄：");
		stu.age = input.nextInt();
		System.out.println("请输入学生性别：");
		stu.sex = input.next().charAt(0);
		System.out.println("请输入学生学校：");
		stu.school = input.next();
		System.out.println("将该学生信息成功写入到数据库");
		System.out.println(stu.name + "  " + stu.age + "  " + stu.sex + "  "
				+ stu.school);
	}

	public static void main(String[] args) {
		insertStudent();

	}
}

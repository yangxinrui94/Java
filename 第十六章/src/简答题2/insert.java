package �����2;

import java.util.Scanner;

public class insert {
	static void insertStudent() {
		Student stu = new Student();
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ��������");
		stu.name = input.next();
		System.out.println("������ѧ�����䣺");
		stu.age = input.nextInt();
		System.out.println("������ѧ���Ա�");
		stu.sex = input.next().charAt(0);
		System.out.println("������ѧ��ѧУ��");
		stu.school = input.next();
		System.out.println("����ѧ����Ϣ�ɹ�д�뵽���ݿ�");
		System.out.println(stu.name + "  " + stu.age + "  " + stu.sex + "  "
				+ stu.school);
	}

	public static void main(String[] args) {
		insertStudent();

	}
}

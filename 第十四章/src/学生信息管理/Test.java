package 学生信息管理;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StuManager a = new StuManager();
		a.addStu();
		a.show();
		a.Max();
		a.Min();
		a.Avg();
		System.out.print("请输入要查找的姓氏：");
		String name = input.next();
		a.getInfo(name);

	}
}

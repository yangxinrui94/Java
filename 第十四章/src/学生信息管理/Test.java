package ѧ����Ϣ����;

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
		System.out.print("������Ҫ���ҵ����ϣ�");
		String name = input.next();
		a.getInfo(name);

	}
}

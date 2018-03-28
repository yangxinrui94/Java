import java.util.Scanner;

public class StudentBiz {
	Scanner input = new Scanner(System.in);
	String[] names = new String[5];
	int i;

	void addName(String name) {
		for (i = 0; i < names.length; i++) {
			System.out.print("请输入客户姓名：");
			names[i] = input.next();
		}
	}

	void show() {
		System.out.println("*********************************\n");
		System.out.println("\t\t客户姓名列表：");
		System.out.println("*********************************\n");
		for (i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
	}

	void revise(String name1, String newName) {
		int index = 0;
		System.out.print("\n请输入修改的客户姓名：");
		name1 = input.next();
		System.out.print("\n请输入新的客户姓名：");
		newName = input.next();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name1)) {
				index = i;
				break;
			}
		}

		names[index] = newName;
		System.out.println("修改后的客户姓名表为：");
		for (i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
	}
}

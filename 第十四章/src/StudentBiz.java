import java.util.Scanner;

public class StudentBiz {
	Scanner input = new Scanner(System.in);
	String[] names = new String[5];
	int i;

	void addName(String name) {
		for (i = 0; i < names.length; i++) {
			System.out.print("������ͻ�������");
			names[i] = input.next();
		}
	}

	void show() {
		System.out.println("*********************************\n");
		System.out.println("\t\t�ͻ������б�");
		System.out.println("*********************************\n");
		for (i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
	}

	void revise(String name1, String newName) {
		int index = 0;
		System.out.print("\n�������޸ĵĿͻ�������");
		name1 = input.next();
		System.out.print("\n�������µĿͻ�������");
		newName = input.next();
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name1)) {
				index = i;
				break;
			}
		}

		names[index] = newName;
		System.out.println("�޸ĺ�Ŀͻ�������Ϊ��");
		for (i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
	}
}

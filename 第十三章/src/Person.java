import java.util.Scanner;

public class Person {
	Scanner input = new Scanner(System.in);
	String name;
	int score = 0;

	int showFist() {
		System.out.print("���ȭ��1.���� 2.ʯͷ 3.��(��������Ӧ���֣�)");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("���ȭ: ����");
			break;
		case 2:
			System.out.println("���ȭ: ʯͷ");
			break;
		case 3:
			System.out.println("���ȭ: ��");
			break;
		default:
			System.out.println("�����������������룺");
			break;
		}
		return num;
	}
}

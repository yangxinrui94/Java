import java.util.Scanner;

public class Game {
	Scanner input = new Scanner(System.in);
	Person person = new Person();
	Computer computer = new Computer();
	int count = 0;

	void Start() {
		System.out.println("-----------��ӭ������Ϸ����-----------");
		System.out.println("\t******************");
		System.out.println("\t**    ��ȭ����ʼ          **");
		System.out.println("\t******************");
		System.out.println("\n��ȭ����1.���� 2.ʯͷ 3.��");
		System.out.print("��ѡ��Է���ɫ��(1.���� 2.��Ȩ 3.�ܲ�):");
		int num = input.nextInt();
		System.out.print("�������������֣�");
		person.name = input.next();
		switch (num) {
		case 1:
			computer.name = "����";
			break;
		case 2:
			computer.name = "��Ȩ";
			break;
		case 3:
			computer.name = "�ܲ�";
			break;
		}
		System.out.println(computer.name + " VS " + person.name + "\n");
		System.out.println("Ҫ��ʼ����(y/n)");
		String answer = input.next();
		int perNum;
		int comNum;
		while (answer.equals("y")) {
			perNum = person.showFist();
			comNum = computer.showFist();
			if (perNum == comNum) {
				System.out.println("�����ƽ�֣���˥��\n");
				count++;
			} else if (perNum == 1 && comNum == 2 || perNum == 2 && comNum == 3
					|| perNum == 3 && comNum == 1) {
				System.out.println("�����^_^�������ˣ��汿��\n");
				computer.score++;
				count++;
			} else {
				System.out.println("�������ϲ����Ӯ�ˣ�");
				person.score++;
				count++;
			}
			System.out.println("�Ƿ�ʼ��һ��?(y/n)");
			answer = input.next();
		}
		System.out.println("---------------------------------");
		System.out.println(computer.name + " VS " + person.name);
		System.out.println("��ս������" + count);
		System.out.println(computer.score + "    " + person.score);
		if (computer.score > person.score) {
			System.out.println("�����������ˣ�����");
		} else if (computer.score == person.score) {
			System.out.println("ƽ�֣��б�������������");
		} else {
			System.out.println("��С�ӻ����������ϲ�㣬��Ӯ�ˣ�����");
		}
	}

}

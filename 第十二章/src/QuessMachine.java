import java.util.Scanner;

public class QuessMachine {
	Scanner input = new Scanner(System.in);

	void Guess() {
		String name = "";
		int price = 0;
		int num = (int) (1 + Math.random() * 5);
		switch (num) {
		case 1:
			name = "���ӻ�";
			price = 4500;
			break;
		case 2:
			name = "�����";
			price = 3000;
			break;

		case 3:
			name = "�綯��";
			price = 2000;
			break;

		case 4:
			name = "�ʼǱ�";
			price = 4800;
			break;

		case 5:
			name = "ϴ�»�";
			price = 1000;
			break;

		}
		System.out.print("��²�" + name + "�ļ۸�");
		for (int i = 4; i >= 0; i--) {
			int money = input.nextInt();
			if (i == 0) {
				System.out.println("4����û�в¶ԣ��´�Ŭ���ɣ�");
				break;
			}
			if (money == price) {
				System.out.println("��ϲ�����" + name);
				break;
			} else if (money > price) {
				System.out.println("���˵㣬������");
				System.out.print("�ٲ�һ�ΰɣ�");
			} else if (money < price) {
				System.out.println("С�˵㣬������");
				System.out.print("�ٲ�һ�ΰɣ�");

			}
			
		}

	}
}

import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);

	void cun(int num, double money) {
		double newMoney = 0;
		while (num != 0) {
			System.out.println("1.��� 2.ȡ�� 0.�˳�");
			System.out.print("��ѡ����Ҫ�����ҵ��");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("���������");
				money = input.nextDouble();
				newMoney += money;
				break;
			case 2:
				System.out.print("������ȡ���");
				money = input.nextDouble();
				while (money > newMoney) {
					System.out.print("���ã������������������룺");
					money = input.nextDouble();
				}
				newMoney -= money;

				break;
			default:
				System.out.print("����������������룺");
				num = input.nextInt();
				break;
			}

			System.out.print("***��ǰ���Ϊ��" + newMoney + "Ԫ*********\n");

		}
		System.out.println("ллʹ�ã�");
	}
}

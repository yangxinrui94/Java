import java.util.Scanner;

public class �����5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 2; i >= 0; i--) {
			System.out.print("���������룺");
			int password = input.nextInt();
			if (password == 111111) {
				System.out.print("�������");
				double money = input.nextDouble();
				for (int j = 0; j < 3; j++) {
					if (money % 100 == 0 && money <= 1000) {
						System.out.print("��ȡ�ˣ�" + money);
						System.out.println("\n������ɣ���ȡ����");
						break;
					} else {
						System.out.print("��������Ľ��Ϸ������������룺");
						money = input.nextDouble();
						if (money % 100 == 0 && money <= 1000) {
							System.out.println("��ȡ�ˣ�" + money);
							System.out.println("������ɣ���ȡ����");
							break;

						}
					}

				}

				break;
			}

			if (i == 0) {
				System.out.println("���������ȡ����");
			}

		}

	}
}

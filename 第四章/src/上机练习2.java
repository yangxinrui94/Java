import java.util.Scanner;

public class �ϻ���ϰ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ�");
		double money = input.nextDouble();
		System.out.println("�Ƿ�μӻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.println("��ѡ��");
		int num = input.nextInt();
		if (money >= 200) {
			switch (num) {
			case 1:
				System.out.println(money + 2);
				System.out.println("���¿�������1ƿ");
				break;
			case 2:
				System.out.println(money + 3);
				System.out.println("500ml����һƿ");
				break;
			case 3:
				System.out.println(money + 10);
				System.out.println("5�������");
				break;
			case 4:
				System.out.println(money + 10);
				System.out.println("1���ղ������˹�");
				break;
			case 5:
				System.out.println(money + 20);
				System.out.println("ŷ����ˬ��ˮһƿ");
				break;
			default:
				System.out.println(money);
				System.out.println("������");
				break;
			}
		} else if (money >= 100) {
			switch (num) {

			case 1:
				System.out.println(money + 2);
				System.out.println("���¿�������1ƿ");
				break;
			case 2:
				System.out.println(money + 3);
				System.out.println("500ml����һƿ");
				break;
			case 3:
				System.out.println(money + 10);
				System.out.println("5�������");
				break;
			default:
				System.out.println(money);
				System.out.println("������");
				break;
			}
		} else if (money >= 50) {
			switch (num) {
			case 1:
				System.out.println(money + 2);
				System.out.println("���¿�������1ƿ");
				break;

			default:
				System.out.println(money);
				System.out.println("������");
				break;

			}

		}

	}

}


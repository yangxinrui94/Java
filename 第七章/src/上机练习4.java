import java.util.Scanner;

public class �ϻ���ϰ4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0;
		System.out.println("����������Ϸƽ̨> ��Ϸ�����\n");
		for (int i = 1; i < 5; i++) {
			System.out.print("�������" + i + "����Ϸ�ĵ���ʣ�");
			int num = input.nextInt();

			if (num > 100) {

				a++;

				continue;
			}

		}

		System.out.println("����ʴ���100����Ϸ���ǣ�" + a);
		System.out.println("����ʴ���100����Ϸ��ռ�ı���Ϊ��" + (a / 4.0 * 100) + "%");

	}
}

import java.util.Scanner;

public class �����4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ĳ��е��·ݣ�1~12");
		int month = input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		int No = input.nextInt();
		if (No == 1) {
			switch (month) {
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("���Ļ�Ʊ�۸�Ϊ" + 5000 * 0.9);

				break;
			default:
				System.out.println("���Ļ�Ʊ�۸�Ϊ" + 5000 * 0.5);
				break;
			}

		} else if (No == 2) {
			switch (month % 10) {
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 0:
				System.out.println("���Ļ�Ʊ�۸�Ϊ" + 5000 * 0.8);
				break;

			default:
				System.out.println("���Ļ�Ʊ�۸�Ϊ" + 5000 * 0.4);
				break;
			}
		}

	}
}

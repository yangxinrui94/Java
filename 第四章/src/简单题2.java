import java.util.Scanner;


public class ����2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ���");
		int num = input.nextInt();
		switch (num) {
		case 1:
		case 3:
		case 5:
			System.out.println("ѧϰ���");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("ѧϰӢ��");
			break;

		default:
			System.out.println("��Ϣ");
			break;
		}
	}
}

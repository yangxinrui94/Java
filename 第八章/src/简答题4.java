import java.util.Scanner;


public class �����4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num[] = new int[10];
		int a = 0, b = 0, c = 0;
		System.out.println("������10����");
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
			switch (num[i]) {
			case 1:
				a++;
				break;
			case 2:
				b++;
				break;
			case 3:
				c++;
				break;

			default:
				break;
			}
		}
		System.out.println("����1 �ĸ�����"+a);
		System.out.println("����2 �ĸ�����"+b);
		System.out.println("����3 �ĸ�����"+c);
		System.out.println("�Ƿ����ֵĸ�����"+(10-a-b-c));
	}
}

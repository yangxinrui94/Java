import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ����������");
		double a = 0, b = 0, d = 0;
		if (input.hasNextDouble() == true) {
			a = input.nextDouble();
		} else {
			System.out.println("��������ȷ�����֣�");
		}

		System.out.print("������ڶ�����������");
		if (input.hasNextDouble() == true) {
			b = input.nextDouble();
		} else {
			System.out.println("��������ȷ�����֣�");
		}
		System.out.print("���������㷽ʽ");
		char c = input.next().charAt(0);
		switch (c) {
		case '+':
			d = a + b;
			break;
		case '-':
			d = a - b;
			break;
		case '*':
			d = a * b;
			break;
		case '/':
			d = a / b;
			break;

		}
		System.out.println("������:"+a+c+b+"="+d);

	}
}

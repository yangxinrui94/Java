import java.util.Scanner;

public class �����5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ����������");
		double a = 0, b = 0, d = 0;
		if (input.hasNextDouble() == true) {
			a = input.nextDouble();
		} else {
			System.out.println("��������ȷ�����֣�");
		}

		System.out.println("������ڶ�����������");
		if (input.hasNextDouble() == true) {
			b = input.nextDouble();
		} else {
			System.out.println("��������ȷ�����֣�");
		}
		System.out.println("���������㷽ʽ");
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

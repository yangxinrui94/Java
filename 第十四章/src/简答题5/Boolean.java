package �����5;

import java.util.Scanner;

public class Boolean {
	Scanner input = new Scanner(System.in);

	boolean isTriangle(int a, int b, int c) {
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
		}
		return false;
	}

	String shape(int a, int b, int c) {
		String shape = "";
		if ((a * a == b*b + c*c) || (b * b == a*a + c*c) || (c * c == a*a+ b*b)) {
			shape = "ֱ��";
			return shape;
		}
		if ((a * a > b * b + c * c) || (b * b > a * a + c * c)
				|| (c * c > a * a + b * b)) {
			shape = "�۽�";
			return shape;
		}
		shape = "���";
		return shape;
	}

	void show() {
		int a;
		int b;
		int c;
		String answer = "y";
		while (answer.equals("y")) {
			System.out.print("�������һ���ߣ�");
			a = input.nextInt();
			System.out.print("������ڶ����ߣ�");
			b = input.nextInt();
			System.out.print("������������ߣ�");
			c = input.nextInt();
			if (isTriangle(a, b, c)) {
				System.out.println(shape(a, b, c));
			} else {
				System.out.println("�ⲻ�ܹ��������Ρ�");
			}
			System.out.print("������(y/n)");
			answer = input.next();
		}

	}

}

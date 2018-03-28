package 简答题5;

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
			shape = "直角";
			return shape;
		}
		if ((a * a > b * b + c * c) || (b * b > a * a + c * c)
				|| (c * c > a * a + b * b)) {
			shape = "钝角";
			return shape;
		}
		shape = "锐角";
		return shape;
	}

	void show() {
		int a;
		int b;
		int c;
		String answer = "y";
		while (answer.equals("y")) {
			System.out.print("请输入第一条边：");
			a = input.nextInt();
			System.out.print("请输入第二条边：");
			b = input.nextInt();
			System.out.print("请输入第三条边：");
			c = input.nextInt();
			if (isTriangle(a, b, c)) {
				System.out.println(shape(a, b, c));
			} else {
				System.out.println("这不能构成三角形。");
			}
			System.out.print("继续吗？(y/n)");
			answer = input.next();
		}

	}

}

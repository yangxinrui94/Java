import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个操作数：");
		double a = 0, b = 0, d = 0;
		if (input.hasNextDouble() == true) {
			a = input.nextDouble();
		} else {
			System.out.println("请输入正确的数字！");
		}

		System.out.print("请输入第二个操作数：");
		if (input.hasNextDouble() == true) {
			b = input.nextDouble();
		} else {
			System.out.println("请输入正确的数字！");
		}
		System.out.print("请输入运算方式");
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
		System.out.println("计算结果:"+a+c+b+"="+d);

	}
}

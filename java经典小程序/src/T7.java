import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0, sum = 0;
		System.out.print("请输入一个1~9的数：");
		a = input.nextInt();
		System.out.print("请输入项数：");
		int b = input.nextInt();
		int a1 = a;
		if (a > 0 || a < 10) {
			for (int i = 1; i <= b; i++) {
				sum += a;
				a = 10 * a + a1;
			}

		}

		System.out.println(sum);
	}
}

import java.util.Scanner;

public class 简答题6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入菱形行数：");
		int rows = input.nextInt();
		while (rows % 2 == 0) {
			System.out.print("请输入奇数：");
			rows = input.nextInt();
		}
		int n = (rows + 1) / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");

			}
			System.out.println();

		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = i; k < rows - i - 2; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}

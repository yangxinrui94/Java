import java.util.Scanner;

public class 上机练习3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入直角三角形的行数：");
		int rows = input.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

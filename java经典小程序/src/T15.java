import java.util.Scanner;

public class T15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈëĞĞÊı£º");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j > i - 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}

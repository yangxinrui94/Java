import java.util.Scanner;

public class �ϻ���ϰ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ֱ�������ε�������");
		int rows = input.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

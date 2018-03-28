import java.util.Scanner;

public class T16 {
	static boolean isZhiShu(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个偶数：");
		int N = input.nextInt();
		for (int i = 2; i < N; i++) {
			if (isZhiShu(i) && isZhiShu(N - i)) {
				System.out.println(N + "=" + i + "+" + (N - i));
			}
		}

	}
}

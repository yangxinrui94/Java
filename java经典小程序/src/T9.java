public class T9 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 3; i >= 0; i--) {
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

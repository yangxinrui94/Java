public class �����3 {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 0; i < 20; i++) {
			for (j = 0; j < 33; j++) {
				k = 100 - i - j;
				if (5 * i + 3 * j + k / 3 == 100 && k%3 == 0) {
					System.out.println("������" + i + "ĸ����" + j + "������" + k);

				}
			}
		}

	}
}

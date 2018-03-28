public class สýื้6 {
	public static void main(String[] args) {
		int[] a = new int[100];
		int[] b = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (1000 + Math.random() * 9000);
			if (a[i] % 10 == 0) {
				b[0] = a[i];
			}
			if (a[i] % 10 == 1) {
				b[1] = a[i];
			}
			if (a[i] % 10 == 2) {
				b[2] = a[i];

			}
			if (a[i] % 10 == 3) {
				b[3] = a[i];

			}
			if (a[i] % 10 == 4) {
				b[4] = a[i];

			}
			if (a[i] % 10 == 5) {
				b[5] = a[i];

			}
			if (a[i] % 10 == 6) {
				b[6] = a[i];

			}
			if (a[i] % 10 == 7) {
				b[7] = a[i];

			}
			if (a[i] % 10 == 8) {
				b[8] = a[i];

			}
			if (a[i] % 10 == 9) {
				b[9] = a[i];

			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] );
		}

	}
}

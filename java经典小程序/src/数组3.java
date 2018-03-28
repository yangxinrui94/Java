public class 数组3 {
	public static void main(String[] args) {
		int[] arr = new int[40];
		int sum = 0, a = 0, b = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (1 + Math.random() * 100);
			System.out.print(arr[i] + "\t");
			b++;
			if (b == 4) {
				System.out.println();
				b = 0;
			}

			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < (sum / 40)) {
				a++;
			}
		}
		System.out.println("\n低于平均分人数：" + a);

	}
}

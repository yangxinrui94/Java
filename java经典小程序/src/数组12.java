import java.util.Random;

public class สýื้12 {
	static boolean isZhiShu(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(1000);
			if (isZhiShu(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
}

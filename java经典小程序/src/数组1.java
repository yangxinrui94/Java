import java.util.Arrays;

public class 数组1 {
	public static void main(String[] args) {
		double sum = 0.0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (0 + Math.random() * 9999);
			System.out.print(arr[i] + "\t");
			sum += arr[i];
		}
		int min = arr[0];
		int max = arr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("最大值：" + max + "最小值：" + min + "和值：" + sum + "平均值："
				+ sum / 10);
		System.out.println("升序排列：");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("最大值：" + arr[9] + "最小值：" + arr[0] + "和值：" + sum
				+ "平均值：" + sum / 10);
	}
}

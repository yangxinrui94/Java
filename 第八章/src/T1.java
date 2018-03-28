import java.util.Scanner;


public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int i, a = 0;
		boolean b = false;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			a = a + arr[i];
		}
		System.out.println(a);
		System.out.print("请输入一个数：");
		int num = input.nextInt();
		for (int j = 0; j < arr.length; j++) {

			if (arr[j] == num) {
				b = true;
			}
		}
		if (b) {
			System.out.println("包含");
		} else {
			System.out.println("不包含");
		}

	}
}

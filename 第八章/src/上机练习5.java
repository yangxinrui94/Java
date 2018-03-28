import java.util.Scanner;

public class 上机练习5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] prices = new double[4];
		int i = 0;
		double min = 0;

		System.out.println("请输入4家店的价格");
		for (i = 0; i < prices.length; i++) {
			System.out.print("第" + (i + 1) + "店的价格：");
			prices[i] = input.nextDouble();
			if (i == 0) {
				min = prices[i];
			}
			if (prices[i] < min && prices[i] != 0) {
				min = prices[i];
				continue;
			}

		}

		System.out.println("最低价格是：" + min);
	}
}

import java.util.Scanner;

public class �ϻ���ϰ5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] prices = new double[4];
		int i = 0;
		double min = 0;

		System.out.println("������4�ҵ�ļ۸�");
		for (i = 0; i < prices.length; i++) {
			System.out.print("��" + (i + 1) + "��ļ۸�");
			prices[i] = input.nextDouble();
			if (i == 0) {
				min = prices[i];
			}
			if (prices[i] < min && prices[i] != 0) {
				min = prices[i];
				continue;
			}

		}

		System.out.println("��ͼ۸��ǣ�" + min);
	}
}

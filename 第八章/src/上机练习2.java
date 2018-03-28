import java.util.Scanner;

public class 上机练习2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] pays = new double[5];
		double a = 0.0;
		System.out.println("请输入会员本月的消费记录");
		for (int i = 0; i < pays.length; i++) {
			System.out.print("请输入第" + (i + 1) + "笔购物金额：");
			pays[i] = input.nextDouble();
			a = a + pays[i];
		}
		System.out.println("序号\t\t金额(元)");

		for (int j = 0; j < pays.length; j++) {
			System.out.println((j + 1) + "\t\t" + pays[j] + "");

		}
		System.out.println("总金额\t\t" + a);
	}
}

import java.util.Scanner;

public class 简答题5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 2; i >= 0; i--) {
			System.out.print("请输入密码：");
			int password = input.nextInt();
			if (password == 111111) {
				System.out.print("请输入金额：");
				double money = input.nextDouble();
				for (int j = 0; j < 3; j++) {
					if (money % 100 == 0 && money <= 1000) {
						System.out.print("您取了：" + money);
						System.out.println("\n交易完成，请取卡！");
						break;
					} else {
						System.out.print("您输入金额的金额不合法，请重新输入：");
						money = input.nextDouble();
						if (money % 100 == 0 && money <= 1000) {
							System.out.println("您取了：" + money);
							System.out.println("交易完成，请取卡！");
							break;

						}
					}

				}

				break;
			}

			if (i == 0) {
				System.out.println("密码错误，请取卡！");
			}

		}

	}
}

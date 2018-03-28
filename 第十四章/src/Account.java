import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);

	void cun(int num, double money) {
		double newMoney = 0;
		while (num != 0) {
			System.out.println("1.存款 2.取款 0.退出");
			System.out.print("请选择你要办理的业务：");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("请输入存款金额：");
				money = input.nextDouble();
				newMoney += money;
				break;
			case 2:
				System.out.print("请输入取款金额：");
				money = input.nextDouble();
				while (money > newMoney) {
					System.out.print("您好，您的余额不足请重新输入：");
					money = input.nextDouble();
				}
				newMoney -= money;

				break;
			default:
				System.out.print("输入错误，请重新输入：");
				num = input.nextInt();
				break;
			}

			System.out.print("***当前余额为：" + newMoney + "元*********\n");

		}
		System.out.println("谢谢使用！");
	}
}

import java.util.Scanner;

public class 练习5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y";
		String name = "", name1 = "";
		String password = "", password1 = "";
		int cardNum1 = (int) (1000 + Math.random() * 9000);
		int[] arr = new int[5];
		while (answer.equals("y")) {
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("\t\t1.注册");
			System.out.println("\t\t2.登录");
			System.out.println("\t\t3.抽奖");
			System.out.println("************************");
			System.out.print("请选择菜单：");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("[奖客富翁系统>注册]");
				System.out.println("请填写个人注册信息：");
				System.out.print("用户名：");
				name = input.next();
				System.out.print("密码：");
				password = input.next();
				System.out.println("\n注册成功，请记好您的会员卡号");
				System.out.println("用户名\t密码\t会员卡号");
				System.out.println(name + "\t" + password + "\t" + cardNum1);
				break;
			case 2:
				for (int i = 2; i >= 0; i--) {
					System.out.println("[奖客富翁系统>登录]");
					System.out.print("请输入用户名：");
					name1 = input.next();
					System.out.print("请输入密码：");
					password1 = input.next();
					if (name.equals(name1) && password.equals(password1)) {
						System.out.println("欢迎您：" + name);
						break;
					} else {
						System.out.println("用户名或密码错误！还剩下" + i + "次机会");
					}

				}

				break;
			case 3:
				System.out.println("[奖客富翁系统>抽奖]");
				boolean flag = false;
				System.out.print("请输入您的卡号：");
				cardNum1 = input.nextInt();
				System.out.println("\n本日的幸运数字为：");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = (int) (1000 + Math.random() * 9000);
					System.out.print(arr[i] + "\t");
					if (arr[i] == cardNum1) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("\n恭喜您是今天的幸运会员！");
				} else {
					System.out.println("\n抱歉！您不是今天的幸运会员！");
				}
				break;

			}
			System.out.print("继续吗?(y/n)");
			answer = input.next();

		}
		System.out.println("系统退出，谢谢使用！");
	}
}

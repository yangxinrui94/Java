import java.util.Scanner;


public class StartSMS {
	Scanner input = new Scanner(System.in);

	void LoginMenu() {
		System.out.println("\n\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t 1. 登 录 系 统\n");
		System.out.println("\t\t 2. 退 出\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.print("请输入用户名：");
			String name = input.next();
			System.out.print("请输入密码：");
			String pwd = input.next();
			if (name.equalsIgnoreCase("JadeBird") && pwd.equals("0000")) {
			System.out.println("@@登录成功："+name+"@@");
			MainMenu() ;
			}else {
			System.out.println("@@您没有权限进入系统，请重新登录。@@");
			LoginMenu();
			}
			break;
		case 2:
			System.out.println("退出，谢谢使用！");
			break;
		default:
			System.out.println("输入有误，请重新输入！");
			LoginMenu();
			break;
		}
	}

	void MainMenu() {
		System.out.println("\n\t我行我素购物管理系统主菜单\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t 1. 客 户 信 息 管 理\n");
		System.out.println("\t\t 2. 真 情 回 馈\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或按0返回上一级菜单:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			CustMenu();
			break;
		case 2:
			SendGMenu();
			break;
		case 0:
			LoginMenu();
			break;
		default:
			System.out.println("输入有误，请重新输入！");
			MainMenu();
			break;
		}
	}

	void CustMenu() {
		System.out.println("\n\t我行我素购物管理系统 > 客户信息管理");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t 1. 显 示 所 有 客 户 信 息\n");
		System.out.println("\t\t 2. 添 加 客 户 信 息\n");
		System.out.println("\t\t 3. 修 改 客 户 信 息\n");
		System.out.println("\t\t 4. 查 询 客 户 信 息\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或按0返回上一级菜单:");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("执行了显 示 所 有 客 户 信 息");
			break;
		case 2:
			System.out.println("执行了添 加 客 户 信 息");
			break;
		case 3:
			System.out.println("执行了修 改 客 户 信 息");
			break;
		case 4:
			System.out.println("执行了查 询 客 户 信 息");
			break;
		case 0:
			MainMenu();
			break;
		default:
			System.out.println("输入有误，请重新输入！");
			CustMenu();
			break;
		}
	}

	void SendGMenu() {
		System.out.println("\n\t我行我素购物管理系统 > 真情回馈");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t 1. 幸 运 大 放 送\n");
		System.out.println("\t\t 2. 幸 运 抽 奖\n");
		System.out.println("\t\t 3. 生 日 问 候\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("执行了 幸 运 大 放 送");
			break;
		case 2:
			System.out.println("执行了幸 运 抽 奖");
			break;
		case 3:
			System.out.println("执行了生 日 问 候");
			break;
		case 0:
			MainMenu();
			break;
		default:
			System.out.println("输入有误，请重新输入！");
			SendGMenu();
			break;
		}
	}
}

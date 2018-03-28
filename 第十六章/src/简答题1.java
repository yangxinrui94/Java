import java.util.Scanner;

public class 简答题1 {
	static boolean login(String name, String pwd) {
		if (name.equalsIgnoreCase("jbit") && pwd.equalsIgnoreCase("bdqn")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = input.next();
		System.out.println("请输入密码：");
		String pwd = input.next();
		if (login(name, pwd)) {
			System.out.println("登录成功！");
		} else {
			System.out.println("用户名或密码输入错误！");
		}
	}
}

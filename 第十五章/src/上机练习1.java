import java.util.Scanner;

public class 上机练习1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***欢迎进入注册系统***\n\n");
		while (true) {
			System.out.print("请输入用户名");
			String name = input.next();
			System.out.print("请输入密码：");
			String pwd1 = input.next();
			System.out.print("请再次输入密码：");
			String pwd2 = input.next();
			if (name.length() < 3 && pwd1.length() < 6) {
				System.out.println("用户名长度不能小于3，密码长度不能小于6！");
			} else if (name.length() < 3) {
				System.out.println("用户名长度不能小于3");
			} else if (pwd1.length() < 6) {
				System.out.println("密码长度不能小于6！");
			} else if (!(pwd1.equalsIgnoreCase(pwd2))) {
				System.out.println("两次输入密码不相同");
			} else {
				System.out.println("注册成功，请牢记用户名和密码。");
				break;
			}
		}

	}
}

import java.util.Scanner;

public class 上机练习4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Administrator admin = new Administrator();
		admin.name = "admin";
		admin.password = "111111";
		System.out.print("请输入用户名：");
		String nameInput = input.next();
		System.out.print("请输入密码：");
		String passwordInput = input.next();
		if (admin.name.equals(nameInput)
				&& admin.password.equals(passwordInput)) {
			System.out.print("请输入新密码：");
			admin.password = input.next();
			System.out.println("密码修改成功，您的新密码为：" + admin.password);

		} else {
			System.out.println("用户名和密码不匹配！您没有权限修改管理员信息。");
		}
	}
}

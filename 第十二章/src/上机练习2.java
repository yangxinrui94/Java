import java.util.Scanner;


public class 上机练习2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Manager a = new Manager();
		System.out.print("请输入管理员信息用户名：");
		String name = input.next();
		System.out.print("请输入密码：");
		String pwd = input.next();
		a.admain(name, pwd);
	}
}
